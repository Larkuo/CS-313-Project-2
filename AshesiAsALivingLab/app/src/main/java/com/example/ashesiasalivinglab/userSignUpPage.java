package com.example.ashesiasalivinglab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userSignUpPage extends AppCompatActivity {

    User newUser;

    EditText name;
    EditText email;
    EditText password;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up_page);
    }

    public void onClickSignUp(View view){
        name = (EditText) findViewById(R.id.editText4);
        email = (EditText) findViewById(R.id.editText5);
        newUser = new User();
        newUser.setUserName(name.toString());
        newUser.setUserEmail(email.toString());
        Toast.makeText(userSignUpPage.this, "Please login to begin", Toast.LENGTH_LONG).show();
        newUser.setUserPassword(findViewById(R.id.editText8).toString());
        Intent intent = new Intent(this, userLoginPage.class);
        startActivity(intent);
    }
}
