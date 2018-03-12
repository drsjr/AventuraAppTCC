package projetotcc.com.br.aventura.data.network;

import projetotcc.com.br.aventura.data.DataManager;

/**
 * Created by junior on 3/11/18.
 */

public class UsuarioService extends DataManager<UsuarioClient> {

    private UsuarioClient client;

    public UsuarioService() {
        client = super.createService(UsuarioClient.class);
    }

    public UsuarioClient getService() {
        return client;
    }

}
