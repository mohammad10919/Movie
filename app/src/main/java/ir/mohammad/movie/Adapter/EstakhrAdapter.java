package ir.mohammad.movie.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ir.mohammad.movie.R;
import ir.mohammad.movie.model.Estakhr;

public class EstakhrAdapter extends RecyclerView.Adapter<EstakhrAdapter.estakhrViewHolder> {
    List<Estakhr> estakhr;

    public EstakhrAdapter(List<Estakhr> estakhr) {
        this.estakhr = estakhr;
    }

    @NonNull
    @Override
    public estakhrViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.estakhrlayout,parent,false);
        return new estakhrViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull estakhrViewHolder holder, int position) {
        Picasso.get().load(estakhr.get(position).getImage_estakhr()).into(holder.ima);
        holder.text1.setText(estakhr.get(position).getText_t());
        holder.text2.setText(estakhr.get(position).getText_m());
        holder.text3.setText(estakhr.get(position).getText_c());


    }

    @Override
    public int getItemCount() {
        return estakhr.size();
    }

    public class estakhrViewHolder extends RecyclerView.ViewHolder {

        ImageView ima;
        TextView text1;
        TextView text2;
        TextView text3;

        public estakhrViewHolder(@NonNull View itemView) {
            super(itemView);
            ima=(ImageView) itemView.findViewById(R.id.image_estakhr);
            text1=(TextView)itemView.findViewById(R.id.text_tozih);
            text2=(TextView)itemView.findViewById(R.id.text_makan);
            text3=(TextView)itemView.findViewById(R.id.text_cash);
        }
    }
}
