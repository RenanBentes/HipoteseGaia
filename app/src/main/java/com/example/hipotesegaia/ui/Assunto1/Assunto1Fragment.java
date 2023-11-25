package com.example.hipotesegaia.ui.Assunto1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hipotesegaia.R;
import com.example.hipotesegaia.databinding.FragmentAssunto1Binding;
import com.example.hipotesegaia.ui.ComentarioManager;

public class Assunto1Fragment extends Fragment {
    private FragmentAssunto1Binding binding;
    private Button link;
    private ComentarioManager comentarioManager;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Assunto1ViewModel assunto1ViewModel =
                new ViewModelProvider(this).get(Assunto1ViewModel.class);
        binding = FragmentAssunto1Binding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textAssunto1;
        assunto1ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        link = root.findViewById(R.id.mais1);
//        Log.d( "LINK", String.valueOf(link));

        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Ci%C3%AAncias_naturais")));
            }
        });

        comentarioManager = new ComentarioManager(requireContext());

        Button enviarComentarioButton = root.findViewById(R.id.enviarComentario);
        EditText editTextComment = root.findViewById(R.id.editTextComment);

        enviarComentarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String comentario = editTextComment.getText().toString();

                comentarioManager.salvarComentario(comentario);

                Log.d("Comentário", "Comentário do usuário: " + comentario);
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