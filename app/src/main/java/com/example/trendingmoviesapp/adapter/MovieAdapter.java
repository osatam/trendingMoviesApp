package com.example.trendingmoviesapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.trendingmoviesapp.R;
import com.example.trendingmoviesapp.activity.MovieDetailActivity;
import com.example.trendingmoviesapp.model.Movie;
import com.example.trendingmoviesapp.util.Constants;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {

    private Context mContext;
    private List<Movie> movieList;

    public MovieAdapter(Context mContext, List<Movie> movieList) {
        this.mContext = mContext;
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MyViewHolder holder, int position) {
        holder.title.setText(movieList.get(position).getOriginalTitle());
        String vote = Double.toString(movieList.get(position).getVoteAverage());
        holder.userRating.setText(Constants.RATING_TEXT+vote);

        Glide.with(mContext)
                .load(movieList.get(position).getPosterPath())
                .placeholder(R.mipmap.image_placeholder)
                .into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title, userRating;
        public ImageView thumbnail;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            userRating = itemView.findViewById(R.id.userRating);
            thumbnail = itemView.findViewById(R.id.thumbnail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position  = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        Movie clickDataItem = movieList.get(position);
                        Intent intent  = new Intent(mContext, MovieDetailActivity.class);
                        intent.putExtra(Constants.ORIGINAL_TITLE_NAME,movieList.get(position).getOriginalTitle());
                        intent.putExtra(Constants.POSTER_PATH_NAME,movieList.get(position).getPosterPath());
                        intent.putExtra(Constants.OVERVIEW_NAME,movieList.get(position).getOverview());
                        intent.putExtra(Constants.VOTE_AVERAGE_NAME,Double.toString(movieList.get(position).getVoteAverage()));
                        intent.putExtra(Constants.RELEASE_DATE_NAME,movieList.get(position).getReleaseDate());

                        //Extras
                        intent.putExtra(Constants.ORIGINAL_LANGUAGE_NAME,movieList.get(position).getOriginalLanguage());

                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        mContext.startActivity(intent);
                        Toast.makeText(view.getContext(),Constants.YOU_CLICKED_MESSAGE +clickDataItem.getOriginalTitle(), Toast.LENGTH_SHORT).show();


                    }
                }
            });

        }
    }
}
