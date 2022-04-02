package com.example.task_recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task_recyclerview.databinding.ItemListBinding;

import java.util.ArrayList;
import java.util.List;

class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ListAdapterViewHolder> {

    ItemListBinding mBinding;

    private List<Models> listModel = new ArrayList();

    @NonNull
    @Override
    public MyListAdapter.ListAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ListAdapterViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ListAdapterViewHolder holder, int position) {

        mBinding.textview.setText(listModel.get(position).getTitle());
        mBinding.myImage.setImageDrawable(mBinding.myImage.getContext().getResources().getDrawable(listModel.get(position).image));
        mBinding.myImage.setOnClickListener(view -> {
            Toast.makeText(mBinding.myImage.getContext(), "" + position, Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return listModel.size();
    }

    public void setData(List<Models> list) {
        listModel = list;
        notifyDataSetChanged();
    }

    class ListAdapterViewHolder extends RecyclerView.ViewHolder {
        public ListAdapterViewHolder(ItemListBinding binding) {
            super(binding.getRoot());
            mBinding = binding;

        }
    }
}
