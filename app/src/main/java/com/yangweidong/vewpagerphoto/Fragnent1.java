package com.yangweidong.vewpagerphoto;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;


/**
 * Created by yangweidong on 15/5/17.
 */
public class Fragnent1 extends Fragment {

    private ImageView btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        Log.i("Main", "onResume");

        mAttacher.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

        super.onResume();
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("Main","onCreateView");
        View view = inflater.inflate(R.layout.viewpager1, container, false);
        Bundle bundle = this.getArguments();
//        //btn = (ImageView) view.findViewById(R.id.image);
//
//        //btn.setBackgroundResource(bundle.getInt("res"));
//        //PhotoViewAttacher mAttacher = new PhotoViewAttacher(btn);
//        //mAttacher.update();
        PhotoView mImageView = (PhotoView) view.findViewById(R.id.iv_photo);
//
        mImageView.setImageResource(R.mipmap.a);

//        mImageView.setImageResource(bundle.getInt("res"));
        // The MAGIC happens here!
        mAttacher = new PhotoViewAttacher(mImageView);

        return view;
    }
    private PhotoViewAttacher mAttacher;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onPause() {
        Log.i("Main","onPause");

        super.onPause();
    }
}
