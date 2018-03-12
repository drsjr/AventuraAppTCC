package projetotcc.com.br.aventura.data.repository;

import android.content.Context;

import projetotcc.com.br.aventura.data.model.Credencial;

/**
 * Created by junior on 3/8/18.
 */

public class CredencialRepository extends Repository<Credencial> {

    private static CredencialRepository instance;
    private static Context context;

    private CredencialRepository(Context context){
        super(Credencial.class, context);
        this.context = context;
    }

    public static CredencialRepository getInstance(Context context){
        if(instance == null){
            instance = new CredencialRepository(context);
        }
        return instance;
    }
}
