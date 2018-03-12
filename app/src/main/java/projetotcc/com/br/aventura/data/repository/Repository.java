package projetotcc.com.br.aventura.data.repository;

import android.content.Context;

import io.realm.Realm;
import io.realm.RealmObject;

/**
 * Created by junior on 3/8/18.
 */

public abstract class Repository<T extends RealmObject> {

    private Realm realm;
    Class<T> classRealm;

    public Repository(Class<T> _classRealm, Context context) {
        this.classRealm = _classRealm;
        Realm.init(context);
        realm = Realm.getDefaultInstance();
    }

    public T insert(final T object) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.insert(object);
            }
        });
        return object;
    }

    public void delete(final Long id) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                T object = findById(id);
                object.deleteFromRealm();
            }
        });
    }

    public T update(final Long id, final T object) {

        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyToRealmOrUpdate(object);
            }
        });

        return object;
    }

    public T findById(final Long id) {
        return realm.where(classRealm)
                .equalTo("id", id)
                .findFirst();
    }

}
