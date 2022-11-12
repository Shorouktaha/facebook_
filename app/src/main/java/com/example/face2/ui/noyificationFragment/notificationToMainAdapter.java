package com.example.face2.ui.noyificationFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.face2.R;
import com.example.face2.ui.model.notificationModel;
import com.example.face2.ui.model.requestModel;
import com.example.face2.ui.requestFragment.requsetToMainAdapter;

import java.util.List;

public class notificationToMainAdapter extends RecyclerView.Adapter<notificationToMainAdapter.notificationHolder> {
    private List<notificationModel> notifications;

    public notificationToMainAdapter(List<notificationModel> notifications) {
        this.notifications = notifications;
    }

    @NonNull
    @Override
    public notificationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notification_layout,parent,false);
        return new  notificationToMainAdapter.notificationHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull notificationHolder holder, int position) {

        notificationModel notificationModel=notifications.get(position);
        holder.userImg.setImageResource(notificationModel.getUse_img());
        holder.userName.setText(notificationModel.getUser_name());
        holder.post_notifi.setText(notificationModel.getNotif_text());

    }

    @Override
    public int getItemCount() {
        if (notifications!=null)
            return notifications.size();
        return 0;
    }

    public class notificationHolder extends RecyclerView.ViewHolder{
        ImageView userImg;
        TextView userName,post_notifi;
        public notificationHolder(@NonNull View itemView) {
            super(itemView);
            userImg=itemView.findViewById(R.id.user_img_notifi);
            userName=itemView.findViewById(R.id.user_name_notifi);
            post_notifi=itemView.findViewById(R.id.post_notifi);
        }
    }
}
