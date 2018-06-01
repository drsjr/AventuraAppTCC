package projetotcc.com.br.aventura.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.List;

import projetotcc.com.br.aventura.R;

/**
 * Created by junior on 5/31/18.
 */

public class AvaliacaoAdapter extends RecyclerView.Adapter<AvaliacaoAdapter.HolderAvaliacao> {


    private List<String> mLista;

    public AvaliacaoAdapter(List<String> lista) {
        this.mLista = lista;
    }

    @Override
    public HolderAvaliacao onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_avaliacao, parent, false);
        return new HolderAvaliacao(view);
    }

    @Override
    public void onBindViewHolder(HolderAvaliacao holder, int position) {
        String value = mLista.get(position);
        holder.mScore.setNumStars(5);
        holder.mScore.setRating(3.0f);
        holder.mScore.setEnabled(false);
        holder.mDescricao.setText(value);
        holder.mNome.setText("Nome Avaliador " + (position+1));
    }

    @Override
    public int getItemCount() {
        return mLista.size();
    }

    class HolderAvaliacao extends RecyclerView.ViewHolder {

        private TextView mNome;
        private TextView mDescricao;
        private RatingBar mScore;

        public HolderAvaliacao (View viewItem) {
            super(viewItem);
            mNome       = (TextView) viewItem.findViewById(R.id.nome_avaliacao);
            mDescricao  = (TextView) viewItem.findViewById(R.id.descricao_avaliacao);
            mScore      = (RatingBar) viewItem.findViewById(R.id.score_avaliacao);
        }
    }
}
