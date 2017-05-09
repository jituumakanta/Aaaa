package com.example.jitu.hfgxfx;

import android.app.LauncherActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    CardAdapter adapter;
    ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);


        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        arrayList = new ArrayList();
        adapter = new CardAdapter(arrayList,this);
        recyclerView.setAdapter(adapter);

      /*  recyclerView.addOnItemTouchListener();
        ListView listView = (ListViewt) findViewById(R.id.recyclerView);

        RecyclerViewTouchListener s=new RecyclerViewTouchListener(getApplicationContext(), recyclerView, new RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                // Toast.makeText(getApplicationContext(), bookList.get(position).getTitle() + " is clicked!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                // Toast.makeText(getApplicationContext(), bookList.get(position).getTitle() + " is long pressed!", Toast.LENGTH_SHORT).show();

            }
        });
        recyclerView.addOnItemTouchListener(s);*/




        // for (int i = 1; i < 11; i++) {
            /*Bean item = new Bean();
            item.setTitle("today");
            item.setName("mohan");
            item.setUrl("fff");
            arrayList.add(item);*/
        // }
        //Log.d("ffffff",arrayList);
        // System.out.println(arrayList);

        add();
    }


    public void add() {
        for (int i = 1; i < 11; i++) {
            Bean item = new Bean();
            item.setTitle("today");
            item.setName("mohan");
            item.setUrl("fff");
            arrayList.add(item);
        }
    }


}