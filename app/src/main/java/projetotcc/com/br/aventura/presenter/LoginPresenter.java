package projetotcc.com.br.aventura.presenter;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.Headers;
import projetotcc.com.br.aventura.data.model.Authentication;
import projetotcc.com.br.aventura.data.model.Usuario;
import projetotcc.com.br.aventura.data.network.UsuarioService;
import projetotcc.com.br.aventura.data.repository.UsuarioRepository;
import projetotcc.com.br.aventura.presenter.contract.LoginContract;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by junior on 3/8/18.
 */

public class LoginPresenter implements LoginContract.ViewAction {

    private LoginContract.LoginView view;
    private UsuarioRepository repository;
    private UsuarioService service;
    private Context context;

    public LoginPresenter(Context context) {
        this.repository = UsuarioRepository.getInstance(context);
        this.service = new UsuarioService();
        this.context = context;
    }

    @Override
    public void setView(LoginContract.LoginView view) {
        this.view = view;
    }

    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public void attempLogin(final String email, final String password) {
        showProgress(true);

        if(!errorLogin(email, password)) {
            view.emailError("Invalid login or password");
            view.showProgress(false);
            return;
        }

        Usuario user = new Usuario(email, password);
        Call<Authentication> token = service.getService().getAuthentication(user);
        token.enqueue(new Callback<Authentication>() {
            @Override
            public void onResponse(Call<Authentication> call, Response<Authentication> response) {
                Authentication auth = response.body();

                Toast.makeText(getContext(), "jwt: "+ auth.getToken(), Toast.LENGTH_LONG)
                        .show();
            }

            @Override
            public void onFailure(Call<Authentication> call, Throwable t) {
                Toast.makeText(getContext(), "Deu merda!!", Toast.LENGTH_LONG).show();
            }
        });
        showProgress(false);
    }

    @Override
    public void showProgress(boolean inProgress) {
        view.showProgress(inProgress);
    }

    @Override
    public boolean errorLogin(String email, String password) {
        return email.length() > 1 && password.length() > 1;
    }

}
