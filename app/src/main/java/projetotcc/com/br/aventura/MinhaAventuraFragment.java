package projetotcc.com.br.aventura;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import projetotcc.com.br.aventura.adapter.MinhaAventuraAdapter;

public class MinhaAventuraFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private MinhaAventuraAdapter mAdapter;

    public MinhaAventuraFragment() {
        // Required empty public constructor
    }


    public static MinhaAventuraFragment newInstance() {
        MinhaAventuraFragment fragment = new MinhaAventuraFragment();
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
        View view =  inflater.inflate(R.layout.fragment_minha_aventura, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_minha_aventura);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(container.getContext());

        mRecyclerView.setLayoutManager(manager);

        List<String> lista = Arrays.asList("Em Progresso", "Finalizado", "Esperando FeedBack");

        mAdapter = new MinhaAventuraAdapter(lista);

        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

}
