package com.example.tanushreechaubal.ratings;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rating extends AppCompatActivity {

    private RatingBar ratings;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
    }

    public void enter(View view){

        ratings = (RatingBar) findViewById(R.id.ratingBar);
        float rating = ratings.getRating();

        editText = (EditText) findViewById(R.id.editText);

        Intent gotonext = new Intent();
        gotonext.setClass(this, Display_Ratings.class);
        gotonext.putExtra("Stars", rating);

        Bundle bundle = new Bundle();
        bundle.putString("comments", editText.getText().toString());

        gotonext.putExtras(bundle);
        startActivity(gotonext);
        finish();
    }

    public void end(View view){

        Toast.makeText(getApplicationContext(), "It's Ok, you can rate us later!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
