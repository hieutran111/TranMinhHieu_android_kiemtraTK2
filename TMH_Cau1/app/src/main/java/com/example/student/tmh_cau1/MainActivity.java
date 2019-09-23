package com.example.student.tmh_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFilm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFilm = findViewById(R.id.lvFilm);
        ArrayList<Film> list = new ArrayList<>();
        Film f1 = new Film("Wolfverin", "American", 30000);
        list.add(f1);
        Film f2 = new Film("SwordFish", "American", 15000);
        list.add(f2);
        Film f3 = new Film("DeadPool", "American", 29000);
        list.add(f3);
        Film f4 = new Film("RobinHood", "American", 35000);
        list.add(f4);
        Film f5 = new Film("EndGame", "American", 100000);
        list.add(f5);
        Film f6 = new Film("IronMan", "American", 70000);
        list.add(f6);
        FilmAdapter adapter = new FilmAdapter(this, R.layout.film, list);
        lvFilm.setAdapter(adapter);
    }
}
