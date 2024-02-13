package com.example.luckynumber;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.btn);
        editText=findViewById(R.id.edit_text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName =editText.getText().toString();
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                i.putExtra("name",userName);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId=item.getItemId();
        if(itemId== R.id.home){
            Toast.makeText(
                    this,
                    "You selected Home",
                    Toast.LENGTH_SHORT
            ).show();
        }else if(itemId==R.id.search){
            Toast.makeText(
                    this,
                    "You selected Search",
                    Toast.LENGTH_SHORT
            ).show();
        }
        return super.onOptionsItemSelected(item);
    }
}