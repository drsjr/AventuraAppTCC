package projetotcc.com.br.aventura;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class SignUpUsuarioFragment extends Fragment {

    private EditText mUsername;
    private EditText mEmail;
    private EditText mPassword;
    private EditText mPasswordAgain;
    private OnFragmentInteractionListener mListener;

    public SignUpUsuarioFragment() {
        // Required empty public constructor
    }

    public static SignUpUsuarioFragment newInstance() {
        SignUpUsuarioFragment fragment = new SignUpUsuarioFragment();
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
        View view = inflater.inflate(R.layout.fragment_usuario_sign_up, container, false);
        mUsername = (EditText) view.findViewById(R.id.nome);
        mEmail = (EditText) view.findViewById(R.id.username);
        mPassword = (EditText) view.findViewById(R.id.password);
        mPasswordAgain = (EditText) view.findViewById(R.id.passwordAgain);

        return inflater.inflate(R.layout.fragment_usuario_sign_up, container, false);
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
        void onFragmentInteraction(Uri uri);
    }
}
