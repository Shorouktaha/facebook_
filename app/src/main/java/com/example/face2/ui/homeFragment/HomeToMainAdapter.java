package com.example.face2.ui.homeFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.face2.R;
import com.example.face2.ui.model.postModel;

import java.util.List;

public class HomeToMainAdapter extends RecyclerView.Adapter<HomeToMainAdapter.postHolder> {
   public List<postModel>posts;

    public HomeToMainAdapter(List<postModel> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public postHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post_layout,parent,false);
        return new postHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull postHolder holder, int position) {
       postModel postModel=posts.get(position);
       holder.photoPost.setImageResource(postModel.getPost_img());
       holder.username.setText(postModel.getUsername());
       holder.userImag.setImageResource(postModel.getUse_img());
       holder.postcontant.setText(postModel.getPost());
    }

    @Override
    public int getItemCount() {
        if (posts!=null)
            return posts.size();
        return 0;
    }
    static class postHolder extends RecyclerView.ViewHolder{

        TextView username,postcontant;
        ImageView photoPost,userImag;
        public postHolder(@NonNull View itemView) {
            super(itemView);
            username=itemView.findViewById(R.id.user_name);
            postcontant=itemView.findViewById(R.id.post_contant);
            userImag=itemView.findViewById(R.id.user_image);
            photoPost=itemView.findViewById(R.id.post_img);
        }
    }
}
