package com.example.mahima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main_Categories extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_categories);

        recyclerView = findViewById(R.id.recycleView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<CategoryModel> list = new ArrayList<>();
        list.add(new CategoryModel("","Category1"));
        list.add(new CategoryModel("","Category1"));
        list.add(new CategoryModel("","Category2"));
        list.add(new CategoryModel("","Category2"));
        list.add(new CategoryModel("","Category3"));
        list.add(new CategoryModel("","Category3"));
        list.add(new CategoryModel("","Category4"));
        list.add(new CategoryModel("","Category4"));
        list.add(new CategoryModel("","Category5"));
        list.add(new CategoryModel("","Category5"));

        CategoryAdapter adapter = new CategoryAdapter(list);
        recyclerView.setAdapter(adapter);

    }
}