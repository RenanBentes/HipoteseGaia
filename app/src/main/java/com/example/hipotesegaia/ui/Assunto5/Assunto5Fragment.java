package com.example.hipotesegaia.ui.Assunto5;

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
import com.example.hipotesegaia.databinding.FragmentAssunto5Binding;
import com.example.hipotesegaia.ui.ComentarioManager;

public class Assunto5Fragment extends Fragment {
    private FragmentAssunto5Binding binding;
    private Button link5;
    private ComentarioManager comentarioManager5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Assunto5ViewModel assunto5ViewModel =
                new ViewModelProvider(this).get(Assunto5ViewModel.class);

        binding = FragmentAssunto5Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAssunto5;
        assunto5ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        link5 = root.findViewById(R.id.mais5);
        link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Astronomia")));
            }
        });

        comentarioManager5 = new ComentarioManager(requireContext());
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