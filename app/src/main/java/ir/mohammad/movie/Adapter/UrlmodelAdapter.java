package ir.mohammad.movie.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ir.mohammad.movie.R;
import ir.mohammad.movie.model.Urlinjson;
import ir.mohammad.movie.model.Urlmodel;

public class UrlmodelAdapter extends RecyclerView.Adapter<UrlmodelAdapter.UrlmodelViewHolder> {

    private List<Urlinjson>urlinjsons;
    private Context mcontex;

    public UrlmodelAdapter(List<Urlinjson> urlinjsons) {
        this.urlinjsons = urlinjsons;
    }

    @NonNull
    @Override
    public UrlmodelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_url,parent,false);
        return new UrlmodelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UrlmodelViewHolder holder, int position) {
        holder.title.setText(urlinjsons.get(position).getTitle());
        holder.price.setText(urlinjsons.get(position).getPrice());
        holder.date.setText(urlinjsons.get(position).getDate());
        Picasso.get().load(urlinjsons.get(position).getThumbnail()).into(holder.thumbnail);

        }


    @Override
    public int getItemCount() {
        return urlinjsons.size();
    }

    public class UrlmodelViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView price ;
        TextView date;
        ImageView thumbnail;


        public UrlmodelViewHolder(@NonNull View itemView) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.textitle);
            price=(TextView) itemView.findViewById(R.id.textprice);
            date=(TextView) itemView.findViewById(R.id.textdata);
            thumbnail=(ImageView) itemView.findViewById(R.id.imagethum);

        }
    }
}
