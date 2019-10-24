package com.example.infs3634assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.String.valueOf;

public class FoodDetail extends AppCompatActivity {
    private int[] array = new int[2];
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        ImageView foodPhoto = findViewById(R.id.foodPhoto);
        TextView foodName = findViewById(R.id.foodName);
        TextView foodPrice = findViewById(R.id.foodPrice);
        TextView foodDescription = findViewById(R.id.foodDescription);

        Intent intent = getIntent();
        int foodID = intent.getIntExtra("foodID", 0);
        FoodConstructor food = FoodDatabase.getFoodById(foodID);

        foodPhoto.setImageResource(food.getImageDrawableId());
        foodName.setText(food.getFoodName());
        foodPrice.setText(food.getFoodPrice());
        foodDescription.setText(food.getFoodDescription());
    }

    public void increaseInteger(View view) {
        count = count + 1;
        display(count);
    }

    public void decreaseInteger(View view) {
        if(count > 0) {
            count = count - 1;
            display(count);
        }else{
            count = 0;
            display(0);
        }
    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(R.id.foodQuantity);
        displayInteger.setText("" + number);
    }

    public void addToCart(View view){
        Intent intent = getIntent();
        int foodID = intent.getIntExtra("foodID", 0);
        FoodConstructor food = FoodDatabase.getFoodById(foodID);
        TextView quantity = findViewById(R.id.foodQuantity);
        array[0] = foodID;
        array[1] = Integer.parseInt(quantity.getText().toString());
        MainActivity.al.add(array);
        Intent in = new Intent (this, MainActivity.class);
        startActivity(in);
    }

    public int[] foodDetail() {
        return array.clone();
    }
}
