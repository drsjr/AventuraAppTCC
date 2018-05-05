package projetotcc.com.br.aventura.presenter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import projetotcc.com.br.aventura.R;
import projetotcc.com.br.aventura.SignUpActivity;
import projetotcc.com.br.aventura.data.network.UsuarioService;
import projetotcc.com.br.aventura.presenter.contract.LoginContract;
import projetotcc.com.br.aventura.presenter.contract.SignUpContract;

/**
 * Created by junior on 4/8/18.
 */

public class SignUpPresenter implements SignUpContract.ViewAction {

    private Context context;
    private UsuarioService usuarioService;
    private SignUpContract.ViewAction view;

    public SignUpPresenter(Context context) {
        this.context = context;
        this.usuarioService = new UsuarioService();

    }

    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public void setView(SignUpContract.ViewAction view) {
        this.view = view;
    }

    @Override
    public void showProgress(boolean inProgress) {

    }

    @Override
    public void openPessoaFisicaFragment() {

    }

    @Override
    public void openUsuarioFragment() {

    }
}
