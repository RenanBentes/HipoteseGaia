package com.example.hipotesegaia.ui.Assunto7;

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
import com.example.hiptesegaia.databinding.FragmentAssunto7Binding;

public class Assunto7Fragment extends Fragment {

    private FragmentAssunto7Binding binding;
    private Button link7;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Assunto7ViewModel galleryViewModel =
                new ViewModelProvider(this).get(Assunto7ViewModel.class);

        binding = FragmentAssunto7Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAssunto7;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        link7 = root.findViewById(R.id.mais7);
        link7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Qu%C3%ADmica")));
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