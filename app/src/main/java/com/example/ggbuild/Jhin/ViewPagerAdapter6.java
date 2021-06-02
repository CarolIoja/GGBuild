package com.example.ggbuild.Jhin;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class ViewPagerAdapter6 extends FragmentStateAdapter {

    public ViewPagerAdapter6(@NonNull FragmentActivity fragmentActivity){super(fragmentActivity);}

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new JhinGeneral();
            case 1:
                return new JhinItems();
            default:
                return new JhinRunes();
        }

    }


    @Override
    public int getItemCount() {
        return 3;
    }
}
