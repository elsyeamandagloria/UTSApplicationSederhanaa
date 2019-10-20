package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Syntax_Activity extends AppCompatActivity {
Button kembali2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax_);

        kembali2= (Button) findViewById(R.id.kembali2);

        kembali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kmb2= new Intent(Syntax_Activity.this,MainActivity.class);
                startActivity(kmb2);
            }
        });
    }
}
