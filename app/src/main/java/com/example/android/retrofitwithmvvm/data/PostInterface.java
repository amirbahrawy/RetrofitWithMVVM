package com.example.android.retrofitwithmvvm.data;

import com.example.android.retrofitwithmvvm.model.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
  @GET("posts")
  public Call<List<PostModel>> getPosts();
}
