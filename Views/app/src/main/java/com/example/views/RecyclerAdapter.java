package com.example.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CountryViewHolder> {
    private ArrayList<String> countryNamesList;
    private ArrayList<String> detailsList;
    private ArrayList<Integer> imageList;
    private Context context;

    public RecyclerAdapter(ArrayList<String> countryNamesList, ArrayList<String> detailsList, ArrayList<Integer> imageList, Context context) {
        this.countryNamesList = countryNamesList;
        this.detailsList = detailsList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);

        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.CountryViewHolder holder, int position) {
        holder.textViewCountryName.setText(countryNamesList.get(position));
        holder.textViewDetails.setText(detailsList.get(position));
        holder.imageView.setImageResource(imageList.get(position));
        holder.cardView.setOnClickListener(v -> {
            Toast.makeText(context, "You have clicked: " + countryNamesList.get(position), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return countryNamesList.size();
    }


    public class CountryViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewCountryName, textViewDetails;
        private ImageView imageView;
        private CardView cardView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewCountryName = itemView.findViewById(R.id.textViewCountryName);
            textViewDetails = itemView.findViewById(R.id.textViewDetail);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
