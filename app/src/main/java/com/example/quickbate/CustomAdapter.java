package com.example.quickbate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.quickbate.Listeners.selectListener;
import com.example.quickbate.Models.NewsHeadline;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private Context context;
    private List<NewsHeadline> headline;
    private selectListener listener;

    public CustomAdapter(Context context, List<NewsHeadline> headline, selectListener listener) {
        this.context = context;
        this.headline = headline;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomViewHolder(LayoutInflater.from(context).inflate(R.layout.headlines_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.text_title.setText(headline.get(position).getTitle());
        if (headline.get(position).getUrlToImage()!=null){
            Picasso.get().load(headline.get(position).getUrlToImage()).into(holder.img_headline);
        }
        holder.text_author.setText(headline.get(position).getSource().getName());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.OnNewsClicked(headline.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return headline.size();
    }
}
