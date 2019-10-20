package com.example.utsapplicationsederhanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Syntax_BroadcastReceiver extends AppCompatActivity {
Button kembali4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax__broadcast_receiver);

        kembali4= (Button) findViewById(R.id.kembali4);

        kembali4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kmb4= new Intent(Syntax_BroadcastReceiver.this,MainActivity.class);
                startActivity(kmb4);
            }
        });

    }
}
