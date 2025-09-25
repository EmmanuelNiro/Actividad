package com.example.actividad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.squareup.picasso.Picasso;


public class VistaTresFragment extends Fragment {

    private TextView txtMensajeTres;
    private ImageView idImagenPok;

    public VistaTresFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vista_tres, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        txtMensajeTres = view.findViewById(R.id.txtMensajeTres);
        idImagenPok = view.findViewById(R.id.idImagenPok);

        txtMensajeTres.setText("!Un pokemon salvaje ha aparecido");

        Picasso.get()
                .load("https://pngimg.com/image/27687")
                .into(idImagenPok);

    }

}
