package projetotcc.com.br.aventura;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import projetotcc.com.br.aventura.presenter.LoginPresenter;
import projetotcc.com.br.aventura.presenter.contract.LoginContract;

import static android.Manifest.permission.READ_CONTACTS;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView, View.OnClickListener {


    private LoginContract.ViewAction presenter;

    // UI references.
    private ProgressBar mProgressBar;
    private EditText mEmailView;
    private EditText mPasswordView;
    private View mLoginFormView;
    private Button mSign;

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
        mSign           = (Button) findViewById(R.id.login_sign_button);
        mSign.setOnClickListener(this);
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
        attemptLogin();
    }
}

