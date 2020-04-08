package com.example.ass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView detailResImage;
    TextView detailResName;
    TextView detailResCuisine;
    TextView detailResRating;
    TextView detailResLocation;

    //the onCreate callback is used by the system to create the activity. This is used to set the
    //right data for the appropriate restaurant when a user clicks into the detailed view of a restaurant.

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailResImage = (ImageView)findViewById(R.id.detailIvImage);
        detailResName = (TextView)findViewById(R.id.detailName);
        detailResCuisine = (TextView)findViewById(R.id.detailCuisine);
        detailResRating = (TextView)findViewById(R.id.detailRating);
        detailResLocation = (TextView)findViewById(R.id.detailLocation);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null){
            detailResImage.setImageResource(mBundle.getInt("image"));
            detailResName.setText(mBundle.getString("name"));
            detailResCuisine.setText(mBundle.getString("cuisine"));
            detailResRating.setText(mBundle.getString("rating"));
            detailResLocation.setText(mBundle.getString("location"));

        }
    }

}
