package com.example.meishvili.revaz.mynewfinalprojectapplication.main.actives;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.meishvili.revaz.mynewfinalprojectapplication.R;

public class ActivesFragment extends Fragment {

    public static ActivesFragment newInstance() {

        Bundle args = new Bundle();

        ActivesFragment fragment = new ActivesFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //View view = inflater.inflate(R.layout.fragment_photo,container,false);
        View view = inflater.inflate(R.layout.fragment_actives,container,false);
        return view;
    }
}
