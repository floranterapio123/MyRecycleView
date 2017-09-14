package com.rapio.myrecycleview;

import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by rapio on 14/09/2017.
 */

public class customadapter extends RecyclerView.Adapter<customadapter.AndroidViewHolder> {
    ArrayList<androidversion> androidversionArrayList;

    public customadapter(ArrayList<androidversion> androidversionArrayList) {
        this.androidversionArrayList = androidversionArrayList;
    }

    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent,false);
        AndroidViewHolder androidViewHolder = new AndroidViewHolder(v);
        return androidViewHolder;
    }

    @Override
    public int getItemCount() {
        return androidversionArrayList.size();
    }

    public void onBindViewHolder(AndroidViewHolder holder, int i) {
        androidversion version = androidversionArrayList.get(i);
        holder.logo.setImageResource(version.getLogo());
        holder.codename.setText(version.getCodename());
        holder.version.setText(version.getVersion());
        holder.api.setText(version.getApi());
        holder.date.setText(version.getDate());
    }
    public static class AndroidViewHolder extends RecyclerView.ViewHolder{
        ImageView logo;
        TextView codename,version,api,date;
        public AndroidViewHolder(View v) {
            super(v);
            logo = (ImageView)v.findViewById(R.id.iv_logo);
            codename = (TextView) v.findViewById(R.id.tv_codename);
            version = (TextView) v.findViewById(R.id.tv_version);
            api = (TextView) v.findViewById(R.id.tv_api);
            date = (TextView) v.findViewById(R.id.tv_date);

        }
    }
}
