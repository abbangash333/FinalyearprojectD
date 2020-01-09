package com.example.finalyearprojectd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class NotificationsFromUsers extends AppCompatActivity implements NotificationsFromUsersAdapter.OnNoteListener
{
    private RecyclerView notificationsFromUsersRecycleView;
    String strName[] = {"Dr.Muneer", "Ibrahim", "Muhammad", "Rashid", "Shadman"};
    int[] imageLocation = {R.drawable.location};
    int imageDistance[] = {R.drawable.distance_icon};
    int imageMobile [] ={R.drawable.mobile_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications_from_users);
        getSupportActionBar().setTitle("Users Request");
        notificationsFromUsersRecycleView = findViewById(R.id.user_notifications_recycle_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(NotificationsFromUsers.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        notificationsFromUsersRecycleView.setLayoutManager(linearLayoutManager);
        NotificationsFromUsersAdapter adapter = new NotificationsFromUsersAdapter(NotificationsFromUsers.this,strName, imageLocation,imageMobile,imageDistance,this);
        notificationsFromUsersRecycleView.setAdapter(adapter);
    }

    @Override
    public void onNoteClick(int position) {
        Intent jumpToUserGetLocation =  new Intent(getApplicationContext(),GoogleMapUserLocation.class);
        startActivity(jumpToUserGetLocation);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
