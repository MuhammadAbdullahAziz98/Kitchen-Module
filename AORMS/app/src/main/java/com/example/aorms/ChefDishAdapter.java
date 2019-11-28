package com.example.aorms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChefDishAdapter extends RecyclerView.Adapter<ChefDishAdapter.ChefDishViewHolder> {
    @NonNull
    @Override
    public ChefDishAdapter.ChefDishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_queue_list,parent,false);
        return new ChefDishAdapter.ChefDishViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChefDishViewHolder holder, int position) {
        Dish dish = dishes.get(position);
        holder.name.setText(dish.getDish_name());
        holder.type.setText(dish.getType());
    }


    private ArrayList<Dish> dishes = new ArrayList<>();
    private Context mContext;

    public ChefDishAdapter(Context context, ArrayList<Dish> dishes) {
        mContext = context;
        this.dishes = dishes;
    }
    @Override
    public int getItemCount() {
        return dishes.size();
    }


    public static class ChefDishViewHolder extends RecyclerView.ViewHolder{
        public TextView name,type;
        public ChefDishViewHolder(View viewItem){
            super(viewItem);
            name = (TextView) itemView.findViewById(R.id.dishName);
            type = (TextView) itemView.findViewById(R.id.dishType);
        }
    }
}

