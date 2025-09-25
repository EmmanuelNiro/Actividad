package com.example.actividad;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallePokemonFragment extends Fragment {

    private TextView NombreDetalle;
    private TextView Descripcion;

    public DetallePokemonFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_detalle_pokemon, container, false);
        NombreDetalle = view.findViewById(R.id.NombreDetalle);
        Descripcion = view.findViewById(R.id.Descripcion);
        Bundle args = getArguments();
        String nombre = args.getString("NombreDetalle");
        String descripcion = args.getString("Descripcion");
        NombreDetalle.setText(nombre);
        Descripcion.setText(descripcion);
        return view;
    }

}

