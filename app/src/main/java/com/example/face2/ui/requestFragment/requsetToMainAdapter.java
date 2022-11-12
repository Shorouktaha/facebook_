package com.example.face2.ui.requestFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.face2.R;
import com.example.face2.ui.model.requestModel;

import java.util.List;

public class requsetToMainAdapter extends RecyclerView.Adapter< requsetToMainAdapter.requestHolder>{
    private List<requestModel> request;

    public requsetToMainAdapter(List<requestModel> request) {
        this.request = request;
    }

    @NonNull
    @Override
    public requestHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_requst_layout,parent,false);
        return new  requsetToMainAdapter.requestHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull requestHolder holder, int position) {
        requestModel requestModel=request.get(position);
        holder.userImg.setImageResource(requestModel.getUse_img());
        holder.userName.setText(requestModel.getUser_name());
    }

    @Override
    public int getItemCount() {
        if (request!=null)
            return request.size();
        return 0;
    }

    public class requestHolder extends RecyclerView.ViewHolder {
      ImageView userImg;
      TextView userName;

        public requestHolder(@NonNull View itemView) {
            super(itemView);
            userName=itemView.findViewById(R.id.user_name);
            userImg=itemView.findViewById(R.id.user_img);
        }
    }

}
