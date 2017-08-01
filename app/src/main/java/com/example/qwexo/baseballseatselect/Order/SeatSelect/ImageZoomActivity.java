package com.example.qwexo.baseballseatselect.Order.SeatSelect;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.bumptech.glide.Glide;
import com.example.qwexo.baseballseatselect.R;
import com.example.qwexo.baseballseatselect.databinding.ActivityImageZoomBinding;

import uk.co.senab.photoview.PhotoViewAttacher;

public class ImageZoomActivity extends AppCompatActivity {

    PhotoViewAttacher attacher;
    ActivityImageZoomBinding imageZoomBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageZoomBinding = DataBindingUtil.setContentView(this, R.layout.activity_image_zoom);

        Intent intent = getIntent();
        String stadium = intent.getStringExtra("stadium");

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        switch(stadium){
            case "잠실":
                Glide.with(this)
                        .load(R.drawable.jammain)
                        .into(imageZoomBinding.imageView);
                break;
            //다른야구장 좌석배치 추가할 경우 야구장이미지 추가
        }

        attacher = new PhotoViewAttacher(imageZoomBinding.imageView);
    }
}
