package projetotcc.com.br.aventura.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

/**
 * Created by junior on 3/11/18.
 */

public class Usuario extends RealmObject implements Parcelable {

    @PrimaryKey
    @SerializedName("idUsuario")
    private Long idUsuario;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("favor")
    private Long favor;

    public Usuario(Parcel in) {
        setIdUsuario(in.readLong());
        setUsername(in.readString());
        setPassword(in.readString());
        setFavor(in.readLong());
    }

    public Usuario(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public Usuario() {

    }

    public static final Creator<Usuario> CREATOR = new ClassLoaderCreator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel source, ClassLoader loader) {
            return new Usuario(source);
        }

        @Override
        public Usuario createFromParcel(Parcel source) {
            return new Usuario(source);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(idUsuario);
        dest.writeString(username);
        dest.writeString(password);
        dest.writeLong(favor);
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getFavor() {
        return favor;
    }

    public void setFavor(Long favor) {
        this.favor = favor;
    }

}
