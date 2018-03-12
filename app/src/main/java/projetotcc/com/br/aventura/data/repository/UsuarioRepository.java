package projetotcc.com.br.aventura.data.repository;

import android.content.Context;

import projetotcc.com.br.aventura.data.model.Credencial;
import projetotcc.com.br.aventura.data.model.Usuario;

/**
 * Created by junior on 3/11/18.
 */

public class UsuarioRepository extends Repository<Usuario> {

    private static UsuarioRepository instance;
    private static Context context;

    private UsuarioRepository(Context context) {
        super(Usuario.class, context);
    }

    public static UsuarioRepository getInstance(Context context) {
        if(instance == null){
            instance = new UsuarioRepository(context);
        }
        return instance;
    }



}
