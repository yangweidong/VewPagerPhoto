package com.yangweidong.vewpagerphoto;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by yangweidong on 15/5/17.
 */
public class FragAdapter extends FragmentPagerAdapter {


    private List<Fragment> fragments;


    public FragAdapter(FragmentManager fm) {
        super(fm);
    }

    public FragAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
