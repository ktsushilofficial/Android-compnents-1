package com.example.maxcomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.maxcomponent.Adapters.MultiRecyclerAdapter;
import com.example.maxcomponent.Models.ItemClass;

import java.util.ArrayList;
import java.util.List;

public class MultiRecyclerItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_recycler_item);
        RecyclerView recyclerView
                = findViewById(R.id.mulrecyclerView);

        // Create and set the layout manager
        // For the RecyclerView.
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<ItemClass> itemClasses = new ArrayList<>();

        // pass the arguments
        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Item Type 1"));
        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Item Type 1"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.disney,
                "Item Type 2", "Text"));
        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Item Type 1"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.disney,
                "Item Type 2", "Text"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.disney,
                "Item Type 2", "Text"));
        itemClasses.add(new ItemClass(ItemClass.LayoutOne,
                "Item Type 1"));
        itemClasses.add(new ItemClass(
                ItemClass.LayoutTwo, R.drawable.disney,
                "Item Type 2", "Text"));
        MultiRecyclerAdapter adapterClass
                = new MultiRecyclerAdapter(itemClasses);

        MultiRecyclerAdapter adapter
                = new MultiRecyclerAdapter(itemClasses);

        // set the adapter
        recyclerView.setAdapter(adapter);
    }
}