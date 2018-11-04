package com.example.android.sweetlab;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context context;
    private ArrayList<Datos> list;

    public Adaptador(Context context, ArrayList<Datos> list) {
        this.context = context;
        this.list = list;




    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {

        return list.get(position);
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Datos Item=(Datos) getItem(position);
        convertView= LayoutInflater.from(context).inflate(R.layout.item,null);
        ImageView chuche=convertView.findViewById(R.id.chuche);
        TextView nombre=convertView.findViewById(R.id.nombre);
        chuche.setImageResource(Item.getChuche());
        nombre.setText(Item.getNombre());
        return convertView;
    }
}
