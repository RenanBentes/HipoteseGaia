package com.example.hipotesegaia.ui.Assunto2;

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
import com.example.hiptesegaia.databinding.FragmentAssunto2Binding;

public class Assunto2Fragment extends Fragment {
    private FragmentAssunto2Binding binding;
    private Button link2;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Assunto2ViewModel assunto2ViewModel =
                new ViewModelProvider(this).get(Assunto2ViewModel.class);

        binding = FragmentAssunto2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAssunto2;
        assunto2ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        link2 = root.findViewById(R.id.mais2);
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Matem%C3%A1tica")));
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