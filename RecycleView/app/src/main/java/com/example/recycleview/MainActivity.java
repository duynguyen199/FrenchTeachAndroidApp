package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity implements OnListenerClickItem, View.OnClickListener {
    private RecyclerView recyclerView;
    ArrayList<Dog> dogList = new ArrayList<>();
    MyAdapter myAdapter;
    ImageView imgAddOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recycleView);

        imgAddOn = findViewById(R.id.imgAddOn);

        addDate();

        myAdapter=new MyAdapter(MainActivity.this,new ArrayList<>(),this);

        recyclerView.setAdapter(myAdapter);

        imgAddOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAdd();
            }
        });
    }
    private void addDate(){
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
    }

    private void showDialogAdd(){
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog_add);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        EditText edtName= dialog.findViewById(R.id.edtName);
        Button btnAdd= dialog.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(v -> {
            String name = edtName.getText().toString();
            dogList.add(new Dog("Phoc",R.drawable.dog2,"$8000"));
            dialog.dismiss();
        });

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onClick(int position) {

    }

    @Override
    public void onDelete(int position, Dog dog) {
        Toast.makeText(MainActivity.this, "Click Item " + position, Toast.LENGTH_SHORT).show();
        dogList.remove(position);
        myAdapter.setListData(dogList);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}