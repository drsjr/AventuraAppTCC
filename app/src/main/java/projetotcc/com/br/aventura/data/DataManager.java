package projetotcc.com.br.aventura.data;

import java.io.IOException;

import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by junior on 2/26/18.
 */

public abstract class DataManager<S> {

    public static final String API_BASE_URL = "http://192.168.1.22:8080";

    public DataManager(){
    }
    private static Interceptor interceptor;


    private static Interceptor getInterceptor(final String token) {
        interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request().newBuilder()
                        .addHeader("Accept", "application/json")
                        .addHeader("authorization", token)
                        .build();
                return chain.proceed(request);
            }
        };
        return interceptor;
    }


    private static OkHttpClient httpClient
            = new OkHttpClient.Builder()
            .authenticator(Authenticator.NONE)
            .build();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static void addToken(String token) {
        httpClient = new OkHttpClient.Builder()
            .addInterceptor(getInterceptor(token))
            .build();

        builder = new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient);
    }

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient).build();
        return retrofit.create(serviceClass);
    }

}
