package projetotcc.com.br.aventura.data.repository;

import projetotcc.com.br.aventura.data.model.Credencial;

/**
 * Created by junior on 3/8/18.
 */

public class CredencialRepository extends Repository<Credencial> {

    public CredencialRepository(){
        super(Credencial.class);
    }
}
