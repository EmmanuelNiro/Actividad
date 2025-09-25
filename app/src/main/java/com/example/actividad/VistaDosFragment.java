package com.example.actividad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VistaDosFragment extends Fragment {

    RecyclerView recyclerView;

    public VistaDosFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vista_dos, container, false);

        recyclerView = view.findViewById(R.id.idRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ArrayList<Pokemon> listaPokemones = new ArrayList<>();
       listaPokemones.add(new Pokemon("Pikachu", "Pokemon Electrico","https://pngimg.com/image/27702" ));
        listaPokemones.add(new Pokemon("Charmander", "Pokemon Fuego","https://pngimg.com/image/27707" ));
        listaPokemones.add(new Pokemon("Bulbasaur", "Pokemon planta","https://pngimg.com/image/27693" ));
        listaPokemones.add(new Pokemon("Squirtle", "Pokemon Agua","https://pngimg.com/image/27690" ));

        PokemonAdapter adapter = new PokemonAdapter (listaPokemones);
        recyclerView.setAdapter(adapter);

        return view;
        }
        @Override
        public void onViewCreated (@NonNull View vista,
                @Nullable Bundle savedInstanceState){
            super.onViewCreated(vista, savedInstanceState);
        }



    }




