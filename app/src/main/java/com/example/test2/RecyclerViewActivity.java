package com.example.test2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {


    private List<Movie> movies;
    private adapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        setTitle("W7ActionBarRecyclerView");

        initial();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        moviesAdapter = new adapter(movies, this);
        recyclerView.setAdapter(moviesAdapter);
    }

    private void initial() {
        movies = new ArrayList<>();
        movies.add(new com.example.test2.Movie("Harry Potter and the Philosopher's Stone", "2001", R.drawable.philosophers_stone));
        movies.add(new com.example.test2.Movie("Harry Potter and the Chamber of Secrets", "2002", R.drawable.chamber_of_secrets));
        movies.add(new com.example.test2.Movie("Harry Potter and the Prisoner of Azkaban","2004", R.drawable.prisoner_of_azkaban));
        movies.add(new com.example.test2.Movie("Harry Potter and the Goblet of Fire","2005",R.drawable.goblet_of_fire));
        movies.add(new com.example.test2.Movie("Harry Potter and the Order of the Phoenix", "2007",R.drawable.order_of_the_phoenix));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.recycler_activity_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add:
                movies.add(getRandomMovie());
                moviesAdapter.notifyDataSetChanged();

            default:
                return super.onOptionsItemSelected(item);

        }
    }


    private Movie getRandomMovie(){
        int num = (int) (Math.random() * 5);
        if (num == 0)
            return new Movie("Harry Potter and the Philosopher's Stone", "2001",R.drawable.philosophers_stone);
        else if (num == 1)
            return  new Movie("Harry Potter and the Chamber of Secrets", "2002",R.drawable.chamber_of_secrets);
        else if (num == 2)
            return  new Movie("Harry Potter and the Prisoner of Azkaban","2004",R.drawable.prisoner_of_azkaban);
        else if (num == 3)
            return new Movie("Harry Potter and the Goblet of Fire", "2005",R.drawable.goblet_of_fire);
        else
            return new Movie("Harry Potter and the Order of the Phoenix", "2007",R.drawable.order_of_the_phoenix);

    }



}
