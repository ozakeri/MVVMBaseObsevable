package com.example.myapplication.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.viewmodel.MainViewModel;
import com.example.myapplication.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserViewModel userViewModel = new UserViewModel();
        activityMainBinding.setUser(userViewModel
        );
        MainViewModel mainViewModel = new MainViewModel(this);
        activityMainBinding.setMain(mainViewModel);
    }
}
