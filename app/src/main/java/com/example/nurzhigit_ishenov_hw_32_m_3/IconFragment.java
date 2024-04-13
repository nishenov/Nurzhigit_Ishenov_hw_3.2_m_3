package com.example.nurzhigit_ishenov_hw_32_m_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class IconFragment extends Fragment {
    private RecyclerView rvIcons;
    private ArrayList<Integer> iconList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_icon, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvIcons = requireActivity().findViewById(R.id.rv_icons);
        loadData();
        IconAdapter iconAdapter = new IconAdapter(iconList);
        rvIcons.setAdapter(iconAdapter);
    }
    public void loadData(){
        iconList.add(R.drawable.ic_launcher_foreground);
        iconList.add(R.drawable.baseline_3p_24);
        iconList.add(R.drawable.baseline_6_ft_apart_24);
        iconList.add(R.drawable.baseline_10k_24);
        iconList.add(R.drawable.baseline_360_24);
        iconList.add(R.drawable.ic_launcher_background);
    }
}