package com.example.actividad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class VistaUnoFragment extends Fragment {

    public VistaUnoFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vista_uno, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View vista,
                              @Nullable Bundle savedInstanceState) {
        super.onViewCreated(vista, savedInstanceState);
    }
}
