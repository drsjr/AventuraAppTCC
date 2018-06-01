package projetotcc.com.br.aventura.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import projetotcc.com.br.aventura.AvaliarActivity;
import projetotcc.com.br.aventura.R;

/**
 * Created by junior on 6/1/18.
 */

public class MinhaAventuraAdapter extends RecyclerView.Adapter<MinhaAventuraAdapter.HolderMinha> {

    private List<String> mLista;

    public MinhaAventuraAdapter(List<String> lista) {
        this.mLista = lista;
    }

    @Override
    public MinhaAventuraAdapter.HolderMinha onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_aventura_processo, parent, false);
        return new HolderMinha(view);
    }

    @Override
    public void onBindViewHolder(MinhaAventuraAdapter.HolderMinha holder, int position) {
        holder.mStatus.setText(mLista.get(position));

        switch (position){
            case 0:
                holder.mDescricao.setText("Limpar o quintal de uma senhora!");
                break;
            case 1:
                holder.mDescricao.setText("Estudar pra prova de Inglês");
                break;
            case 2:
                holder.mDescricao.setText("Juntar 100Kg de mantimentos!");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mLista.size();
    }

    class HolderMinha extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView  mDescricao;
        private TextView  mStatus;
        private ImageView mImagem;

        public HolderMinha(View viewItem) {
            super(viewItem);

            mStatus = (TextView) viewItem.findViewById(R.id.status_aventura_processo);
            mDescricao = (TextView) viewItem.findViewById(R.id.descricao_aventura_processo);
            viewItem.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), AvaliarActivity.class);
            v.getContext().startActivity(intent);
        }
    }
}
