package com.hmcoding.lesson3exer4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);

        arrayList=new ArrayList();
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("kotlin");
        arrayList.add("javascript");
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("kotlin");
        arrayList.add("javascript");
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("kotlin");
        arrayList.add("javascript");
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("kotlin");
        arrayList.add("javascript");
        arrayList.add("java");
        arrayList.add("python");
        arrayList.add("kotlin");
        arrayList.add("javascript");

        arrayAdapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String str;
               str = arrayList.get(position)+"";


                Toast.makeText(MainActivity.this, "clicked on" +position, Toast.LENGTH_SHORT).show();
            }
        });


    }
}