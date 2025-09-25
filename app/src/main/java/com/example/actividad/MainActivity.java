package com.example.actividad;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Button btnVistaUno, btnVistaDos, btnVistaTres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVistaUno = findViewById(R.id.btnVistaUno);
        btnVistaDos = findViewById(R.id.btnVistaDos);
        btnVistaTres = findViewById(R.id.btnVistaTres);

        reemplazarFragmento(new VistaUnoFragment());

        btnVistaUno.setOnClickListener(v -> reemplazarFragmento(new VistaUnoFragment()));
        btnVistaDos.setOnClickListener(v -> reemplazarFragmento(new VistaDosFragment()));
        btnVistaTres.setOnClickListener(v -> reemplazarFragmento(new VistaTresFragment()));


    }

    private void reemplazarFragmento(Fragment fragmento){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.contenedorFragmentos, fragmento);
        ft.setReorderingAllowed(true);
        ft.commit();
    }

}