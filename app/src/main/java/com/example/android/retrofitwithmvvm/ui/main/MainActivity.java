package com.example.android.retrofitwithmvvm.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.android.retrofitwithmvvm.R;
import com.example.android.retrofitwithmvvm.model.PostModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    PostViewModel postViewModel;
    RecyclerView recyclerView;
    PostAdapter postAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        postViewModel= ViewModelProviders.of(this).get(PostViewModel.class);
        postViewModel.getPosts();

        recyclerView=findViewById(R.id.recycler);
        postAdapter=new PostAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(postAdapter);

        postViewModel.mutableLiveData.observe(this, new Observer<List<PostModel>>() {
            @Override
            public void onChanged(List<PostModel> postModels) {
                postAdapter.setPostList(postModels);

            }
        });

    }
}
