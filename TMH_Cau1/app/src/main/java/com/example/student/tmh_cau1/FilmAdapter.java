package com.example.student.tmh_cau1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class ViewHolder {
    TextView tvName;
    TextView tvCountry;
    TextView tvPrice;
}

public class FilmAdapter extends BaseAdapter{
    private Context ctx;
    private int layout;
    private ArrayList<Film> list;

    public FilmAdapter(Context ctx, int layout, ArrayList<Film> list) {
        this.ctx = ctx;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder viewHolder;
        View v = view;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(ctx);
            v = inflater.inflate(R.layout.film, null);
            viewHolder = new ViewHolder();
            viewHolder.tvName = v.findViewById(R.id.tvName);
            viewHolder.tvCountry = v.findViewById(R.id.tvCountry);
            viewHolder.tvPrice = v.findViewById(R.id.tvPrice);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Film film = list.get(i);
        viewHolder.tvName.setText(film.getName());
        viewHolder.tvPrice.setText(Double.toString(film.getPrice()));
        viewHolder.tvCountry.setText(film.getCountry());
        return v;
    }
}
