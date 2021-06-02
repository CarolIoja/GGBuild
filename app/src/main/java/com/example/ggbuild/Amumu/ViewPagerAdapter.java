package com.example.ggbuild.Amumu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ggbuild.Amumu.AmumuGeneral;
import com.example.ggbuild.Amumu.AmumuItems;
import com.example.ggbuild.Amumu.AmumuRunes;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity){super(fragmentActivity);}

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new AmumuGeneral();
            case 1:
                return new AmumuItems();
            default:
                return new AmumuRunes();
        }

    }


    @Override
    public int getItemCount() {
        return 3;
    }
}
