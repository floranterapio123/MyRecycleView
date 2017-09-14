package com.rapio.myrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvAndroidVersion;
    int [] logo;
    String [] codename,version,api,date;
    ArrayList<androidversion> list;
    customadapter adapter;
    LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvAndroidVersion = (RecyclerView) findViewById(R.id.rvAndroidVersion);
        logo = new int[]{
                R.drawable.cupcake,
                R.drawable.donut,
                R.drawable.eclair,
                R.drawable.froyo,
                R.drawable.gingerbread,
                R.drawable.honeycomb,
                R.drawable.ics,
                R.drawable.jellybean,
                R.drawable.kitkat,
                R.drawable.lollipop,
                R.drawable.marshmallow,
                R.drawable.nougat,
                R.drawable.oreo
        };
        codename = getResources().getStringArray(R.array.codename);
        version = getResources().getStringArray(R.array.version);
        api = getResources().getStringArray(R.array.api);
        date = getResources().getStringArray(R.array.date);
        list = new ArrayList<androidversion>();

        layoutManager = new LinearLayoutManager(this);

        rvAndroidVersion.setLayoutManager(layoutManager);
        rvAndroidVersion.setHasFixedSize(true);
        for(int i=0; i< logo.length; i++){
           list.add(new androidversion(logo[i],codename[i],version[i],api[i],date[i]));

        }

        adapter = new customadapter(list);

        rvAndroidVersion.setAdapter(adapter);
        }


    }

