package projetotcc.com.br.aventura.data.network;

import projetotcc.com.br.aventura.data.model.Authentication;
import projetotcc.com.br.aventura.data.model.Usuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by junior on 3/11/18.
 */

public interface UsuarioCall {

    @POST("/login")
    Call<Authentication> getAuthentication(@Body Usuario usuario);
}
