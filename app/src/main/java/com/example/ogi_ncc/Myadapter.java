package com.example.ogi_ncc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyHolder> {

    ArrayList<Model> mList;
    Context context;

    public Myadapter(Context context, ArrayList<Model> mList){
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.cardview_cadets, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        Model model = mList.get(position);
        holder.Name.setText(model.getName());
        holder.father_name.setText(model.getFather_name());
        holder.college.setText(model.getCollege());
        holder.en_Year.setText(model.getEn_year());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{

        TextView Name , father_name, college, en_Year;
        public MyHolder(@NonNull View itemview){
            super(itemview);

            Name = itemview.findViewById(R.id.Name);
            father_name = itemview.findViewById(R.id.father_name);
            college = itemview.findViewById(R.id.college);
            en_Year = itemview.findViewById(R.id.en_Year);
        }
    }
}