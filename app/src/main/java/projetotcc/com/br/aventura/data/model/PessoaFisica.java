package projetotcc.com.br.aventura.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by junior on 4/14/18.
 */

public class PessoaFisica extends RealmObject implements Parcelable {

    @PrimaryKey
    private Long idPessoaFisica;

    private String nome;
    private String sobrenome;
    private Date dataNascimento;
    //private Aventureiro aventureiro;
    private String CPF;

    public PessoaFisica() {

    }

    public PessoaFisica(Parcel in) {
        setIdPessoaFisica(in.readLong());
        setNome(in.readString());
        setSobrenome(in.readString());
        setCPF(in.readString());
        dataNascimento = (Date) in.readParcelable(Date.class.getClassLoader());
        //aventureiro = (Aventureiro) in.readParcelable(Aventureiro.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(idPessoaFisica);
        dest.writeString(nome);
        dest.writeString(sobrenome);
        dest.writeString(CPF);
    }

    public static final Creator<PessoaFisica> CREATOR = new ClassLoaderCreator<PessoaFisica>() {
        @Override
        public PessoaFisica createFromParcel(Parcel source, ClassLoader loader) {
            return new PessoaFisica(source);
        }

        @Override
        public PessoaFisica createFromParcel(Parcel source) {
            return new PessoaFisica(source);
        }

        @Override
        public PessoaFisica[] newArray(int size) {
            return new PessoaFisica[size];
        }
    };

    public Long getIdPessoaFisica() {
        return idPessoaFisica;
    }

    public void setIdPessoaFisica(Long idPessoaFisica) {
        this.idPessoaFisica = idPessoaFisica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /*public Aventureiro getAventureiro() {
        return aventureiro;
    }

    public void setAventureiro(Aventureiro aventureiro) {
        this.aventureiro = aventureiro;
    }*/

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
