package com.example.android.retrofitwithmvvm.data;

import com.example.android.retrofitwithmvvm.model.PostModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsClient {
    private final static String BASE_URL="https://jsonplaceholder.typicode.com/";
    private  PostInterface postInterface;
    private static PostsClient postsClient;

    private PostsClient() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        postInterface=retrofit.create(PostInterface.class);
    }
    public static PostsClient getInstance(){
        if (postsClient==null)
                postsClient= new PostsClient();

        return postsClient;
    }

    public Call<List<PostModel>> getPosts(){
       return postInterface.getPosts();
    }
}
