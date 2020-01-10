package com.example.finalyearprojectd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {
    private Button signInButton;
    private TextView donotHaveAccount;
    private TextView forgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().setTitle("Driver");
        signInButton = findViewById(R.id.signIn_Button);
        donotHaveAccount = findViewById(R.id.donot_have_account);
        forgotPassword = findViewById(R.id.forgotPassword);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jumpToUsrNotificaionsMenu = new Intent(getApplicationContext(), NotificationsFromUsers.class);
                startActivity(jumpToUsrNotificaionsMenu);
            }
        });
        donotHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jumpToOTPActivity = new Intent(getApplicationContext(), SignUp.class);
                startActivity(jumpToOTPActivity);
            }
        });
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jumpToForgotPasswordActivity = new Intent(getApplicationContext(),ForgotPasswordActivity.class);
                startActivity(jumpToForgotPasswordActivity);
            }
        });
    }
}
