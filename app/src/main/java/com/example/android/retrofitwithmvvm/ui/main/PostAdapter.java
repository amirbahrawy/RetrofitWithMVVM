package com.example.android.retrofitwithmvvm.ui.main;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.retrofitwithmvvm.R;
import com.example.android.retrofitwithmvvm.model.PostModel;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
   private List<PostModel> postList=new ArrayList<>();


    public void setPostList(List<PostModel> postList) {
        this.postList = postList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PostAdapter.PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new PostViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.PostViewHolder holder, int position) {
        holder.titleTv.setText(postList.get(position).getTitle());
        holder.userTv.setText(postList.get(position).getUserID()+"");
        holder.bodyTv.setText(postList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView titleTv,userTv,bodyTv;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTv=itemView.findViewById(R.id.titleTV);
            userTv=itemView.findViewById(R.id.userIdTV);
            bodyTv=itemView.findViewById(R.id.bodyTV);
        }
    }
}
