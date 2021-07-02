package ir.mohammad.movie.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ir.mohammad.movie.R;
import ir.mohammad.movie.model.Tabligh;

public class TablighAdapter extends RecyclerView.Adapter<TablighAdapter.tablighViewHolder> {

    List<Tabligh> tabligh;

    public TablighAdapter(List<Tabligh> tabligh) {
        this.tabligh = tabligh;
    }

    @NonNull
    @Override
    public tablighViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.tablighlayout,parent,false);
        return new tablighViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tablighViewHolder holder, int position) {
        Picasso.get().load(tabligh.get(position).getImaget()).into(holder.image);


    }

    @Override
    public int getItemCount() {
        return tabligh.size();
    }

    public class tablighViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        public tablighViewHolder(@NonNull View itemView) {
            super(itemView);
            image=(ImageView) itemView.findViewById(R.id.image_tabligh);
        }
    }
}
