package com.example.meishvili.revaz.mynewfinalprojectapplication.main;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.meishvili.revaz.mynewfinalprojectapplication.R;
import com.example.meishvili.revaz.mynewfinalprojectapplication.main.actives.ActivesFragment;
import com.example.meishvili.revaz.mynewfinalprojectapplication.main.cards.CardFragment;
import com.example.meishvili.revaz.mynewfinalprojectapplication.main.history.HistoryFragment;
import com.example.meishvili.revaz.mynewfinalprojectapplication.main.profile.ProfileFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    Context context;

    public ViewPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }



    @Override
    public Fragment getItem(int i) {
        if(i == 0){
            return ProfileFragment.newInstance();
        }
        if(i == 1){
            return ActivesFragment.newInstance();
        }
        if(i == 2){
            return HistoryFragment.newInstance();
        }

        return CardFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return this.context.getResources().getString(R.string.profile);
        }
        if(position == 1){
            return this.context.getResources().getString(R.string.actives);
        }

        if(position == 2){
            return this.context.getResources().getString(R.string.history);
        }
        return this.context.getResources().getString(R.string.cards);
    }

}
