package com.example.myadapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<resturant> arr;
    public CustomAdapter(Context context, ArrayList<resturant> arr) {
        this.context=context;
        this.arr= arr;

    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=  LayoutInflater.from(context);
        view= inflater.inflate(R.layout.item,null);

        TextView name= view.findViewById(R.id.name);
        TextView rating= view.findViewById(R.id.rating);
        ImageView imag= view.findViewById(R.id.imageView);
        ImageView loc= view.findViewById(R.id.locition);

        name.setText(arr.get(i).name);
        rating.setText(arr.get(i).rating);
       imag.setImageResource(arr.get(i).imag);
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(arr.get(i).loc));
                context.startActivity(intent);
            }
        });
        return view;
    }
}
