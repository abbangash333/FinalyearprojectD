package com.example.finalyearprojectd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn extends AppCompatActivity {
    private Button signInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().setTitle("Driver");
        signInButton = findViewById(R.id.signIn_Button);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jumpToUsrNotificaionsMenu = new Intent(getApplicationContext(), NotificationsFromUsers.class);
                startActivity(jumpToUsrNotificaionsMenu);
            }
        });
    }
}
