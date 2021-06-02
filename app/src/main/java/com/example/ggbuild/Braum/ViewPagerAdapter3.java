package com.example.ggbuild.Amumu;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ggbuild.Amumu.AmumuGeneral;
import com.example.ggbuild.Amumu.AmumuItems;
import com.example.ggbuild.Amumu.AmumuRunes;
import com.example.ggbuild.Braum.BraumGeneral;
import com.example.ggbuild.Braum.BraumItems;
import com.example.ggbuild.Braum.BraumRunes;

public class ViewPagerAdapter3 extends FragmentStateAdapter {

    public ViewPagerAdapter3(@NonNull FragmentActivity fragmentActivity){super(fragmentActivity);}

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new BraumGeneral();
            case 1:
                return new BraumItems();
            default:
                return new BraumRunes();
        }

    }


    @Override
    public int getItemCount() {
        return 3;
    }
}
