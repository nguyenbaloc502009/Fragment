package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvShoes;
    ArrayList<Shoes> shoesArrayList;
    ShoesAdaoter shoesAdaoter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ShoesFragment shoesFragment=new ShoesFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.lvShoesFragment,shoesFragment,"shoesFragment")
                .commit();
    }


}