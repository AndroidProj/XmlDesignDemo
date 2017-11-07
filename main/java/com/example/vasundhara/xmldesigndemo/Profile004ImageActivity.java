package com.example.vasundhara.xmldesigndemo;

import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

public class Profile004ImageActivity extends AppCompatActivity {
    ImageView profile_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile004_image);
        profile_img = (ImageView) findViewById(R.id.img_profile_pic);
        Glide.with(Profile004ImageActivity.this)
                .load(R.drawable.profile)
                .asBitmap()
                .centerCrop()
                .into(new BitmapImageViewTarget(profile_img) {
                    @Override
                    protected void setResource(Bitmap resource) {
                        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), resource);
                        roundedBitmapDrawable.setCircular(true);
                        profile_img.setImageDrawable(roundedBitmapDrawable);
                    }
                });
    }
}
