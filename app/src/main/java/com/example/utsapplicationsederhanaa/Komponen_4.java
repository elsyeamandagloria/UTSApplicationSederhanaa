package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Komponen_4 extends AppCompatActivity {
Button Cth_Syntax4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen_4);

        Cth_Syntax4= (Button) findViewById(R.id.Cth_Syntax4);

        Cth_Syntax4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cth4= new Intent(Komponen_4.this,Syntax_BroadcastReceiver.class);
                startActivity(cth4);
            }
        });
    }

    public void link4(View view) {
        Intent lk4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/fundamentals?hl=id"));
        startActivity(lk4);
    }
}
