package com.example.quickbate;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView text_title, text_author;
    public CardView cardView;
    public ImageView img_headline;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        text_author = itemView.findViewById(R.id.textAuthor);
        img_headline = itemView.findViewById(R.id.imgHeadline);
        text_title = itemView.findViewById(R.id.textTtl);
        cardView = itemView.findViewById(R.id.main_container);
    }
}
