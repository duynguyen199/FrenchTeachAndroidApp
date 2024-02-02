package com.example.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView welcomeTxt, luckyNumberTxt;
    Button share_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        welcomeTxt= findViewById(R.id.textView2);
        luckyNumberTxt=findViewById(R.id.lucky_number_txt);
        share_btn=findViewById(R.id.share_btn);
        Intent i = getIntent();
        String userName =i.getStringExtra("name");

        int random_num = generateRandomNumber();
        luckyNumberTxt.setText("" + random_num);

        share_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(userName,random_num);
            }
        });


    }

    public int generateRandomNumber (){
        Random random = new Random();
        int upper_limit = 1000;
        int randomNumberGenerated = random.nextInt(upper_limit);
        return randomNumberGenerated;
    }
    public void shareData(String userName,int random){
        Intent i = new Intent(Intent.ACTION_SEND);

        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,userName + "got lucky number");
        i.putExtra(Intent.EXTRA_TEXT, "His lucky number is "+ random);
        startActivity(Intent.createChooser(
                i,"Choose a platform"
        ));

    }
}