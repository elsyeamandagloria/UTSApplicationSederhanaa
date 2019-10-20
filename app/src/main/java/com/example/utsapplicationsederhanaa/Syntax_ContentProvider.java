package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Syntax_ContentProvider extends AppCompatActivity {
Button kembali5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax__content_provider);

        kembali5= (Button) findViewById(R.id.kembali5);

        kembali5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kmb5= new Intent(Syntax_ContentProvider.this,MainActivity.class);
                startActivity(kmb5);
            }
        });
    }
}
