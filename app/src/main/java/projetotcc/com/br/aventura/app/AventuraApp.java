package projetotcc.com.br.aventura.app;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by junior on 3/11/18.
 */

public class AventuraApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);

        final RealmConfiguration configuration = new RealmConfiguration.Builder().name("sample.realm").schemaVersion(1).build();
        Realm.setDefaultConfiguration(configuration);
        Realm.getInstance(configuration);
    }
}
