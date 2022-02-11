package com.example.appexample_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button button;
    ImageView cajadeImagen;
    boolean estadoBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        estadoBoton = true;
        button = findViewById(R.id.button);
        cajadeImagen = findViewById(R.id.ImageView);
        cajadeImagen.setImageResource(R.drawable.jhinone);
    }
    public void pulsarBoton (View view) {
        if (estadoBoton) {
            cajadeImagen.setImageResource(R.drawable.jhinone);
            estadoBoton = false;
            Toast.makeText(SecondActivity.this,"Give it more clicks so that jhin continues dancing", Toast.LENGTH_LONG).show();
        }
        else {
            cajadeImagen.setImageResource(R.drawable.jhintwo);
            estadoBoton = true;
            Toast.makeText(SecondActivity.this,"Give it more clicks so that jhin continues dancing", Toast.LENGTH_LONG).show();
        }
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.BOTTOM, 50, 50);
    }
    public void irActividad1 (View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }
}