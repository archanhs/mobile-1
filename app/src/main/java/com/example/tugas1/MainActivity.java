package com.example.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btabung,bkubus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btabung = findViewById(R.id.tabung);
        bkubus = findViewById(R.id.kubus);

        btabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this,tabung.class);
                startActivity(move);
            }
        });
        bkubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent move = new Intent(MainActivity.this,kubus.class);
                startActivity(move);
            }
        });
    }
}
