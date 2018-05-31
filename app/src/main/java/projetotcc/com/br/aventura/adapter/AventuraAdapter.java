package projetotcc.com.br.aventura.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import projetotcc.com.br.aventura.AventuraDetalheActivity;
import projetotcc.com.br.aventura.R;

/**
 * Created by junior on 5/27/18.
 */

public class AventuraAdapter extends RecyclerView.Adapter<AventuraAdapter.HolderAventura> {

    private List<String> lista;

    public AventuraAdapter(List<String> lista) {
        this.lista = lista;
    }

    @Override
    public HolderAventura onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_aventura, parent, false);

        return new HolderAventura(view);
    }

    @Override
    public void onBindViewHolder(HolderAventura holder, int position) {
        holder.mDescricao.setText(lista.get(position));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    class HolderAventura extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView  mDescricao;
        private TextView  mDistancia;
        private ImageView mImagem;

        public HolderAventura (View itemView) {
            super(itemView);
            mDistancia = itemView.findViewById(R.id.distancia_aventura);
            mDescricao = itemView.findViewById(R.id.descricao_aventura);
            mImagem = itemView.findViewById(R.id.imagem_aventura);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), AventuraDetalheActivity.class);
            v.getContext().startActivity(intent);
        }
    }
}
