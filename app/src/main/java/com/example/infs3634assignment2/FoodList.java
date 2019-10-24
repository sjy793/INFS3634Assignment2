package com.example.infs3634assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodList extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_list);

        Intent intent = getIntent();
        int foodID = intent.getIntExtra("foodID", 0);

        FoodConstructor food = FoodDatabase.getFoodById(foodID);

        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.name);


        imageView.setImageResource(food.getImageDrawableId());
        textView.setText(food.getFoodName());
    }
}
