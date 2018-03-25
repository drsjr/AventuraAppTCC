package projetotcc.com.br.aventura.data.network;

import projetotcc.com.br.aventura.data.DataManager;

/**
 * Created by junior on 3/11/18.
 */

public class UsuarioService extends DataManager<UsuarioCall> {

    private UsuarioCall client;

    public UsuarioService() {
        client = super.createService(UsuarioCall.class);
    }

    public UsuarioCall getService() {
        return client;
    }

}
