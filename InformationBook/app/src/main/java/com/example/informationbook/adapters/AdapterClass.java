package com.example.informationbook.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.informationbook.ModelClass;
import com.example.informationbook.R;
import com.example.informationbook.activities.CountriesActivity;
import com.example.informationbook.activities.LeadersActivity;
import com.example.informationbook.activities.MuseumsActivity;
import com.example.informationbook.activities.WondersActivity;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder> {
    private final ArrayList<ModelClass> modelClassList;
    private final Context context;

    public AdapterClass(ArrayList<ModelClass> modelClassList, Context context) {
        this.modelClassList = modelClassList;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterClass.CardViewHolder holder, int position) {

        ModelClass modelClass = modelClassList.get(position);
        holder.textViewSplash.setText(modelClass.getCategoryName());
        holder.imageViewSplash.setImageResource(context.getResources()
                .getIdentifier(modelClass.getImageName(), "drawable", context.getPackageName()));
        holder.cardView.setOnClickListener(v -> {
            if(position == 0) {
                Intent intent = new Intent(context, CountriesActivity.class);
                context.startActivity(intent);
            }
            if(position == 1) {
                Intent intent = new Intent(context, LeadersActivity.class);
                context.startActivity(intent);
            }
            if(position == 2) {
                Intent intent = new Intent(context, MuseumsActivity.class);
                context.startActivity(intent);
            }
            if(position == 3) {
                Intent intent = new Intent(context, WondersActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {

        private final ImageView imageViewSplash;
        private final TextView textViewSplash;
        private final CardView cardView;

        public CardViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
