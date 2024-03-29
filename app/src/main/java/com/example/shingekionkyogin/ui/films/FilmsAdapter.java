package com.example.shingekionkyogin.ui.films;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.shingekionkyogin.OnItemClick;
import com.example.shingekionkyogin.data.models.Film;
import com.example.shingekionkyogin.databinding.ItemFilmsBinding;

import java.util.ArrayList;
import java.util.List;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.FilmsViewHolder> {

    private List<Film> films = new ArrayList<>();
    public static OnItemClick onItemClick;

    public void setOnItemClick(OnItemClick onItemClick){
        FilmsAdapter.onItemClick=onItemClick;
    }
    public void setFilms(List<Film>films){
        this.films=films;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FilmsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFilmsBinding binding = ItemFilmsBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,false
        );
        return new FilmsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmsViewHolder holder, int position) {
        holder.onBind(films.get(position));
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public class FilmsViewHolder extends RecyclerView.ViewHolder{
        private ItemFilmsBinding binding;
        public FilmsViewHolder(@NonNull ItemFilmsBinding binding) {
            super(binding.getRoot());
            this.binding= binding;
        }

        public void onBind(Film film) {
            binding.title.setText(film.getTitle());
            binding.description.setText(film.getDescription());
            itemView.setOnClickListener(view->onItemClick.itemClick(film.getId()));
        }
    }

}
