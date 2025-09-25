package com.example.actividad;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetallePokemon extends AppCompatActivity {
    TextView nombrePokemon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombrePokemon= (TextView) findViewById(R.id.NombreDetalle);
        Bundle bundle = this.getIntent().getExtras();
        nombrePokemon.setText(bundle.getString("NombreDetalle"));
    }
}
