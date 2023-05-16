package com.example.markettotable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Intro extends AppCompatActivity implements View.OnClickListener {

    EditText user,password;
    Button login,signup;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_layout);

        user = findViewById(R.id.user_edit);
        password = findViewById(R.id.pass_edit);
        login = findViewById(R.id.login_butt);
        signup = findViewById(R.id.signup_butt);
    }

    @Override
    public void onClick(View v) {
        checkedAllFields();
        if(v.getId() == R.id.login_butt && checkedAllFields() == true){

                Intent login =  new Intent(getApplicationContext(),MainActivity.class);
                startActivity(login);
            }

        if (v.getId() == R.id.signup_butt){

            Intent signup = new Intent(getApplicationContext(),SignUp.class);
            startActivity(signup);
        }
    }


    private boolean checkedAllFields(){
        if(user.length() == 0){
            user.setError("Please Fill Out This Field");
            return false;
        }
        if(password.length() == 0 || password.length() < 8){
            user.setError("Password Must Be * characters Long");
            return false;
        }

        return true;
    }
}
