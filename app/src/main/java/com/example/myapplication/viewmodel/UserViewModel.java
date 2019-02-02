package com.example.myapplication.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;
import com.example.myapplication.model.User;

import java.util.ArrayList;

public class UserViewModel extends BaseObservable {

    private String name;
    private String family;


    private ArrayList<UserViewModel> userViewModelArrayList = new ArrayList<>();

    @Bindable
    public ArrayList<UserViewModel> getUserViewModelArrayList() {
        return userViewModelArrayList;
    }

    public UserViewModel(User user) {
        this.name = user.getName();
        this.family = user.getFamily();
    }

    public UserViewModel() {
        for (int i = 0; i < 5; i++) {
            User user = new User("omid", "zakeri");
            UserViewModel userViewModel = new UserViewModel(user);
            userViewModelArrayList.add(userViewModel);
        }
        notifyPropertyChanged(BR.userViewModelArrayList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }


}
