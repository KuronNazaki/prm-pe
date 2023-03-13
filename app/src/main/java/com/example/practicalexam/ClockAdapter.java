package com.example.practicalexam;

import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ClockAdapter extends RecyclerView.Adapter<ClockAdapter.ClockViewHolder> {
    List<Clock> list;


    @NonNull
    @Override
    public ClockViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ClockViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ClockViewHolder extends RecyclerView.ViewHolder {
        final TextView id;
        final TextView name;
        final TextView price;

        public ClockViewHolder(@NonNull View itemView) {
            super(itemView);
            this.id = itemView.findViewById(R.id.clockItemId);
            this.name = itemView.findViewById(R.id.clockItemName);
            this.price = itemView.findViewById(R.id.clockItemPrice);
        }


//        public void bindOnClickListener(final PaintingEntity item, final RecyclerViewClickListener<PaintingEntity> listener) {
//            itemView.setOnClickListener(view -> listener.onRecyclerViewItemClick(item));
//        }
//
//        public void bindOnLongClickListener(final Long id, final RecyclerViewLongClickListener listener) {
//            itemView.setOnLongClickListener(view -> listener.onRecyclerViewItemLongClick(id));
//        }
    }
}
