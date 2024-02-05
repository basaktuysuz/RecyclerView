package com.example.recyclerviewexample;

import android.os.Bundle;
import android.widget.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private RecyclerView featureRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        featureRecycler = findViewById(R.id.menuItemsRecyclerView);
        featuredRecycler();
    }

    private void featuredRecycler() {

        featureRecycler.setHasFixedSize(true);
        featureRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        // Initialize the adapter with an empty list for now
            ArrayList<ItemHelperClass> ItemInfos = new ArrayList<>();


        ItemInfos.add(new ItemHelperClass("Classic Black Coffee","$1.75","A simple yet bold black coffee..",R.drawable.coffee));
        ItemInfos.add(new ItemHelperClass("Creamy Vanilla Latte","$2.99","Espresso combined with milk and vanilla flavor.",R.drawable.coffee));
        ItemInfos.add(new ItemHelperClass("Caramel Delight Brew","$2.50","A delightful blend of caramel coffee",R.drawable.coffee));
        ItemInfos.add(new ItemHelperClass("Mocha","$3.50","Chocolate mixed with espresso and topped with whipped cream",R.drawable.coffee));
        ItemInfos.add(new ItemHelperClass("Iced Americano","$2.25","Chilled black coffee over ice",R.drawable.coffee));
        ItemInfos.add(new ItemHelperClass("Coconut Latte","$3.75","Espresso with a tropical twist of coconut",R.drawable.coffee));


        // Update the adapter with the new data
        adapter = new ItemAdapter(ItemInfos);
        featureRecycler.setAdapter(adapter);



    }
}