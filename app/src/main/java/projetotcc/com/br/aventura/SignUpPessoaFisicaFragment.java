package projetotcc.com.br.aventura;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class SignUpPessoaFisicaFragment extends Fragment {

    private EditText mNome;
    private EditText mSobrenome;
    private EditText mCPF;
    private EditText mDataNasc;

    public SignUpPessoaFisicaFragment() {
        // Required empty public constructor
    }
    public static SignUpPessoaFisicaFragment newInstance() {
        SignUpPessoaFisicaFragment fragment = new SignUpPessoaFisicaFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pessoa_fisica_sign_up, container, false);

        mNome = (EditText) view.findViewById(R.id.nome);
        mSobrenome = (EditText) view.findViewById(R.id.sobrenome);
        mCPF = (EditText) view.findViewById(R.id.cpf);
        mDataNasc =(EditText) view.findViewById(R.id.datanasc);

        return view;
    }


}
