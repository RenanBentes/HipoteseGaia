package com.example.hipotesegaia.ui.Assunto9;

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

import com.example.hiptesegaia.R;
import com.example.hiptesegaia.databinding.FragmentAssunto9Binding;

public class Assunto9Fragment extends Fragment {

    private FragmentAssunto9Binding binding;
    private Button link9;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Assunto9ViewModel galleryViewModel =
                new ViewModelProvider(this).get(Assunto9ViewModel.class);

        binding = FragmentAssunto9Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAssunto9;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        link9 = root.findViewById(R.id.mais9);
        link9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Oceanografia")));
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