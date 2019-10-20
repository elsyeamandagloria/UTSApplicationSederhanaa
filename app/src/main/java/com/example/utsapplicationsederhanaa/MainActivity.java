package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button_komp1,button_komp2,button_komp3,button_komp4,button_komp5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_komp1= (Button) findViewById(R.id.button_komp1);
        button_komp2= (Button) findViewById(R.id.button_komp2);
        button_komp3= (Button) findViewById(R.id.button_komp3);
        button_komp4= (Button) findViewById(R.id.button_komp4);
        button_komp5= (Button) findViewById(R.id.button_komp5);

        button_komp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kom1= new Intent(MainActivity.this,Komponen_1.class);
                startActivity(kom1);
            }
        });

        button_komp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kom2= new Intent(MainActivity.this,komponen_2.class);
                startActivity(kom2);
            }
        });
        button_komp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kom3= new Intent(MainActivity.this,komponen_3.class);
                startActivity(kom3);
            }
        });
        button_komp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kom4= new Intent(MainActivity.this,Komponen_4.class);
                startActivity(kom4);
            }
        });
        button_komp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kom5= new Intent(MainActivity.this,komponen_5.class);
                startActivity(kom5);
            }
        });



    }
}
