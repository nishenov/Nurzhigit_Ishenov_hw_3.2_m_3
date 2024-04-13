package com.example.nurzhigit_ishenov_hw_32_m_3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class IconViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivIcon;

    public IconViewHolder(@NonNull View itemView) {
        super(itemView);
        ivIcon = itemView.findViewById(R.id.iv_icon);
    }

    public void onBind(int imageId) {
        ivIcon.setImageResource(imageId);
    }
}