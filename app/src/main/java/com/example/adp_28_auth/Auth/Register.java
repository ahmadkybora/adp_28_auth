package com.example.adp_28_auth.Auth;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adp_28_auth.R;

public class Register extends AppCompatActivity {

    private EditText first_name, last_name, username;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        init();
    }

    private void init() {
        first_name = findViewById(R.id.first_name);
        last_name = findViewById(R.id.last_name);
        username = findViewById(R.id.username);
        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(
                        first_name.getText().length() > 0 &&
                        last_name.getText().length() > 0 &&
                        username.getText().length() > 0)
                {
                    String firstNameVal = first_name.getText().toString();
                    String lastNameVal = last_name.getText().toString();
                    String userNameVal = username.getText().toString();
                }
            }
        });
    }
}
