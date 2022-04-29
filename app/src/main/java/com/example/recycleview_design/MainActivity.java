package com.example.recycleview_design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //WHAT IS INTENT ?
    //Intent used for communicating from 1 activity to any other activity. we can remember intent with the word intention.
    //here we will handle all onClock Functions.

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

    public void Search(View view){
        Toast.makeText(this, "Type something", Toast.LENGTH_SHORT).show();
    }

    public void Car(View view){
        Intent intent = new Intent(this,CarActivity.class);
        Toast.makeText(this, "This is Car's Activity", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void Truck(View view){
        Intent intent = new Intent(this,TruckActivity.class);
        ImageView imageView=findViewById(R.id.image1);
        Toast.makeText(this, "This is Truck's Activity", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void Tempo(View view){
        Intent intent = new Intent(this,TempoActivity.class);
        ImageView imageView=findViewById(R.id.image1);
        Toast.makeText(this, "This is Tempo's Activity", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void Bike(View view){
        Intent intent = new Intent(this,TruckActivity.class);
        ImageView imageView=findViewById(R.id.image1);
        Toast.makeText(this, "This is Bike's Activity", Toast.LENGTH_SHORT).show();
        startActivity(intent);    }

    public void Auto(View view){
        Intent intent = new Intent(this,AutoActivity.class);
        ImageView imageView=findViewById(R.id.image1);
        Toast.makeText(this, "This is Auto's Activity", Toast.LENGTH_SHORT).show();
        startActivity(intent);    }

    public void Scooter(View view){
        Intent intent = new Intent(this,ScooterActivity.class);
        ImageView imageView=findViewById(R.id.image1);
        Toast.makeText(this, "This is Scooter's Activity", Toast.LENGTH_SHORT).show();
        startActivity(intent);    }
}