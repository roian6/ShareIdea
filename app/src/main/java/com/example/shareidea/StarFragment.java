package com.example.shareidea;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.shareidea.databinding.FragmentMemoBinding;
import com.example.shareidea.databinding.FragmentStarBinding;

public class StarFragment extends Fragment {

    public static StarFragment newInstance(){
        return new StarFragment();
    }

    private Context mContext;
    private FragmentStarBinding binding;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_star, container, false);


        return binding.getRoot();
    }

}