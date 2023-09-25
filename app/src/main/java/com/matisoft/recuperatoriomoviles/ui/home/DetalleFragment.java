package com.matisoft.recuperatoriomoviles.ui.home;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.matisoft.recuperatoriomoviles.R;
import com.matisoft.recuperatoriomoviles.databinding.FragmentDetalleBinding;
import com.matisoft.recuperatoriomoviles.modelo.Pelicula;

public class DetalleFragment extends Fragment {

    private DetalleViewModel mViewModel;
    private FragmentDetalleBinding binding;

    public static DetalleFragment newInstance() {
        return new DetalleFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentDetalleBinding.inflate(inflater, container,false);
        View root = binding.getRoot();
        Bundle bundle = getArguments();
        Pelicula pelicula = (Pelicula) bundle.getSerializable("estreno");
        binding.tvDuracion.setText(" La duracion de la pelicula => " + pelicula.getDuracion()+" Minutos");
        binding.tvAnio.setText("El estreno fue en : "+ pelicula.getAnio());
        return root;
        //return inflater.inflate(R.layout.fragment_detalle, container, false);
    }

   /* @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DetalleViewModel.class);
    }*/

}