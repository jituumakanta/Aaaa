package com.example.jitu.hfgxfx;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;


import java.util.List;

/**
 * Created by jitu on 12/9/2016.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    List<Bean> listObjects;
    public Context context;

    public CardAdapter(List<Bean> listObjects,Context context) {
        this.listObjects = listObjects;
        this.context = context;
        System.out.println(listObjects);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

            final Bean obj = listObjects.get(position);
            Log.d("fff",obj.getTitle());
            holder.textViewName1.setText("hhh");
            holder.textViewName2.setText("dddd");
            holder.textViewName3.setText("eee");


    }

    @Override
    public int getItemCount() {
       // Toast.makeText(context,"hhh",Toast.LENGTH_LONG).show();
       // System.out.println("gggggggggggggggggggggggggggggggggggggg");
        return listObjects.size();

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName1;
        public TextView textViewName2;
        public TextView textViewName3;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewName1 = (TextView) itemView.findViewById(R.id.bbz);
            textViewName2 = (TextView) itemView.findViewById(R.id.ccz);
            textViewName3 = (TextView) itemView.findViewById(R.id.ddz);

        }
    }///////////////////////////////////////////////////////////////////////////////////////////// create viewes

}
