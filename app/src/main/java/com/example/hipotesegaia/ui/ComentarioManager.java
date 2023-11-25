package com.example.hipotesegaia.ui;

import android.content.Context;
import android.content.SharedPreferences;

public class ComentarioManager {

    private SharedPreferences sharedPreferences;

    public ComentarioManager(Context context) {
        sharedPreferences = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE);
    }

    public void salvarComentario(String comentario) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("comentario", comentario);
        editor.apply();
    }

    public String obterComentarioSalvo() {
        return sharedPreferences.getString("comentario", "");
    }
}
