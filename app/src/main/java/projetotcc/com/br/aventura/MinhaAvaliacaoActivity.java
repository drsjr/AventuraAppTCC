package projetotcc.com.br.aventura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import projetotcc.com.br.aventura.adapter.AvaliacaoAdapter;

public class MinhaAvaliacaoActivity extends AppCompatActivity {

    private RecyclerView mRecycler;
    private AvaliacaoAdapter mAdapter;
    private List<String> mLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minha_avaliacao);

        mRecycler = (RecyclerView) findViewById(R.id.recycler_avaliacao);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        mRecycler.setLayoutManager(manager);

        mLista = Arrays.asList("Muito Bom!", "Otima ajuda!", "Muito eficiente!");


        mAdapter = new AvaliacaoAdapter(mLista);
        mRecycler.setAdapter(mAdapter);

    }

}
