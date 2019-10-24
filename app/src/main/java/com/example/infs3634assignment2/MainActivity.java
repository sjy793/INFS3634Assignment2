package com.example.infs3634assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    public static ArrayList<int[]> al = new ArrayList<int[]>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rvMain);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        FoodAdapter foodAdapter = new FoodAdapter();
        foodAdapter.setData(FoodDatabase.getAllFood());
        recyclerView.setAdapter(foodAdapter);
    }

    public void viewOrder(View view) {
        Intent intent = new Intent(getApplicationContext(),ViewOrder.class);
        startActivity(intent);
    }
}
