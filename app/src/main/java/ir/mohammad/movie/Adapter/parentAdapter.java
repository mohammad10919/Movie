package ir.mohammad.movie.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ir.mohammad.movie.R;
import ir.mohammad.movie.model.Parent;

public class parentAdapter extends RecyclerView.Adapter<parentAdapter.parentViewHolder> {
    private RecyclerView.RecycledViewPool viewPool=new RecyclerView.RecycledViewPool();
    private List<Parent>parent;
    public parentAdapter(List<Parent> parent) {
        this.parent = parent;
    }

    @NonNull
    @Override
    public parentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_home,parent,false);
        return new parentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull parentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class parentViewHolder extends RecyclerView.ViewHolder {
        RecyclerView r1;
        RecyclerView r2;
        RecyclerView r3;
        RecyclerView r4;


        public parentViewHolder(@NonNull View itemView) {
            super(itemView);
            r1=(RecyclerView)itemView.findViewById(R.id.recycler_filter);
            r2=(RecyclerView)itemView.findViewById(R.id.recycler_baner);
            r3=(RecyclerView)itemView.findViewById(R.id.recycler_pishnahad);
            r4=(RecyclerView)itemView.findViewById(R.id.recycler_estakhr);

        }
    }
}
