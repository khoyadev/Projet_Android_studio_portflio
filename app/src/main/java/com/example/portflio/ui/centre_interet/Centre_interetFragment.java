package com.example.portflio.ui.centre_interet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;

import com.example.portflio.databinding.FragmentCentreInteretBinding;


public class Centre_interetFragment extends Fragment {

    private CentreInteretViewModel mViewModel;
    private FragmentCentreInteretBinding binding;

    public static Centre_interetFragment newInstance() {
        return new Centre_interetFragment();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentCentreInteretBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}