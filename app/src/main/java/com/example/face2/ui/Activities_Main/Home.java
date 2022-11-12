package com.example.face2.ui.Activities_Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.face2.R;
import com.example.face2.databinding.AcyivityHomeBinding;
import com.example.face2.ui.homeFragment.HomeFragment;
import com.example.face2.ui.noyificationFragment.notificationFragment;
import com.example.face2.ui.profileFragment.profileFragment;
import com.example.face2.ui.requestFragment.requestFragment;

public class Home extends AppCompatActivity {
    private AcyivityHomeBinding home_bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        home_bind= AcyivityHomeBinding.inflate(getLayoutInflater());
        View view = home_bind.getRoot();
        setContentView(view);
        fragmentAdapter Adapter=new fragmentAdapter(getSupportFragmentManager());
        Adapter.addfragment(new HomeFragment(),"");
        Adapter.addfragment(new requestFragment(),"");
        Adapter.addfragment(new notificationFragment(),"");
        Adapter.addfragment(new profileFragment(),"");
        Adapter.addfragment(new menuFragment(),"");
        home_bind.viewPager.setAdapter(Adapter);

        // tabLayout.setupWithViewPager(viewPager);
        home_bind.tab.setupWithViewPager(home_bind.viewPager);
        //set icons
        home_bind.tab.getTabAt(0).setIcon(R.drawable.home_icon24);
        home_bind.tab.getTabAt(1).setIcon(R.drawable.request);
        home_bind.tab.getTabAt(2).setIcon(R.drawable.ic_baseline_notifications_24);
        home_bind.tab.getTabAt(3).setIcon(R.drawable.ic_baseline_account_circle_24);
        home_bind.tab.getTabAt(4).setIcon(R.drawable.ic_baseline_menu_24);


    }
}