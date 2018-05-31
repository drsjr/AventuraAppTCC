package projetotcc.com.br.aventura;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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
        openUsuarioFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sign_up_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_next:
                openPessoaFisicaFragment();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);

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
