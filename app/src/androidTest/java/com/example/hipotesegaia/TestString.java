package com.example.hipotesegaia;

import static org.junit.Assert.assertEquals;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.Locale;

@RunWith(AndroidJUnit4.class)
public class TestString {

    @Test
    public void testLanguageMatching() {
        // Idioma esperado em suas strings
        String expectedLanguage = "en";

        // Obtenha o idioma do dispositivo
        Locale deviceLocale = Locale.getDefault();
        String deviceLanguage = deviceLocale.getLanguage();

        // Comparer
        assertEquals(expectedLanguage, deviceLanguage);
    }
}
