package com.aravi.language_translation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);
    }

    public void userCheck(View v)
    {
        EditText usernameCtrl = (EditText)findViewById(R.id.user_name);
        EditText passwordCtrl = (EditText) findViewById(R.id.user_password);
        TextView errorText = (TextView)findViewById(R.id.error_text);
        String userName = usernameCtrl.getText().toString();
        String password = passwordCtrl.getText().toString();

        boolean validationFlag = false;
        //Verify if the username and password are not empty.
        if(!userName.isEmpty() && !password.isEmpty()) {
            if(userName.equals("Aravind") && password.equals("12345")) {
                validationFlag = true;

            }
        }
        if(!validationFlag)
        {
            errorText.setVisibility(View.VISIBLE);
        }
        else
        {
            //This code redirects the from login page to the home page.
            Intent redirect = new Intent(Login_Page.this, Translate_Text.class);
            startActivity(redirect);
        }

    }
}


