package com.example.pertemuan5_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[], s2[],s3[];
    int images[]= {R.drawable.fittinglampu,R.drawable.ledstrip,R.drawable.neon,R.drawable.stopkontak,
    R.drawable.kipas,R.drawable.mesincuci};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.makanan);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.star);
        MakananAdapter appAdapter = new MakananAdapter(this,s1,s2,s3,images);
        recyclerView.setAdapter(appAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}