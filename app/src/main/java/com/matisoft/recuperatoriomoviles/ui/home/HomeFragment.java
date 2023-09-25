package com.matisoft.recuperatoriomoviles.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.matisoft.recuperatoriomoviles.databinding.FragmentHomeBinding;
import com.matisoft.recuperatoriomoviles.modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private PeliculaAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        RecyclerView rv = binding.rvPeliculas;
        GridLayoutManager glm = new GridLayoutManager(requireContext(), 1, GridLayoutManager.VERTICAL, false);
        rv.setLayoutManager(glm);
        adapter = new PeliculaAdapter(new ArrayList<>(), requireContext(), getLayoutInflater());
        rv.setAdapter(adapter);
        homeViewModel.armarLista();
        homeViewModel.getListaMutable().observe(getViewLifecycleOwner(), new Observer<List<Pelicula>>() {
            @Override
            public void onChanged(List<Pelicula> peliculaList) {
                adapter.setListaLugares(peliculaList);
                //adapter.notifyDataSetChanged();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}