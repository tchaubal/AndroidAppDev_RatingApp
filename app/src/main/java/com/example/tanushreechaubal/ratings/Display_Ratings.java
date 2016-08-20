package com.example.tanushreechaubal.ratings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by TanushreeChaubal on 8/1/16.
 */
public class Display_Ratings extends AppCompatActivity{

    ImageView imageView;
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_ratings);

        Intent intent = getIntent();
        float rating = intent.getFloatExtra("Stars",0);

        imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(R.drawable.rating);

        TextView text = (TextView)findViewById(R.id.rate_textView);
        text.setText("Your selected rating is: "+rating);

        TextView comments = (TextView) findViewById(R.id.comments_textView);
        Bundle bundle = getIntent().getExtras();
        comments.setText(bundle.getString("comments"));

        button = (Button)findViewById(R.id.checkallrate_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button working!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
