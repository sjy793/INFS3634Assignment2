package com.example.infs3634assignment2;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.UserViewHolder>{
    private ArrayList<int[]> foodList;

    // Provide a suitable constructor (depends on the kind of dataset)
    public void setData(ArrayList<int[]> food){
        this.foodList = food;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public ConstraintLayout view1;
        public TextView foodName;
        //public TextView quantity;
        public ImageView foodPhoto;

        @SuppressLint("WrongViewCast")
        public UserViewHolder(View itemView) {
            super(itemView);
            view1 = itemView.findViewById(R.id.view);
            foodName = itemView.findViewById(R.id.name);
            foodPhoto = itemView.findViewById(R.id.image);
            //quantity = (TextView) itemView.findViewById(R.id.textView3);
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
        int[] array = foodList.get(position);
        FoodConstructor food = FoodDatabase.getFoodById(array[0]);
        int quantityValue = array[1];
        String quantity = String.valueOf(quantityValue);
        holder.foodPhoto.setImageResource(food.getImageDrawableId());
        holder.foodName.setText(food.getFoodName() + "    X " + quantity);


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
