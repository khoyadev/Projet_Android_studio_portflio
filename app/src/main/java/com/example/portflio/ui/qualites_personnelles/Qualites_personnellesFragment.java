package com.example.portflio.ui.qualites_personnelles;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portflio.databinding.FragmentQualitesPersonnellesBinding;

public class Qualites_personnellesFragment extends Fragment {

    private QualitesPersonnellesViewModel mViewModel;
    private FragmentQualitesPersonnellesBinding binding;

    public static Qualites_personnellesFragment newInstance() {
        return new Qualites_personnellesFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentQualitesPersonnellesBinding .inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}