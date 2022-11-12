package com.example.face2.ui.requestFragment;

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
import com.example.face2.databinding.FragmentRequestBinding;
import com.example.face2.ui.model.requestModel;

import java.util.ArrayList;


public class requestFragment extends Fragment {
    FragmentRequestBinding binding;
    requsetToMainAdapter requestAdapter;
    ArrayList<requestModel> requestData= new ArrayList<requestModel>();
    RecyclerView recyclerViewRequest;
    public requestFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding=FragmentRequestBinding.bind(view);
        recyclerViewRequest=view.findViewById(R.id.request_recycle);
        setRecpost();
    }

    private void setRecpost() {
         addFakeRequst();
        requestAdapter=new requsetToMainAdapter(requestData);
        binding.requestRecycle.setAdapter(requestAdapter);
        binding.requestRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void addFakeRequst() {
        requestData.add(new requestModel("fatma",R.drawable.profile));
        requestData.add(new requestModel("roaa",R.drawable.profile));
        requestData.add(new requestModel("eyad",R.drawable.profile));
        requestData.add(new requestModel("malika",R.drawable.profile));
        requestData.add(new requestModel("taha",R.drawable.profile));
        requestData.add(new requestModel("mai",R.drawable.profile));
        requestData.add(new requestModel("shahd",R.drawable.profile));
        requestData.add(new requestModel("dina",R.drawable.profile));
        requestData.add(new requestModel("sahar",R.drawable.profile));
        requestData.add(new requestModel("shimaa",R.drawable.profile));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_request, container, false);
    }
}