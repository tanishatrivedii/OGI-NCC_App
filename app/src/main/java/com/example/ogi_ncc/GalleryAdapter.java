package com.example.ogi_ncc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.galleryHolder> {

    private ArrayList<Upload> mList;
    private Context context;

    public GalleryAdapter(Context context, ArrayList<Upload> mList){
        this.context = context;
        this.mList = mList;
    }
    @NonNull
    @Override
    public galleryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.image_show,parent,false);
        return new galleryHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull galleryHolder holder, int position) {
        Glide.with(context).load(mList.get(position).getImageUrl()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class galleryHolder extends RecyclerView.ViewHolder{


        ImageView imageView;
        public galleryHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.m_image);
        }

    }
}
