package projetotcc.com.br.aventura.data.network;

import projetotcc.com.br.aventura.data.model.Authentication;
import projetotcc.com.br.aventura.data.model.Credencial;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by junior on 4/8/18.
 */

public interface AuthenticationCall {

    @POST("/login")
    Call<Authentication> token(@Body Credencial credencial);
}
