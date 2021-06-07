package com.example.informationbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewSplash;
        private TextView textViewSplash;

        public CardViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);
        }
    }
}
