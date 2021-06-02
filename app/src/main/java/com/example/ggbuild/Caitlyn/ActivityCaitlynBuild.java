package com.example.ggbuild.Caitlyn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.ggbuild.Amumu.ViewPagerAdapter3;
import com.example.ggbuild.Anivia.ViewPagerAdapter4;
import com.example.ggbuild.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ActivityCaitlynBuild extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caitlyn_build);

        TabLayout tabLayout;
        ViewPager2 viewPager2;

        tabLayout = findViewById(R.id.CaitlynTab);
        viewPager2 = findViewById(R.id.viewPagerCaitlyn);

        ViewPagerAdapter4 adapter = new ViewPagerAdapter4(this);
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