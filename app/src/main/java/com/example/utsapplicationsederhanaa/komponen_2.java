package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen_2 extends AppCompatActivity {
Button Cth_Syntax2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen_2);

        Cth_Syntax2= (Button) findViewById(R.id.Cth_Syntax2);

        Cth_Syntax2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cth2= new Intent(komponen_2.this,Syntax_Activity.class);
                startActivity(cth2);
            }
        });
    }

    public void link2(View view) {
        Intent lk2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/activities/?hl=id"));
        startActivity(lk2);
    }
}
