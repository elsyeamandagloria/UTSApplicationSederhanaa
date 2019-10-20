package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class komponen_5 extends AppCompatActivity {
Button Cth_Syntax5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen_5);

        Cth_Syntax5= (Button) findViewById(R.id.Cth_Syntax5);

        Cth_Syntax5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cth5= new Intent(komponen_5.this,Syntax_ContentProvider.class);
                startActivity(cth5);
            }
        });
    }

    public void link5(View view) {
        Intent lk5=new Intent(Intent.ACTION_VIEW, Uri.parse("http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html"));
        startActivity(lk5);
    }
}
