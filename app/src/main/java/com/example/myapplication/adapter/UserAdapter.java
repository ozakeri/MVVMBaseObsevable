package com.example.myapplication.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ItemUserBinding;
import com.example.myapplication.viewmodel.UserViewModel;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.CustomView> {

    ArrayList<UserViewModel> userViewModelArrayList = new ArrayList<>();
    private LayoutInflater layoutInflater;

    public UserAdapter(ArrayList<UserViewModel> arrayList) {
        this.userViewModelArrayList = arrayList;
    }

    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        layoutInflater = LayoutInflater.from(viewGroup.getContext());
        ItemUserBinding itemUserBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_list, viewGroup, false);
        return new CustomView(itemUserBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView customView, int i) {
        UserViewModel userViewModel = userViewModelArrayList.get(i);
        customView.bind(userViewModel);
    }

    @Override
    public int getItemCount() {
        return userViewModelArrayList.size();
    }

    public class CustomView extends RecyclerView.ViewHolder {


        private ItemUserBinding itemUserBinding;

        public CustomView(ItemUserBinding itemUserBinding) {
            super(itemUserBinding.getRoot());
            this.itemUserBinding = itemUserBinding;
        }

        public void bind(UserViewModel userViewModel) {
            itemUserBinding.setUser(userViewModel);
            itemUserBinding.executePendingBindings();
        }

        public ItemUserBinding getItemUserBinding() {
            return itemUserBinding;
        }
    }
}
