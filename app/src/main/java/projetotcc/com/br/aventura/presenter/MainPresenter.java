package projetotcc.com.br.aventura.presenter;

import android.content.Context;

import projetotcc.com.br.aventura.presenter.contract.MainContract;

/**
 * Created by junior on 3/25/18.
 */

public class MainPresenter implements MainContract.ViewAction {

    private Context context;

    public MainPresenter(Context context) {
        this.context = context;
    }

    @Override
    public Context getContext() {
        return context;
    }

    @Override
    public void showProgress(boolean inProgress) {

    }
}
