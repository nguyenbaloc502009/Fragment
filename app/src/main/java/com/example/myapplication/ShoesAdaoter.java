package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShoesAdaoter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Shoes> shoesArrayList;

    public ShoesAdaoter(Context context, int layout, ArrayList<Shoes> shoesArrayList) {
        this.context = context;
        this.layout = layout;
        this.shoesArrayList = shoesArrayList;
    }

    @Override
    public int getCount() {
        return shoesArrayList.size();
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(viewGroup.getContext())
                .inflate(layout,viewGroup,false);

        ImageView imgShoes=view.findViewById(R.id.imgShoes);
        TextView tvDescription=view.findViewById(R.id.tvDescription);
        TextView tvShowText=view.findViewById(R.id.tvShowText);

        imgShoes.setImageResource(shoesArrayList.get(i).getImg());
        tvDescription.setText(shoesArrayList.get(i).getDescription());
        tvShowText.setText(shoesArrayList.get(i).getShowText());



        return view;
    }
}
