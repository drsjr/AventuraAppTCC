package projetotcc.com.br.aventura;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AventureiroFragment extends Fragment {

    private Button mAvaliacao;

    public AventureiroFragment() {
        // Required empty public constructor
    }

    public static AventureiroFragment newInstance() {
        AventureiroFragment fragment = new AventureiroFragment();
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
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aventureiro, container, false);
        mAvaliacao = (Button) view.findViewById(R.id.avaliacao_aventureiro);

        mAvaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MinhaAvaliacaoActivity.class);
                v.getContext().startActivity(intent);
            }
        });


        return view;
    }

}
