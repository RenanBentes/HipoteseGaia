package com.example.hipotesegaia.ui.Assunto6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hipotesegaia.R;
import com.example.hipotesegaia.databinding.FragmentAssunto6Binding;

public class Assunto6Fragment extends Fragment {

    private FragmentAssunto6Binding binding;
    private Button link6;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Assunto6ViewModel galleryViewModel =
                new ViewModelProvider(this).get(Assunto6ViewModel.class);

        binding = FragmentAssunto6Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAssunto6;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        link6 = root.findViewById(R.id.mais6);
        link6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/F%C3%ADsica")));
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}