package com.example.ass2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ResAdapter extends RecyclerView.Adapter<ResAdapter.RestaurantViewHolder> {

    //Implementing a RecyclerViewAdapter, ViewHolder, and RecyclerViewClickListener

    private Context mContext;
    private List<ResData> myResList;

    public ResAdapter(Context mContext, List<ResData> myResList) {
        this.mContext = mContext;
        this.myResList = myResList;
    }

    //onCreateViewHolder is used to define the list item layouts that have been inflated into the RecyclerView.

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View mView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.res_list_item, viewGroup, false);
        return new RestaurantViewHolder(mView);
    }

    //onBindViewHolder is an adapter used to populate each individual view in the RecyclerView with
    //with data from the object. This is shown in .setImageResource to implement the restaurant image
    //and .setText to populate the view with the restaurant's details.

    @Override
    public void onBindViewHolder(@NonNull final RestaurantViewHolder restaurantViewHolder, int i) {
        restaurantViewHolder.imageView.setImageResource(myResList.get(i).getImage());
        restaurantViewHolder.mName.setText(myResList.get(i).getName());
        restaurantViewHolder.mCuisine.setText(myResList.get(i).getCuisine());
        restaurantViewHolder.mRating.setText(myResList.get(i).getRating());
        restaurantViewHolder.mLocation.setText(myResList.get(i).getLocation());

        //This is to ensure relevant data is shown when pressing into a specific view. E.g. pressing a
        //restaurant will bring you into the detail activity with the right data.

        restaurantViewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("image", myResList.get(restaurantViewHolder.getAdapterPosition()).getImage());
                intent.putExtra("name", myResList.get(restaurantViewHolder.getAdapterPosition()).getName());
                intent.putExtra("cuisine", myResList.get(restaurantViewHolder.getAdapterPosition()).getCuisine());
                intent.putExtra("rating", myResList.get(restaurantViewHolder.getAdapterPosition()).getRating());
                intent.putExtra("location", myResList.get(restaurantViewHolder.getAdapterPosition()).getLocation());
                mContext.startActivity(intent);
            }
        });
    }

    //Used to return the number of objects in the adapter

    @Override
    public int getItemCount() {
        return myResList.size();
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView mName, mCuisine, mRating, mLocation;
        CardView mCardView;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.ivImage);
            mName = itemView.findViewById(R.id.tvName);
            mCuisine = itemView.findViewById(R.id.tvCuisine);
            mRating = itemView.findViewById(R.id.tvRating);
            mLocation = itemView.findViewById(R.id.tvLocation);
            mCardView = itemView.findViewById(R.id.cardView);
        }
    }
}
