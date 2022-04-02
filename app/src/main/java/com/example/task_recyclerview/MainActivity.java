package com.example.task_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.task_recyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    List<Models> mListData = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mListData.add(new Models("Email", R.drawable.envelope));
        mListData.add(new Models("Settings", R.drawable.settings));
        mListData.add(new Models("Favorite", R.drawable.star));
        mListData.add(new Models("User", R.drawable.user));
        mListData.add(new Models("Apps", R.drawable.apps));
        mListData.add(new Models("Email", R.drawable.envelope));
        mListData.add(new Models("Settings", R.drawable.settings));
        mListData.add(new Models("Favorite", R.drawable.star));


        MyListAdapter adapter = new MyListAdapter();
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mBinding.recyclerView.setAdapter(adapter);
        adapter.setData(mListData);


    }

}