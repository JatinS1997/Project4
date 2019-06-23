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

public class FragmentContactTabs extends Fragment {


    View v;
    private RecyclerView myrecyclerview;
    private List<ContactData> firstContactTabs;


    public FragmentContactTabs() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.contact_fragment_tabs,container,false);

        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), firstContactTabs);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);


        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        firstContactTabs = new ArrayList<>();
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_18));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_17));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_16));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_15));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_14));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_13));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_12));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_11));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_10));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_9));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_8));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_7));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_6));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_5));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_4));
        firstContactTabs.add(new ContactData("Jatin Sharma", "Doctor", R.drawable.pic_3));
    }
}

