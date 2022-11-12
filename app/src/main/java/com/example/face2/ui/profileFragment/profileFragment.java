package com.example.face2.ui.profileFragment;

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
import com.example.face2.databinding.FragmentProfileBinding;
import com.example.face2.ui.model.postModel;

import java.util.ArrayList;


public class profileFragment extends Fragment {
    profileToMainAdapter adapter;
    FragmentProfileBinding binding;

    ArrayList<postModel>postData=new ArrayList<>();
    public profileFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding=FragmentProfileBinding.bind(view);
        //recyclerViewPost=view.findViewById(R.id.post_recycle);
        setRecpost();
    }
    private void setRecpost(){

        addFakeData();
       adapter=new profileToMainAdapter(postData);
        //recyclerViewPost.setAdapter(adapter);
        binding.postRecycle.setAdapter(adapter);
       binding.postRecycle.setLayoutManager(new LinearLayoutManager(
                getContext()
        ));
    }

    private void addFakeData() {
        postData.add(new postModel("fatma","hello to you",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("mai","say wellcome to me",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("dina","hello to you",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("shaimaa","hey new user",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("shahd","hello to you",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("roaa taha","hello to you",R.drawable.profile,R.drawable.profile));

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }
}