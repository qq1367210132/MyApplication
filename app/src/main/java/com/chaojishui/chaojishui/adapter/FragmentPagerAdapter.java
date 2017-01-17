package com.chaojishui.chaojishui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.chaojishui.chaojishui.activity.home.TabFragment;

/**
 * Created by htc on 2017/1/17.
 */
public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
    public final int COUNT = 9;
    private String[] titles = new String[]{"搞笑", "接龙", "吐槽", "动图", "伤感", "感人", "短篇", "连载", "其他"};
    private Context context;

    public FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return TabFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}