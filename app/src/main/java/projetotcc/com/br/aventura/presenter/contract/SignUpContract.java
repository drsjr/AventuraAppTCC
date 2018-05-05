package projetotcc.com.br.aventura.presenter.contract;

/**
 * Created by junior on 3/25/18.
 */

public interface SignUpContract {

    interface ViewAction extends BaseContract.BasePresenter{

        void setView(SignUpContract.ViewAction view);

        void openPessoaFisicaFragment();

        void openUsuarioFragment();


    }

    interface View extends BaseContract.BaseView {

        void openPessoaFisicaFragment();

        void openUsuarioFragment();

    }

    interface ViewPessoaFisica extends BaseContract.BaseView {

    }

    interface ViewUsuario extends BaseContract.BaseView {

    }
}
