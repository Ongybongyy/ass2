package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<ResData> myResList;
    ResData mResData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ensure the RecyclerView is positioning item views at the desired locations and when items
        //are visible or invisible to users

        mRecyclerView = (RecyclerView)findViewById(R.id.rvList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        //Populating my arraylist with data

        myResList = new ArrayList<>();
        mResData = new ResData("Gyusha", "Casual Dining - Japanese BBQ", "4.2", "Chippendale", R.drawable.image1);
        myResList.add(mResData);
        mResData = new ResData("Guo's Noodle House", "Casual Dining - Chinese", "3.8", "Hurstville", R.drawable.image2);
        myResList.add(mResData);
        mResData = new ResData("Stanton & Co.", "Casual Dining - Modern", "3.9", "Rosebury", R.drawable.image3);
        myResList.add(mResData);
        mResData = new ResData("Pastadelli", "Café - Italian, Cafe Food, Coffee", "3.9", "Wahroonga", R.drawable.image4);
        myResList.add(mResData);
        mResData = new ResData("Alibi", "Casual Dining, Bar - Vegan", "3.9", "Woolloomooloo", R.drawable.image5);
        myResList.add(mResData);
        mResData = new ResData("Nour", "Casual Dining - Lebanese", "4.3", "Surry Hills", R.drawable.image6);
        myResList.add(mResData);
        mResData = new ResData("Macelleria Bondi", "Casual Dining - Steak, Burger", "3.9", "Bondi Beach", R.drawable.image7);
        myResList.add(mResData);
        mResData = new ResData("Cafe Ventotto ", "Café - Coffee and Tea, Cafe Food", "4.3", "Surry Hills", R.drawable.image8);
        myResList.add(mResData);
        mResData = new ResData("Yellow Fever", "Café - Asian, Cafe Food, Coffee", "3.8", "Redfern", R.drawable.image9);
        myResList.add(mResData);
        mResData = new ResData("Barzaari", "Casual Dining, Bar - Casual", "3.9", "Marrickville", R.drawable.image10);
        myResList.add(mResData);

        ResAdapter resAdapter = new ResAdapter(MainActivity.this, myResList);
        mRecyclerView.setAdapter(resAdapter);
    }
}
