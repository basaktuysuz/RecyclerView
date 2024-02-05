package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemsViewHolder> {

    private final ArrayList<ItemHelperClass> itemsList;

    public ItemAdapter(ArrayList<ItemHelperClass> itemsList) {
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ItemAdapter.ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new ItemsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {
        ItemHelperClass itemHelperClass = itemsList.get(position);

        holder.itemName.setText(itemHelperClass.getItemName());
        holder.itemDescription.setText(itemHelperClass.getItemDesc());
        holder.itemPrice.setText(itemHelperClass.getItemPrice());
        holder.itemImage.setImageResource(itemHelperClass.getItemImage());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public static class ItemsViewHolder extends RecyclerView.ViewHolder {
        TextView itemName, itemDescription, itemPrice;
        ImageView itemImage;

        public ItemsViewHolder(View itemView) {
            super(itemView);

            //hooks
            itemName = itemView.findViewById(R.id.textViewItemName);
            itemDescription = itemView.findViewById(R.id.textViewItemDesc);
            itemImage = itemView.findViewById(R.id.imageViewItem);
            itemPrice = itemView.findViewById(R.id.textViewItemPrice);

        }
    }
}
