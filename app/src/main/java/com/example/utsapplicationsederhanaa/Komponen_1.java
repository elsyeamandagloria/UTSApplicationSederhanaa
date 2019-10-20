package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komponen_1 extends AppCompatActivity {
Button Cth_Syntax1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen_1);

        Cth_Syntax1= (Button) findViewById(R.id.Cth_Syntax1);

        Cth_Syntax1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cth1= new Intent(Komponen_1.this,Syntax_Intent.class);
                startActivity(cth1);
            }
        });

    }

    public void link1(View view) {
        Intent lk1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codepolitan.com/belajar-menggunakan-intent-sebuah-jembatan-interaksi-antar-komponen-599a5576271ef"));
        startActivity(lk1);
    }
}
