package com.example.infs3634assignment2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.UserViewHolder>{
    private ArrayList<FoodConstructor> foodList;

    // Provide a suitable constructor (depends on the kind of dataset)
    public void setData(ArrayList<FoodConstructor> food){
        this.foodList = food;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public ConstraintLayout view1;
        public TextView foodName;
        public ImageView foodPhoto;

        //public boolean btnSaveState = false;

        public UserViewHolder(View itemView) {
            super(itemView);
            view1 = itemView.findViewById(R.id.view);
            foodName = itemView.findViewById(R.id.name);
            foodPhoto = itemView.findViewById(R.id.image);

        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_list, parent, false);
        UserViewHolder userViewHolder = new UserViewHolder(view);

        return userViewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final UserViewHolder holder, final int position) {

        holder.foodPhoto.setImageResource(foodList.get(position).getImageDrawableId());
        holder.foodName.setText(foodList.get(position).getFoodName());
        holder.view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext().getApplicationContext(), FoodDetail.class);
                intent.putExtra("foodID", foodList.get(position).getFoodID());
                view.getContext().startActivity(intent);
            }
        });

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
