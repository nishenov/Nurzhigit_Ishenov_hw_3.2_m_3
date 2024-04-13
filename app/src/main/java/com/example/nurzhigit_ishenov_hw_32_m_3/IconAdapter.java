package com.example.nurzhigit_ishenov_hw_32_m_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IconAdapter extends RecyclerView.Adapter<IconViewHolder> {
    private ArrayList<Integer> images;
    public IconAdapter(ArrayList<Integer> images){
        this.images = images;
    }
    @NonNull
    @Override
    public IconViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new IconViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_icon, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull IconViewHolder holder, int position) {
        holder.onBind(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }
}
