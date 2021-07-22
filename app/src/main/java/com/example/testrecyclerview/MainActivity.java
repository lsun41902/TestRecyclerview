package com.example.testrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<mymember> arrayList ;
    RecyclerView recyclerView ;
    myadapter myadapter;
    boolean grod_or_list = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.m_recycler);
        findViewById(R.id.btn_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrayList.size()>5)
                    arrayList.clear();
                grod_or_list = !grod_or_list;
                if(grod_or_list) {
                    recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 3));
                        arrayList.add(new mymember("",R.drawable.ic_launcher_background));
                        arrayList.add(new mymember("",R.drawable.ic_launcher_background));
                        arrayList.add(new mymember("",R.drawable.ic_launcher_background));
                        arrayList.add(new mymember("",R.drawable.ic_launcher_background));
                        arrayList.add(new mymember("",R.drawable.ic_launcher_background));
                        arrayList.add(new mymember("",R.drawable.ic_launcher_background));

                }
                else {
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        arrayList.add(new mymember("00",R.drawable.ic_launcher_foreground));
                        arrayList.add(new mymember("01",R.drawable.ic_launcher_foreground));
                        arrayList.add(new mymember("02",R.drawable.ic_launcher_foreground));
                        arrayList.add(new mymember("03",R.drawable.ic_launcher_foreground));
                        arrayList.add(new mymember("04",R.drawable.ic_launcher_foreground));
                        arrayList.add(new mymember("05",R.drawable.ic_launcher_foreground));
                }
            }
        });
        myadapter = new myadapter();
        recyclerView.setAdapter(myadapter);
        arrayList = new ArrayList<>();
        myadapter.setmylist(arrayList);

    }
}