package com.example.myapplication.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.adapter.UserAdapter;

import java.util.ArrayList;

public class MainViewModel extends BaseObservable {
    private Context context;

    public MainViewModel(Context context) {
        this.context = context;
    }

    @BindingAdapter({"bind:setUpRecycler"})
    public static void setUpRecycler (RecyclerView recycler , ArrayList<UserViewModel> userViewModelArrayList){
        recycler.setLayoutManager(new LinearLayoutManager(recycler.getContext()));
        recycler.setAdapter(new UserAdapter(userViewModelArrayList));
    }
}
