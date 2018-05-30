package projetotcc.com.br.aventura;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import projetotcc.com.br.aventura.adapter.AventuraAdapter;

public class AventuraFragment extends Fragment {

    private List<String> mLista;
    private RecyclerView mRecyclerView;
    private AventuraAdapter mAdapter;

    public AventuraFragment() {
        // Required empty public constructor
    }

    public static AventuraFragment newInstance() {
        AventuraFragment fragment = new AventuraFragment();
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

        View view = inflater.inflate(R.layout.fragment_aventura, container, false);
        mRecyclerView = view.findViewById(R.id.recycler_aventura);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(container.getContext());
        mRecyclerView.setLayoutManager(manager);

        mLista = Arrays.asList("Teste 1", "Teste 2", "Teste 3");
        mAdapter = new AventuraAdapter(mLista);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

}
