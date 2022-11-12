package com.example.face2.ui.homeFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.face2.R;
import com.example.face2.databinding.FragmentHomeBinding;
import com.example.face2.ui.model.postModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    HomeToMainAdapter postAdapter;
    ArrayList<postModel> postData= new ArrayList<postModel>();
    RecyclerView recyclerViewPost;
    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding=FragmentHomeBinding.bind(view);
        recyclerViewPost=view.findViewById(R.id.post_recycle);
        setRecpost();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    private void setRecpost(){

        addFakeData();
        postAdapter=new HomeToMainAdapter(postData);
        binding.postRecycle.setAdapter(postAdapter);
        binding.postRecycle.setLayoutManager(new LinearLayoutManager(
                getContext()
        ));
    }
    private void addFakeData(){

        postData.add(new postModel("fatma","hello to you",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("mai","say wellcome to me",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("dina","hello to you",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("shaimaa","hey new user",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("shahd","hello to you",R.drawable.profile,R.drawable.profile));
        postData.add(new postModel("roaa taha","hello to you",R.drawable.profile,R.drawable.profile));
    }
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu1,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}