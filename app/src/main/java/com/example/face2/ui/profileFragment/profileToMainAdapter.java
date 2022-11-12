package com.example.face2.ui.profileFragment;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.face2.R;
import com.example.face2.databinding.ItemPostLayoutBinding;
import com.example.face2.ui.model.postModel;

import java.util.List;

public class profileToMainAdapter extends RecyclerView.Adapter<profileToMainAdapter.holder>{
 private List<postModel> profiles;

    public profileToMainAdapter(List<postModel> profiles) {
        this.profiles = profiles;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPostLayoutBinding binding=ItemPostLayoutBinding.bind(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_post_layout,parent,false));
        return new holder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        postModel postModel=profiles.get(position);
        holder.binding.postImg.setImageResource(postModel.getPost_img());
        holder.binding.userImage.setImageResource(postModel.getUse_img());
        holder.binding.postContant.setText(postModel.getPost());
        holder.binding.userName.setText(postModel.getUsername());
    }

    @Override
    public int getItemCount() {
        if (profiles!=null)
            return profiles.size();
        return 0;
    }

    public class holder extends RecyclerView.ViewHolder{
        ItemPostLayoutBinding binding;
        @SuppressLint("CutPasteId")
        public holder(@NonNull ItemPostLayoutBinding binding) {
            super(binding.getRoot());
           this.binding=binding;

        }
    }
}
