package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private int attemptleft=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login=findViewById(R.id.btnLogin);
        Button cansel=findViewById(R.id.btnCansel);
        EditText name=findViewById(R.id.txtName);
        EditText pass=findViewById(R.id.txtPass);
        TextView view=findViewById(R.id.txtview);

        String username="user123";
        String password="pass123";


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String entername =name.getText().toString();
                String enterpassword =pass.getText().toString();
                if (attemptleft>0){
                    if (entername.equals(username) && enterpassword.equals(password)){
                        view.setText("Login Successful");
                    }else{
                        view.setText("Login Error - attemp Left : "+attemptleft);
                        attemptleft=attemptleft-1;
                    }
                }else {
                    view.setText("Please Try Again Later");

                }


            }
        });

    }
}