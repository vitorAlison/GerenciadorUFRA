package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamarsegundatela(View view) {
        Intent intent = new Intent(this,Segundactivity2.class);
        startActivity(intent);

        Toast.makeText(this, "APP em fase de testes", Toast.LENGTH_SHORT).show();

        }

    public void chamar(View view) {
        Intent intent = new Intent(this, Dados.class);
        startActivity(intent);

        Toast.makeText(this, "APP em fase de testes", Toast.LENGTH_SHORT).show();

    }
}

