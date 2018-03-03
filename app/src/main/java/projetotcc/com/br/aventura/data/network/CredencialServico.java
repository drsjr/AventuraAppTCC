package projetotcc.com.br.aventura.data.network;

import projetotcc.com.br.aventura.data.model.Credencial;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by junior on 2/26/18.
 */

public interface CredencialServico extends Call<Credencial> {

    @POST("/login")
    void token(@Body Credencial credencial);

}
