package com.example.project4;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context mContext;
    List<ContactData> mData;
    Dialog myDialog;


    public RecyclerViewAdapter(Context mContext, List<ContactData> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        View v;

        v= LayoutInflater.from(mContext).inflate(R.layout.item_contact,viewGroup,false);
        final MyViewHolder vHolder = new MyViewHolder(v);


        //dialog ini

        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_contact);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));







        vHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name_tv = (TextView) myDialog.findViewById(R.id.title);
                TextView dialog_title_tv = (TextView) myDialog.findViewById(R.id.dialog_name_title);
                ImageView dialog_contact_img = (ImageView) myDialog.findViewById(R.id.dialog_img);
                dialog_name_tv.setText(mData.get(vHolder.getAdapterPosition()).getName());
                dialog_title_tv.setText(mData.get(vHolder.getAdapterPosition()).getTitle());
                dialog_contact_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());
                Toast.makeText(mContext,"Test"+String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
                myDialog.show();
            }
        });
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


        private ConstraintLayout item_contact;
        private TextView tv_name;
        private TextView tv_title;
        private ImageView img;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_contact=(ConstraintLayout) itemView.findViewById(R.id.contact_item_id);

            tv_name=(TextView) itemView.findViewById(R.id.name_contact);
            tv_title=(TextView) itemView.findViewById(R.id.title);
            img=(ImageView) itemView.findViewById(R.id.img_contact);
        }
    }
}
