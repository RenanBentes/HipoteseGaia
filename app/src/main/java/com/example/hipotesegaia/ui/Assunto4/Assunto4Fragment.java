package com.example.hipotesegaia.ui.Assunto4;

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
import com.example.hipotesegaia.databinding.FragmentAssunto4Binding;
import com.example.hipotesegaia.ui.ComentarioManager;

public class Assunto4Fragment extends Fragment {

    private FragmentAssunto4Binding binding;
    private Button link4;
    private ComentarioManager comentarioManager4;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Assunto4ViewModel galleryViewModel =
                new ViewModelProvider(this).get(Assunto4ViewModel.class);

        binding = FragmentAssunto4Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAssunto4;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        link4 = root.findViewById(R.id.mais4);
        link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikipedia.org/wiki/Ci%C3%AAncia_da_computa%C3%A7%C3%A3o")));
            }
        });

        comentarioManager4 = new ComentarioManager(requireContext());
        Button enviarComentarioButton = root.findViewById(R.id.enviarComentario4);
        EditText editTextComment = root.findViewById(R.id.editTextComment4);

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