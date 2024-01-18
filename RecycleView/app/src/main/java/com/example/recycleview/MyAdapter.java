package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Dog> dogList;

    public MyAdapter(List<Dog> dogList) {
        this.dogList = dogList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Dog dog= dogList.get(position);
        holder.imageView.setImageResource(dog.getImageId());
        holder.item_text.setText(dog.getName());
        holder.item_price.setText(dog.getPrice());

    }

    @Override
    public int getItemCount() {
        return dogList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView item_text,item_price;
        private CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
             imageView= itemView.findViewById(R.id.item_image_view);
            item_text= itemView.findViewById(R.id.item_text);
             cardView=itemView.findViewById(R.id.cardView);
            item_price=itemView.findViewById(R.id.item_price);
        }
    }
}
