package com.example.test2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class adapter extends RecyclerView.Adapter<viewholder> {

    private List<Movie> movies;
    private Context context;

    public adapter(List<Movie>movies,Context context) {
        this.movies = movies;
        this.context = context;
    }

    @Override
    public viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_person, parent, false);

        return new viewholder(view,context);
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position) {
        Movie movie = movies.get(position);
        holder.movieName.setText(movie.name);
        holder.movieYear.setText(movie.year);
        holder.moviePoster.setImageResource(movie.photoID);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
