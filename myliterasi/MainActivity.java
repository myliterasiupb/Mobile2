package com.example.myliterasi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button, button2, button3, button4, buttonVoiceQA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        buttonVoiceQA = findViewById(R.id.buttonVoiceQA);

        button.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(i);
        });

        button2.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(i);
        });

        button3.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivity4.class);
            startActivity(i);
        });

        button4.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivity5.class);
            startActivity(i);
        });

        buttonVoiceQA.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, MainActivity30.class); // Pindah ke halaman Voice Q&A
            startActivity(i);
        });
    }
}