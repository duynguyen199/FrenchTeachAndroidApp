package com.example.recycleview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private ArrayList<Dog> dogList;

    private Context context;
    private OnListenerClickItem onListenerClickItem;

    public MyAdapter(Context context,ArrayList<Dog> dogList, OnListenerClickItem onListenerClickItem) {
        this.dogList = dogList;
        this.context = context;
        this.onListenerClickItem = onListenerClickItem;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Dog dog= dogList.get(position);
        holder.imageView.setImageResource(dog.getImageId());
        holder.item_text.setText(dog.getName());
        holder.item_price.setText(dog.getPrice());

        holder.imgDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                onListenerClickItem.onDelete(position,dog);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dogList.size();
    }

   public static class MyViewHolder extends RecyclerView.ViewHolder {
         ImageView imageView, imgDel;
         TextView item_text,item_price;
         CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             imageView= itemView.findViewById(R.id.item_image_view);
            item_text= itemView.findViewById(R.id.item_text);
             cardView=itemView.findViewById(R.id.cardView);
            item_price=itemView.findViewById(R.id.item_price);
            imgDel= itemView.findViewById(R.id.imgDel);
        }
    }
    @SuppressLint("NotifyDataSetChanged")
    public void setListData(List<Dog> listNew){
        dogList.clear();
        dogList.addAll(listNew);
        notifyDataSetChanged();
    }
}
