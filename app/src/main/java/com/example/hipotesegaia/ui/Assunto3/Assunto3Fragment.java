package com.example.hipotesegaia.ui.Assunto3;

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
import com.example.hipotesegaia.databinding.FragmentAssunto3Binding;
import com.example.hipotesegaia.ui.ComentarioManager;

public class Assunto3Fragment extends Fragment {
    private FragmentAssunto3Binding binding;
    private Button link3;
    private ComentarioManager comentarioManager3;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Assunto3ViewModel assunto3ViewModel =
                new ViewModelProvider(this).get(Assunto3ViewModel.class);

        binding = FragmentAssunto3Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAssunto3;
        assunto3ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        link3 = root.findViewById(R.id.mais3);
        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Probabilidade")));
            }
        });

        comentarioManager3 = new ComentarioManager(requireContext());
        Button enviarComentarioButton = root.findViewById(R.id.enviarComentario3);
        EditText editTextComment = root.findViewById(R.id.editTextComment3);

        enviarComentarioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String comentario = editTextComment.getText().toString();
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