package com.example.gridview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class GridAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> textList = new ArrayList<>();
    ArrayList<Integer> imageList = new ArrayList<>();

    public GridAdapter(Context context, ArrayList<String> textList, ArrayList<Integer> imageList) {
        this.context = context;
        this.textList = textList;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return textList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        @SuppressLint("ViewHolder") View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_layout, parent, false);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView);

        textView.setText(textList.get(position));
        imageView.setImageResource(imageList.get(position));

        return view;
    }
}
