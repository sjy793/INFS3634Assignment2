package com.example.infs3634assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import static java.lang.Double.parseDouble;

public class ViewOrder extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private TextView total;
    private double totalAmount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_order);

        recyclerView = (RecyclerView) findViewById(R.id.rvMain);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        OrderAdapter orderAdapter = new OrderAdapter();
        orderAdapter.setData(MainActivity.al);
        recyclerView.setAdapter(orderAdapter);

        total = findViewById(R.id.total);
        Intent intent = getIntent();
        int foodID = intent.getIntExtra("foodID", 0);
        FoodConstructor food = FoodDatabase.getFoodById(foodID);

        FoodDetail fd = new FoodDetail();
        int [] arr = fd.foodDetail();

        for(int i=0; i<MainActivity.al.size(); i++){
            int[] ai = MainActivity.al.get(i);
            FoodConstructor f = FoodDatabase.getFoodById(ai[0]);
            int q = ai[1];
            String p = f.getFoodPrice();
            int indexSpace = p.indexOf(" ");
            double price = Double.parseDouble(p.substring(indexSpace));
            totalAmount += (price * q);
            String s = String.format("%.2f", totalAmount);
            total.setText("Total: $ " + s);
        }
    }
}
