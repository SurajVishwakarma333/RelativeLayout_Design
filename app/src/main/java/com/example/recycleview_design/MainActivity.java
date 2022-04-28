package com.example.recycleview_design;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void home(View view){
        Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show();
    }

    public void setting(View view){
        Toast.makeText(this, "setting Selected", Toast.LENGTH_SHORT).show();
    }

    public void profile(View view){
        Toast.makeText(this, "profile Selected", Toast.LENGTH_SHORT).show();
    }

    public void add(View view){
        Toast.makeText(this, "add Selected", Toast.LENGTH_SHORT).show();
    }

    public void location(View view){
        Toast.makeText(this, "location Selected", Toast.LENGTH_SHORT).show();
    }
}