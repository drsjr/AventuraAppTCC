package projetotcc.com.br.aventura.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by junior on 2/26/18.
 */

public class Credencial extends RealmObject implements Parcelable {

    @PrimaryKey
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("token")
    private String token;

    public Credencial(Parcel in) {
        username = in.readString();
        password = in.readString();
        token    = in.readString();
    }

    public Credencial(String username, String password) {
        setPassword(password);
        setUsername(username);
    }

    public Credencial (String username, String password, String token) {
        this(username, password);
        setToken(token);
    }

    public Credencial() {

    }

    public static final Creator<Credencial> CREATOR = new ClassLoaderCreator<Credencial>() {
        @Override
        public Credencial createFromParcel(Parcel source, ClassLoader loader) {
            return new Credencial(source);
        }

        @Override
        public Credencial createFromParcel(Parcel source) {
            return new Credencial(source);
        }

        @Override
        public Credencial[] newArray(int size) {
            return new Credencial[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(password);
        dest.writeString(token);
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Credencial{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
