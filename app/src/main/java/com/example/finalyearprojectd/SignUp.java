package com.example.finalyearprojectd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
      private Button gotOTPButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("Verify Number");
        gotOTPButton = findViewById(R.id.got_otp_button);
        gotOTPButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Verifying Number Wait!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),SignUpPassword.class);
                startActivity(intent);
            }
        });

    }
}
