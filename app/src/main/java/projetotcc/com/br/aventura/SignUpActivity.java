package projetotcc.com.br.aventura;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import projetotcc.com.br.aventura.presenter.SignUpPresenter;
import projetotcc.com.br.aventura.presenter.contract.SignUpContract;

public class SignUpActivity extends AppCompatActivity implements SignUpContract.View {

    private SignUpContract.ViewAction presenter;
    private SignUpPessoaFisicaFragment pessoaFisicaFragment;
    private SignUpUsuarioFragment usuarioFragment;


    @Override
    protected void onStart() {
        super.onStart();
        presenter = new SignUpPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


    }

    @Override
    public void showProgress(boolean inProgress) {

    }

    @Override
    public void openPessoaFisicaFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        pessoaFisicaFragment  = pessoaFisicaFragment.newInstance();
        ft.replace(R.id.container_sign_up, pessoaFisicaFragment, "PessoaFisica");
        ft.commit();
    }

    @Override
    public void openUsuarioFragment() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        usuarioFragment  = usuarioFragment.newInstance();
        ft.replace(R.id.container_sign_up, usuarioFragment, "Usuario");
        ft.commit();
    }
}
