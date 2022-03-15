package com.example.ashesiasalivinglab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class userSignUpOrLoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up_or_login_page);
    }

    /** Called when the user taps the SignUp button */
    public void onClickSignUpButton(View view) {
        Intent intent = new Intent(this, userSignUpPage.class);
        startActivity(intent);
    }

    /** Called when the user taps the Login button */
    public void onClickLoginButton(View view) {
        Intent intent = new Intent(this, userLoginPage.class);
        startActivity(intent);
    }
}
