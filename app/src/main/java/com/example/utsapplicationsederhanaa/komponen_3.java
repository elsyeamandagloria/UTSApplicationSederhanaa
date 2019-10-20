package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen_3 extends AppCompatActivity {
Button Cth_Syntax3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen_3);

        Cth_Syntax3= (Button) findViewById(R.id.Cth_Syntax3);

        Cth_Syntax3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cth3= new Intent(komponen_3.this,Syntax_Service.class);
                startActivity(cth3);
            }
        });
    }

    public void link3(View view) {
        Intent lk3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/services?hl=id"));
        startActivity(lk3);
    }
}
