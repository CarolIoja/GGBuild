package com.example.ggbuild.Gnar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ggbuild.Gnar.GnarGeneral;
import com.example.ggbuild.Gnar.GnarItems;
import com.example.ggbuild.Gnar.GnarRunes;

public class ViewPagerAdapter5 extends FragmentStateAdapter {

    public ViewPagerAdapter5(@NonNull FragmentActivity fragmentActivity){super(fragmentActivity);}

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new GnarGeneral();
            case 1:
                return new GnarItems();
            default:
                return new GnarRunes();
        }

    }


    @Override
    public int getItemCount() {
        return 3;
    }
}
