package com.example.informationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.informationbook.fragments.UnitedKingdomFragment;

import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapterCountries extends FragmentStateAdapter {

    public ViewPagerAdapterCountries(@NonNull @NotNull FragmentManager fragmentManager, @NonNull @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        System.out.println("=============================");
        System.out.println(position);
        switch (position) {
            case 0: {
                fragment = UnitedKingdomFragment.newInstance();
                break;
            }
            default:
                return null;

        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
