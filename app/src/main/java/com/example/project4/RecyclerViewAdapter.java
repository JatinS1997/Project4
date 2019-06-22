package com.example.project4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<Contact> mData;

    public RecyclerViewAdapter(Context mContext, List<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View v;

        v= LayoutInflater.from(mContext).inflate(R.layout.item_contact,viewGroup,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {

        holder.tv_name.setText(mData.get(i).getName());
        holder.tv_title.setText(mData.get(i).getTitle());
        holder.img.setImageResource(mData.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_name;
        private TextView tv_title;
        private ImageView img;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name=(TextView) itemView.findViewById(R.id.name_contact);
            tv_title=(TextView) itemView.findViewById(R.id.title);
            img=(ImageView) itemView.findViewById(R.id.img_contact);
        }
    }
}
