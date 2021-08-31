package ir.mohammad.movie.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ir.mohammad.movie.R;
import ir.mohammad.movie.Webimagemodel;

public class WebimageAdapter extends RecyclerView.Adapter<WebimageAdapter.WebimageHolder>  {
    private List<Webimagemodel>webimagemodels;
    private Context contextx;

    public WebimageAdapter(List<Webimagemodel> webimagemodels) {
        this.webimagemodels = webimagemodels;
    }

    @NonNull
    @Override
    public WebimageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WebimageHolder holder, int position) {
        holder.type.setText(webimagemodels.get(position).getType());
        Picasso.get().load(webimagemodels.get(position).getSrc()).into(holder.src);

    }

    @Override
    public int getItemCount() {
        return webimagemodels.size();
    }

    public class WebimageHolder extends RecyclerView.ViewHolder {
        ImageView src;
        TextView type;


        public WebimageHolder(@NonNull View itemView) {
            super(itemView);
            src=(ImageView)itemView.findViewById(R.id.imageurl);
            type=(TextView)itemView.findViewById(R.id.texttype);

        }
    }
}
