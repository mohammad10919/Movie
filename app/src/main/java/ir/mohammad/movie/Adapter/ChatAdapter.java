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
import ir.mohammad.movie.model.Chat;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.chatViewHolder>{
    List<Chat> chat;

    public ChatAdapter(List<Chat> chat) {
        this.chat = chat;
    }

    @NonNull
    @Override
    public chatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chatlayout,parent,false);
        return new chatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull chatViewHolder holder, int position) {
        holder.name.setText(chat.get(position).getName());
        Picasso.get().load(chat.get(position).getPicture()).into(holder.picture);


    }

    @Override
    public int getItemCount() {
        return chat.size();
    }

    public class chatViewHolder extends RecyclerView.ViewHolder {

        ImageView picture;
        TextView name;
        public chatViewHolder(@NonNull View itemView) {
            super(itemView);
            picture=(ImageView) itemView.findViewById(R.id.image_chat);
            name=(TextView) itemView.findViewById(R.id.text_chat);
        }
    }
}
