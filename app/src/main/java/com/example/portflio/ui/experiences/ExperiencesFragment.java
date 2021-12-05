package com.example.portflio.ui.experiences;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;

import com.example.portflio.databinding.ActivityMainBinding;
import com.example.portflio.databinding.FragmentExperiencesBinding;

public class ExperiencesFragment extends Fragment {

    private ExperiencesViewModel mViewModel;
    private FragmentExperiencesBinding binding;

    public static ExperiencesFragment newInstance() {
        return new ExperiencesFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentExperiencesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}