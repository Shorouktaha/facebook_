package com.example.face2.ui.Activities_Main;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.face2.R;

import java.util.ArrayList;

public class fragmentAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragmentsList=new ArrayList<>();
    ArrayList<String>titles=new ArrayList<>();

    public fragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    public void addfragment(Fragment fragment,String title ){
        fragmentsList.add(fragment);
         titles.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
       return titles.get(position) ;

    }
}
