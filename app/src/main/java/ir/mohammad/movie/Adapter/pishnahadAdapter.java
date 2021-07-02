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
import ir.mohammad.movie.model.pishnahad;

public class pishnahadAdapter extends RecyclerView.Adapter<pishnahadAdapter.pishnahadViewHolder>{
        List<pishnahad> pishnahad;

    public pishnahadAdapter(List<pishnahad> pishnahad) {
        this.pishnahad = pishnahad;
    }

    @NonNull
    @Override
    public pishnahadViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.pishnahad_layout,parent,false);
        return new pishnahadViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull pishnahadViewHolder holder, int position) {
        holder.name.setText( pishnahad.get(position).getText1());
        holder.cash.setText( pishnahad.get(position).getText2());
        holder.time.setText( pishnahad.get(position).getText3());
        Picasso.get().load(pishnahad.get(position).getIma()).into(holder.imageView);



    }

    @Override
    public int getItemCount() {
        return pishnahad.size();
    }

    public class pishnahadViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView name;
        public TextView cash;
        public TextView time;
         public pishnahadViewHolder(@NonNull View itemView) {
            super(itemView);
             imageView=(ImageView) itemView.findViewById(R.id.ima1);
             name=(TextView) itemView.findViewById(R.id.text1);
             cash=(TextView) itemView.findViewById(R.id.text2);
             time=(TextView) itemView.findViewById(R.id.text3);

        }
    }
}
