package com.example.ggbuild;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ListView listView = findViewById(R.id.myList);
        List<String> list = new ArrayList<>();
        list.add("Amumu");
        list.add("Anivia");
        list.add("Braum");
        list.add("Caitlyn");
        list.add("Gnar");
        list.add("Jhin");
        list.add("Kennen");
        list.add("Khazix");
        list.add("Kindred");
        list.add("Leblanc");
        list.add("Leesin");
        list.add("Lucian");
        list.add("Mordekaiser");
        list.add("Nasus");
        list.add("Nautilius");
        list.add("Olaf");
        list.add("Orianna");
        list.add("Pantheon");
        list.add("Pyke");

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
        //listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);


    }



    public boolean OnCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.search_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.searchButton);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search here!");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return false;
    }
}