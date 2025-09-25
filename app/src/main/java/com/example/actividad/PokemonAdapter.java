package com.example.actividad;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder>{
    ArrayList<Pokemon> ListaPokemones;
    public PokemonAdapter(ArrayList<Pokemon> listaPokemones) { ListaPokemones = listaPokemones; }

    @NonNull
    @Override
    public PokemonAdapter.ViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_list, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonAdapter.ViewHolder holder,
                                 int position){
        holder.nombre.setText(ListaPokemones.get(position).getNombre());
        holder.descripcion.setText(ListaPokemones.get(position).getDescripcion());

        Picasso.get()
                .load(ListaPokemones.get(position).getImagen())
                .into(holder.imagen);
    }

    @Override
    public int getItemCount() {return ListaPokemones.size(); }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nombre;
        TextView descripcion;
        ImageView imagen;

        public ViewHolder (@NonNull View itemView){
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.idNombre);
            descripcion = (TextView) itemView.findViewById(R.id.idDescripcion);
            imagen = (ImageView) itemView.findViewById(R.id.idImagen);

            imagen.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick (View view){
                    Intent intent = new Intent(itemView.getContext(),
                            DetallePokemon.class);
                    Bundle bundle = new Bundle();

                    bundle.putString("NombreDetalle",
                            ViewHolder.this.nombre.getText().toString());
                    intent.putExtras(bundle);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
