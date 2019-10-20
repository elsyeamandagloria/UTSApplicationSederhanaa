package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Syntax_Intent extends AppCompatActivity {
Button kembali1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax__intent);

        kembali1= (Button) findViewById(R.id.kembali1);

        kembali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kmb1= new Intent(Syntax_Intent.this,MainActivity.class);
                startActivity(kmb1);
            }
        });
    }
}
