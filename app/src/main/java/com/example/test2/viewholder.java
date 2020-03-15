package com.example.test2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class viewholder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView movieName;
    public TextView movieYear;
    public ImageView moviePoster;

    public viewholder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        movieName = (TextView) itemView.findViewById(R.id.movie_name);
        movieYear = (TextView) itemView.findViewById(R.id.movie_year);
        moviePoster = (ImageView) itemView.findViewById(R.id.movie_poster);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(context,movieName.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
