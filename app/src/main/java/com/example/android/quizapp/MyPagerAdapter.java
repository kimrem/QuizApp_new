package com.example.android.quizapp;

import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    public static int NUM_ITEMS = 7;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages.
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for a particular page.
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return fragment_zero.newInstance();
            case 1:
                return fragment_one.newInstance();
            case 2:
                return fragment_two.newInstance();
            case 3:
                return fragment_three.newInstance();
            case 4:
                return fragment_four.newInstance();
            case 5:
                return fragment_five.newInstance();
            case 6:
                return fragment_six.newInstance();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==6)
        {
            return "Endstand";
        }
        else if (position==0)
        {
            return "Starte Quiz";
        }
        else

            return "Frage " + position;
                }

}
