package com.example.face2.ui.noyificationFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.face2.R;
import com.example.face2.databinding.FragmentNotificationBinding;
import com.example.face2.ui.model.notificationModel;

import java.util.ArrayList;


public class notificationFragment extends Fragment {
        RecyclerView notifiRec;
        FragmentNotificationBinding binding;
        notificationToMainAdapter notifiAdapter;
       ArrayList<notificationModel> notifiData= new ArrayList<notificationModel>();
    public notificationFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_notification, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding=FragmentNotificationBinding.bind(view);
        notifiRec=view.findViewById(R.id.notification_recycle);
        setRecNotifi();

    }

    private void setRecNotifi() {
        addFake();
        notifiAdapter =new notificationToMainAdapter(notifiData);
        binding.notificationRecycle.setAdapter(notifiAdapter);
        binding.notificationRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void addFake() {
        notifiData.add(new notificationModel(R.drawable.profile,"mai saad","has reacted to your post :hello girls"));
        notifiData.add(new notificationModel(R.drawable.profile,"dina taha","has commented to your post :hello girls"));
        notifiData.add(new notificationModel(R.drawable.profile,"mlika hamza","has reacted to your post :hello girls"));
        notifiData.add(new notificationModel(R.drawable.profile,"abdo elsadany","has reacted to your post :hello girls"));
        notifiData.add(new notificationModel(R.drawable.profile,"roaa taha","has mention you in a post"));
        notifiData.add(new notificationModel(R.drawable.profile,"fatma hussien","has reacted to your post :hello girls"));
        notifiData.add(new notificationModel(R.drawable.profile,"sahar nayle","has commented to your post :hello girls"));
        notifiData.add(new notificationModel(R.drawable.profile,"doaa taha","has mentioned you in apost in group"));
        notifiData.add(new notificationModel(R.drawable.profile,"shorouk","has reacted to your post :hello girls"));
        notifiData.add(new notificationModel(R.drawable.profile,"rahma ahmed ","has reacted to your post :hello girls"));
    }
}