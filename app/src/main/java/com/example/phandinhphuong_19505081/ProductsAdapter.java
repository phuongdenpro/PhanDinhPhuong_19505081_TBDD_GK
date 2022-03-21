package com.example.phandinhphuong_19505081;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProductsAdapter extends BaseAdapter {
    private Context ctx;
    private int layoutItem;
    private ArrayList<Products> arrayList;
    private int positionSelect = -1;

    public ProductsAdapter(Context ctx, int layoutItem, ArrayList<Products> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
        view = LayoutInflater.from(ctx).inflate(layoutItem, viewGroup, false);

        //Anh xa
        TextView tvName = (TextView) view.findViewById(R.id.tvName);
        TextView tvcast1 = (TextView) view.findViewById(R.id.tvcast1);
        TextView tvcast2 = (TextView) view.findViewById(R.id.tvcast2);
        ImageView img = (ImageView) view.findViewById(R.id.imagePr);


        //
        tvName.setText(arrayList.get(i).getName());
        tvcast1.setText(arrayList.get(i).getCast1());
        tvcast2.setText(arrayList.get(i).getCast2());
        img.setImageResource(arrayList.get(i).getImage());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ctx,arrayList.get(i).getName(),Toast.LENGTH_LONG).show();
                positionSelect = i;
                notifyDataSetChanged();

            }
        });



        return view;
    }
}
