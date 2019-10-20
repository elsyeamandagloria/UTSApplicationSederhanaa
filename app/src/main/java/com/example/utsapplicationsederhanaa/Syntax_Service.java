package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Syntax_Service extends AppCompatActivity {
Button kembali3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax__service);

        kembali3= (Button) findViewById(R.id.kembali3);

        kembali3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kmb3= new Intent(Syntax_Service.this,MainActivity.class);
                startActivity(kmb3);
            }
        });
    }
}
