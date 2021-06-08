package com.example.informationbook.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;


public class UnitedKingdomFragment extends Fragment {

    private ProgressBar progressBarUnitedKingdom;

    public UnitedKingdomFragment() {
    }

    public static UnitedKingdomFragment newInstance() {
        return new UnitedKingdomFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_united_kingdom, container, false);

        ImageView imageViewUnitedKingdom = view.findViewById(R.id.imageViewUnitedKingdom);
        progressBarUnitedKingdom = view.findViewById(R.id.progressBarUnitedKingdom);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/a/ae/Flag_of_the_United_Kingdom.svg/1200px-Flag_of_the_United_Kingdom.svg.png")
                .into(imageViewUnitedKingdom, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarUnitedKingdom.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarUnitedKingdom.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}