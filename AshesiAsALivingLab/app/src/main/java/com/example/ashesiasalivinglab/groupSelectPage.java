package com.example.ashesiasalivinglab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class groupSelectPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_select_page);
    }

    /** Called when the user taps the Business On Campus button */
    public void onClickBusinessButton(View view) {
        Intent intent = new Intent(this, businessOnCampusPage.class);
        startActivity(intent);
    }

    /** Called when the user taps the Zoomlion Gh button */
    public void onClickZoomlionButton(View view) {
        Intent intent = new Intent(this, zoomlionLoginPage.class);
        startActivity(intent);
    }

    /** Called when the user taps the Zoomlion Gh button */
    public void onClickUserButton(View view) {
        Intent intent = new Intent(this, userSignUpOrLoginPage.class);
        startActivity(intent);
    }
}
