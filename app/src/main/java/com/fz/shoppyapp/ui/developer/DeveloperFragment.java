package com.fz.shoppyapp.ui.developer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.fz.shoppyapp.R;
import com.fz.shoppyapp.ui.gallery.GalleryViewModel;

public class DeveloperFragment extends Fragment {

    private DeveloperViewModel developerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        developerViewModel =
                new ViewModelProvider(this).get(DeveloperViewModel.class);
        View root = inflater.inflate(R.layout.fragment_developer, container, false);
        final TextView textView = root.findViewById(R.id.text_developer);
        developerViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}