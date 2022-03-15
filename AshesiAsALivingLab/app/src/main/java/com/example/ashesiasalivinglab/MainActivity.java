package com.example.ashesiasalivinglab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Zoomlion zoomlion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoomlion = new Zoomlion();
    }

    /** Called when the user taps the Welcome button */
    public void onClickWelcome(View view) {
        Intent intent = new Intent(this, groupSelectPage.class);
        startActivity(intent);
    }
}
