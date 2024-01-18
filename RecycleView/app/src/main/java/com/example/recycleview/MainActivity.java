package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(new Dog("Sausace Dog", R.drawable.puppy, "$5200"));
        dogList.add(new Dog("Golden Retriever", R.drawable.dog3, "$8000"));
        dogList.add(new Dog("Golden Retriever", R.drawable.dog3, "$8000"));
        dogList.add(new Dog("Golden Retriever", R.drawable.dog3, "$8000"));
        dogList.add(new Dog("Corgi", R.drawable.dog2, "$7300"));
        dogList.add(new Dog("Corgi", R.drawable.dog2, "$7300"));
        dogList.add(new Dog("Corgi", R.drawable.dog2, "$7300"));
        dogList.add(new Dog("Corgi", R.drawable.dog2, "$7300"));
        dogList.add(new Dog("Corgi", R.drawable.dog2, "$7300"));
        dogList.add(new Dog("Sausace Dog", R.drawable.puppy, "$5200"));
        dogList.add(new Dog("Sausace Dog", R.drawable.puppy, "$5200"));
        dogList.add(new Dog("Sausace Dog", R.drawable.puppy, "$5200"));

        recyclerView= findViewById(R.id.recycleView);

        MyAdapter myAdapter=new MyAdapter(dogList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
    }
}