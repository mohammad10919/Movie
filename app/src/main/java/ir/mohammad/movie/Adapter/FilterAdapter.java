package ir.mohammad.movie.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ir.mohammad.movie.R;
import ir.mohammad.movie.model.Filter;

public class FilterAdapter extends RecyclerView.Adapter<FilterAdapter.FilterViewHolder> {

    List<Filter> filter;

    public FilterAdapter(List<Filter> filter) {
        this.filter = filter;
    }

    @NonNull
    @Override
    public FilterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.filter_layout,parent,false);
        return new FilterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilterViewHolder holder, int position) {
        holder.b.setText(filter.get(position).getButton());

    }

    @Override
    public int getItemCount() {
        return filter.size();
    }

    public class FilterViewHolder extends RecyclerView.ViewHolder {

        Button b;

        public FilterViewHolder(@NonNull View itemView) {
            super(itemView);
            b=(Button) itemView.findViewById(R.id.filter_button);
        }
    }
}
