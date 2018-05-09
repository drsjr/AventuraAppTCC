package projetotcc.com.br.aventura.data.network;

import projetotcc.com.br.aventura.data.DataManager;

/**
 * Created by junior on 3/11/18.
 */

public class CredencialService extends DataManager<CredencialCall>  {

        private static CredencialCall call;

        public CredencialService() {
            call = super.createService(CredencialCall.class);

        }

        public CredencialCall getService(){
            return call;
        }
}
