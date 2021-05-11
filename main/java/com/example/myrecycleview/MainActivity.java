package com.example.myrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] s1, s2;
    int[] image = {R.drawable.clothe,R.drawable.fruit,R.drawable.vegitable,R.drawable.book,
    R.drawable.electronics, R.drawable.mobile, R.drawable.videogame, R.drawable.knowledge};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = getResources().getStringArray(R.array.Shopping_Items);
        s2 = getResources().getStringArray(R.array.description);
        recyclerView = findViewById(R.id.activity_recycle);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2,image);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}