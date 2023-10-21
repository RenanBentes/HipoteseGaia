package com.example.hipotesegaia.ui.Assunto8;

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
import com.example.hiptesegaia.databinding.FragmentAssunto8Binding;

public class Assunto8Fragment extends Fragment {

    private FragmentAssunto8Binding binding;
    private Button link8;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Assunto8ViewModel galleryViewModel =
                new ViewModelProvider(this).get(Assunto8ViewModel.class);

        binding = FragmentAssunto8Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAssunto8;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        link8 = root.findViewById(R.id.mais8);
        link8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Geoci%C3%AAncia")));
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