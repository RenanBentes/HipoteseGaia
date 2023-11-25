package com.example.hipotesegaia;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

import com.example.hipotesegaia.ui.ComentarioManager;

@RunWith(AndroidJUnit4.class)
public class ComentarioManagerTest {

    @Test
    public void testSalvarComentario() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        ComentarioManager comentarioManager = new ComentarioManager(appContext);

        String comentarioTeste = "Este é um comentário de teste";

        comentarioManager.salvarComentario(comentarioTeste);

        assertEquals(comentarioTeste, comentarioManager.obterComentarioSalvo());
    }
}