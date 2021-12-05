package com.example.portflio.ui.references;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;

import com.example.portflio.databinding.FragmentReferencesBinding;

public class ReferencesFragment extends Fragment {

    private ReferencesViewModel mViewModel;
    private FragmentReferencesBinding binding;

    public static ReferencesFragment newInstance() {
        return new ReferencesFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentReferencesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}