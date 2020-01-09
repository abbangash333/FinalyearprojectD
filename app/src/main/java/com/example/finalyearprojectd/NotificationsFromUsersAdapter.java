package com.example.finalyearprojectd;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class NotificationsFromUsersAdapter extends RecyclerView.Adapter<NotificationsFromUsersAdapter.MyViewHolder> {
    private Context mContext;
    String name[];
    int imageLocationAdapter[];
    int imageMobileAdapter[];
    int imageDistanceApater[];
    private OnNoteListener mOnNoteListener;

    public NotificationsFromUsersAdapter(Context mContext, String[] name, int[] imageLocationAdapter, int[] imageMobileAdapter, int[] imageDistanceApater,OnNoteListener onNoteListener) {
        this.mContext = mContext;
        this.name = name;
        this.imageLocationAdapter = imageLocationAdapter;
        this.imageMobileAdapter = imageMobileAdapter;
        this.imageDistanceApater = imageDistanceApater;
        this.mOnNoteListener = onNoteListener;
    }

    @NonNull
    @Override

    public  NotificationsFromUsersAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_items_for_user_notifications, parent, false);
        return new MyViewHolder(view, mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder userNotificationViewHolder, int position) {
        userNotificationViewHolder.userLocationImageView.setImageResource(R.drawable.location);
        userNotificationViewHolder.userPhoneImageView.setImageResource(R.drawable.mobile_icon);
        userNotificationViewHolder.userDistanceImageView.setImageResource(R.drawable.distance_icon);
        userNotificationViewHolder.userNameTextView.setText(name[position]);
        userNotificationViewHolder.getLocationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, GoogleMapUserLocation.class);
                mContext.startActivity(intent);
            }
        });
//          ambulaceViewHolder.ivProfile.setImageResource(image[i]);
//            userNotificationViewHolder.userLocationImageView.setImageResource(imageLocationAdapter[position]);
//            userNotificationViewHolder.userPhoneImageView.setImageResource(imageMobileAdapter[position]);
//            userNotificationViewHolder.userDistanceImageView.setImageResource(imageDistanceApater[position]);
//            userNotificationViewHolder.userNameTextView.setText(name[position]);




    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        OnNoteListener mOnNoteListener;
        private ImageView userLocationImageView;
        private ImageView userPhoneImageView;
        private  ImageView userDistanceImageView;
        private TextView userNameTextView;
        private  TextView getLocationTextView;
        public MyViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            userLocationImageView = itemView.findViewById(R.id.user_location_imageView);
            userPhoneImageView = itemView.findViewById(R.id.user_mobile_image_view);
            userDistanceImageView =itemView.findViewById(R.id.ambulance_distance_image_view);
            userNameTextView = itemView.findViewById(R.id.user_name_textView);
            getLocationTextView = itemView.findViewById(R.id.get_location);
            mOnNoteListener = onNoteListener;
//            itemView.setOnClickListener(this);


        }
        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick: " + getAdapterPosition());
            mOnNoteListener.onNoteClick(getAdapterPosition());
        }
    }
    public interface OnNoteListener{
        void onNoteClick(int position);
    }
}
