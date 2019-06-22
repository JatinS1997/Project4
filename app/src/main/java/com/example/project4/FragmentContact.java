package com.example.project4;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {


    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> FirstContact;


    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.contact_fragment,container,false);

        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),FirstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);


        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        FirstContact = new ArrayList<>();
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_18));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_17));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_16));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_15));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_14));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_13));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_12));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_11));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_10));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_9));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_8));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_7));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_6));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_5));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_4));
        FirstContact.add(new Contact("Jatin Sharma", "Doctor", R.drawable.pic_3));
    }
}

