package projetotcc.com.br.aventura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import projetotcc.com.br.aventura.presenter.LoginPresenter;
import projetotcc.com.br.aventura.presenter.contract.LoginContract;

public class LoginActivity extends AppCompatActivity
        implements LoginContract.LoginView, View.OnClickListener {


    private LoginContract.ViewAction presenter;

    // UI references.
    private ProgressBar mProgressBar;
    private EditText mEmailView;
    private EditText mPasswordView;
    private View mLoginFormView;
    private Button mSignIn;
    private Button mSignUp;

    @Override
    protected void onStart() {
        super.onStart();
        presenter = new LoginPresenter(this);
        presenter.setView(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mProgressBar    = (ProgressBar) findViewById(R.id.login_progress);
        mEmailView      = (EditText) findViewById(R.id.login_email);
        mPasswordView   = (EditText) findViewById(R.id.login_password);
        mLoginFormView  = (View) findViewById(R.id.login_form);
        mSignIn         = (Button) findViewById(R.id.login_sign_in_button);
        mSignUp         = (Button) findViewById(R.id.login_sign_up_button);

        mSignIn.setOnClickListener(this);
        mSignUp.setOnClickListener(this);
    }

    @Override
    public void showProgress(boolean inProgress) {
        mProgressBar.setVisibility(inProgress ? View.VISIBLE : View.GONE);
        mLoginFormView.setVisibility(!inProgress ? View.VISIBLE : View.GONE);
    }

    @Override
    public void attemptLogin() {
        presenter.attempLogin(mEmailView.getText().toString(),
                mPasswordView.getText().toString());
    }

    @Override
    public void emailError(String msgError) {
        mEmailView.setError(msgError);
    }

    @Override
    public void closeActivity() {
        this.finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_sign_in_button:
                attemptLogin();
                break;
            case R.id.login_sign_up_button:
                newRegister();
                break;
            default:
                break;
        }
    }

    @Override
    public void newRegister() {
        presenter.newRegisterIntent();
    }
}

