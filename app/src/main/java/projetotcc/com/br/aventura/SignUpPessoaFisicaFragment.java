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
    private OnFragmentInteractionListener mListener;

    public SignUpPessoaFisicaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SignUpPessoaFisicaFragment.
     */
    // TODO: Rename and change types and number of parameters
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

        return inflater.inflate(R.layout.fragment_pessoa_fisica_sign_up, container, false);
    }


    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
