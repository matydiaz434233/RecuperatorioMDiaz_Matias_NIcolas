package com.matisoft.recuperatoriomoviles.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.matisoft.recuperatoriomoviles.R;
import com.matisoft.recuperatoriomoviles.modelo.Pelicula;

import java.io.Serializable;
import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder> {
    private List<Pelicula> listaPeliculas;
    private Context context;
    private LayoutInflater li;

    public PeliculaAdapter(List<Pelicula> listaPeliculas, Context context, LayoutInflater li) {
        this.listaPeliculas = listaPeliculas;
        this.context = context;
        this.li = li;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=li.inflate(R.layout.carta_peliculas,parent,false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pelicula peli = listaPeliculas.get(position);
        if (peli != null) {
            holder.director.setText(peli.getDirector());
            holder.titulo.setText(peli.getTitulo());
        }
    }
    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    public void setListaLugares(List<Pelicula> listaLugares) {
        this.listaPeliculas = listaLugares;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView director;
        private TextView titulo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            director = itemView.findViewById(R.id.tvAnio);
            titulo = itemView.findViewById(R.id.tvDuracion);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bundle bundle = new Bundle();
                    //bundle.putParcelableArrayList("listaLugares", (ArrayList<Lugar>) listaLugares);
                    //bundle.putSerializable("estreno",  listaPeliculas.get(getAdapterPosition()));
                    bundle.putSerializable("estreno",  listaPeliculas.get(getAdapterPosition()));
                    // bundle.putParcelable("estreno", listaPeliculas.get(getAdapterPosition()));
                    //Navigation.findNavController(view).navigate(R.id.nav_detalle, bundle);
                    Navigation.findNavController(view).navigate(R.id.nav_detalle,bundle);
                }
            });
        }
    }};

