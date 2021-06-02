package com.example.ggbuild.Anivia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.ggbuild.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ActivityAniviaBuild extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anivia_build);

        TabLayout tabLayout;
        ViewPager2 viewPager2;

        tabLayout = findViewById(R.id.AniviaTab);
        viewPager2 = findViewById(R.id.viewPagerAnivia);

        ViewPagerAdapter2 adapter = new ViewPagerAdapter2(this);
        viewPager2.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            if(position == 0){
                tab.setText("GENERAL");
            }
            if (position == 1){
                tab.setText("ITEMS");
            }
            if (position == 2){
                tab.setText("RUNES");
            }
        }).attach();
    }
}