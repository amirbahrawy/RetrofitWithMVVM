package com.example.android.retrofitwithmvvm.ui.main;

import com.example.android.retrofitwithmvvm.data.PostsClient;
import com.example.android.retrofitwithmvvm.model.PostModel;

import java.util.List;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostViewModel extends ViewModel {
    MutableLiveData<List<PostModel>> mutableLiveData=new MutableLiveData<>();
    public void getPosts(){
        PostsClient.getInstance().getPosts().enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {
                     int x=6;
                     int y=x+6;
            }
        });
    }
}
