package projetotcc.com.br.aventura.presenter.contract;

import android.content.Context;
import android.view.View;

/**
 * Created by junior on 3/11/18.
 */

public interface BaseContract {


    interface BasePresenter {

        Context getContext();

        void showProgress(boolean inProgress);

    }

    interface  BaseView {

        void showProgress(final boolean inProgress);

    }

}
