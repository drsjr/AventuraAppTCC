package projetotcc.com.br.aventura.presenter.contract;

import android.view.View;

/**
 * Created by junior on 3/8/18.
 */

public interface LoginContract {


    interface ViewAction extends BaseContract.BasePresenter {

        void setView (LoginContract.LoginView view);

        void attempLogin(String email, String password);

        boolean errorLogin(String email, String password);

        void finishLogin();

        void newRegisterIntent();

    }

    interface LoginView extends BaseContract.BaseView {

        void attemptLogin();

        void newRegister();

        void emailError(String msgError);

        void closeActivity();

    }

}
