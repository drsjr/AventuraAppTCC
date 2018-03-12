package projetotcc.com.br.aventura.app;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by junior on 3/11/18.
 */

public class AventuraApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
