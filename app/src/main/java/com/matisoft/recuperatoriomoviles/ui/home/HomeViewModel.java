package com.matisoft.recuperatoriomoviles.ui.home;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.matisoft.recuperatoriomoviles.modelo.Pelicula;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends AndroidViewModel {

    private MutableLiveData<List<Pelicula>> listaMutable;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        listaMutable = new MutableLiveData<>(); // Inicializa listaMutable aquí
    }

    public LiveData<List<Pelicula>> getListaMutable(){
        return listaMutable;
    }
    public void armarLista(){
        List<Pelicula> lista=new ArrayList<>();
        lista.add(new Pelicula("El secreto de sus ojos", 129.0, "Juan José Campanella", 2009));
        lista.add(new Pelicula("Relatos salvajes", 122.0, "Damián Szifron", 2014));
        lista.add(new Pelicula("Nueve reinas", 114.0, "Fabián Bielinsky", 2000));
        lista.add(new Pelicula("El hijo de la novia", 123.0, "Juan José Campanella", 2001));
        lista.add(new Pelicula("La historia oficial", 112.0, "Luis Puenzo", 1985));
        lista.add(new Pelicula("Titanic", 195.0, "James Cameron", 1997));
        lista.add(new Pelicula("Avatar", 162.0, "James Cameron", 2009));
        lista.add(new Pelicula("El Padrino", 175.0, "Francis Ford Coppola", 1972));
        lista.add(new Pelicula("Pulp Fiction", 154.0, "Quentin Tarantino", 1994));
        lista.add(new Pelicula("Forrest Gump", 142.0, "Robert Zemeckis", 1994));

        listaMutable.setValue(lista);
    }
}