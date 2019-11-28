package com.example.aorms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class QueuesListActivity extends AppCompatActivity {
    private RecyclerView recyclerView1,recyclerView2,recyclerView3;
    private RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3;
    private ChefDishAdapter adapter1,adapter2,adapter3;
    private ArrayList<Dish> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queues_list);
        arrayList = new ArrayList<>();
        for(int i=1; i< 11;i++)
            arrayList.add(new Dish(i, "Type " + i));
        //1st queue
        recyclerView1 = (RecyclerView) findViewById(R.id.chefque1);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getApplicationContext());
        adapter1 = new ChefDishAdapter(this,arrayList);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setAdapter(adapter1);
        //2nd queue
        recyclerView2 = (RecyclerView) findViewById(R.id.chefque2);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getApplicationContext());
        adapter2 = new ChefDishAdapter(this,arrayList);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setAdapter(adapter2);
        //3rd queue
        recyclerView3 = (RecyclerView) findViewById(R.id.chefque3);
        recyclerView3.setHasFixedSize(true);
        layoutManager3 = new LinearLayoutManager(getApplicationContext());
        adapter3 = new ChefDishAdapter(this,arrayList);
        recyclerView3.setLayoutManager(layoutManager3);
        recyclerView3.setAdapter(adapter3);

    }}
