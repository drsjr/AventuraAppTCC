package projetotcc.com.br.aventura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AventuraDetalheActivity extends AppCompatActivity {

    private TextView mDescricao;
    private LinearLayout mItems;
    private TextView mHabilidades;
    private Button mAceitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aventura_detalhe);

        mDescricao      = (TextView) findViewById(R.id.descricao_aventura_detalhe);
        //mItems          = (LinearLayout) findViewById(R.id.item_aventura_detalhe);
        mHabilidades    = (TextView) findViewById(R.id.habilidade_aventura_detalhe);
        mAceitar        = (Button) findViewById(R.id.aceitar_aventura_detalhe);

    }





}
