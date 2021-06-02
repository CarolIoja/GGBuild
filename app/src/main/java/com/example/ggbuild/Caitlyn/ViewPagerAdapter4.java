package com.example.ggbuild.Anivia;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ggbuild.Caitlyn.CaitlynGeneral;
import com.example.ggbuild.Caitlyn.CaitlynItems;
import com.example.ggbuild.Caitlyn.CaitlynRunes;

public class ViewPagerAdapter4 extends FragmentStateAdapter {

    public ViewPagerAdapter4(@NonNull FragmentActivity fragmentActivity){super(fragmentActivity);}

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new CaitlynGeneral();
            case 1:
                return new CaitlynItems();
            default:
                return new CaitlynRunes();
        }

    }


    @Override
    public int getItemCount() {
        return 3;
    }
}
