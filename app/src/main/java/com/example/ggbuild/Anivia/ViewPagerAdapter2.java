package com.example.ggbuild.Anivia;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ggbuild.Anivia.AniviaGeneral;
import com.example.ggbuild.Anivia.AniviaItems;
import com.example.ggbuild.Anivia.AniviaRunes;

public class ViewPagerAdapter2 extends FragmentStateAdapter {

    public ViewPagerAdapter2(@NonNull FragmentActivity fragmentActivity){super(fragmentActivity);}

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new AniviaGeneral();
            case 1:
                return new AniviaItems();
            default:
                return new AniviaRunes();
        }

    }


    @Override
    public int getItemCount() {
        return 3;
    }
}
