package com.example.tabfargment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainFragment extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(),FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new Fragment1(),"Fantasy");
        vpAdapter.addFragment(new Fragment2(),"Comedy");
        vpAdapter.addFragment(new Fragment3(),"Romance");
        viewPager.setAdapter(vpAdapter);
    }


}
