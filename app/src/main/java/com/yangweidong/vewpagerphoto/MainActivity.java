package com.yangweidong.vewpagerphoto;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import uk.co.senab.photoview.PhotoViewAttacher;


public class MainActivity extends ActionBarActivity {

    private FragmentManager manager;

    private ViewPager vp;
    private FragAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = (ViewPager) findViewById(R.id.viewpager);





        List<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(new Fragnent1());
        fragments.add(new Fragnent1());
        fragments.add(new Fragnent1());
        fragments.add(new Fragnent1());

        adapter = new FragAdapter(getSupportFragmentManager(), fragments);
        vp.setAdapter(adapter);
        vp.setCurrentItem(0);

        vp.setOffscreenPageLimit(0);



//
//
//        vp = (ViewPager) findViewById(R.id.viewpager);
//
//        List<Fragment> fragments = new ArrayList<Fragment>();
//        fragments.add(new Fragnent1());
//        fragments.add(new Fragnent1());
//
//        adapter = new FragAdapter(getSupportFragmentManager(), fragments);
//        vp.setAdapter(adapter);
//        vp.setCurrentItem(0);



//
//        List<Fragment> fragments = new ArrayList<Fragment>();
//        /* 获取manager */
//        manager = this.getSupportFragmentManager();
//
//
//        Fragnent1 f1 = new Fragnent1();
//        Fragnent1 f2 = new Fragnent1();
//
//
//        /*创建一个Bundle用来存储数据，传递到Fragment中*/
//        Bundle bundle = new Bundle();
//
//        bundle.putInt("res",R.mipmap.ic_launcher);
//        /*把数据设置到Fragment中*/
//        f1.setArguments(bundle);
//        /* 把Fragment添加到对应的位置 */
//
//
//           /*创建一个Bundle用来存储数据，传递到Fragment中*/
//        Bundle bundle2 = new Bundle();
//
//        bundle2.putInt("res", R.mipmap.a);
//
//        f2.setArguments(bundle2);
//
//        fragments.add(f1);
//        fragments.add(f2);
//
//
//        adapter = new FragAdapter(getSupportFragmentManager(), fragments);
//        vp.setAdapter(adapter);
//        //vp.setCurrentItem(0);

//        ImageView image = (ImageView) findViewById(R.id.image);
//        PhotoViewAttacher mAttacher = new PhotoViewAttacher(image);

//        mAttacher.update();




//        ImageView mImageView = (ImageView) findViewById(R.id.iv_photo);
//        mCurrMatrixTv = (TextView) findViewById(R.id.tv_current_matrix);
//
//        Drawable bitmap = getResources().getDrawable(R.mipmap.a);
//        mImageView.setImageDrawable(bitmap);
//
//        // The MAGIC happens here!
//        mAttacher = new PhotoViewAttacher(mImageView);

        // Lets attach some listeners, not required though!
       // mAttacher.setOnMatrixChangeListener(new MatrixChangeListener());
        //mAttacher.setOnPhotoTapListener(new PhotoTapListener());
    }

    private TextView mCurrMatrixTv;

    private PhotoViewAttacher mAttacher;

    private Toast mCurrentToast;

    private Matrix mCurrentDisplayMatrix = null;



    private class PhotoTapListener implements PhotoViewAttacher.OnPhotoTapListener {

        @Override
        public void onPhotoTap(View view, float x, float y) {
            float xPercentage = x * 100f;
            float yPercentage = y * 100f;

            //showToast(String.format(PHOTO_TAP_TOAST_STRING, xPercentage, yPercentage, view == null ? 0 : view.getId()));
        }
    }

    static final String PHOTO_TAP_TOAST_STRING = "Photo Tap! X: %.2f %% Y:%.2f %% ID: %d";
    static final String SCALE_TOAST_STRING = "Scaled to: %.2ff";

    private class MatrixChangeListener implements PhotoViewAttacher.OnMatrixChangedListener {

        @Override
        public void onMatrixChanged(RectF rect) {
            mCurrMatrixTv.setText(rect.toString());
        }
    }
}
