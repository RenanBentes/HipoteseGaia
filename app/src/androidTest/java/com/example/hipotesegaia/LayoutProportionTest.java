package com.example.hipotesegaia;

import static org.junit.Assert.assertEquals;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LayoutProportionTest {

    @Test
    public void testLayoutProportion() {
        // Acesse o elemento
        Espresso.onView(ViewMatchers.withId(R.id.app_bar_main))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Obtenha as dimensões do elemento (altura e largura)
        int width = InstrumentationRegistry.getInstrumentation().getTargetContext()
                .getResources().getDisplayMetrics().widthPixels;
        int height = InstrumentationRegistry.getInstrumentation().getTargetContext()
                .getResources().getDisplayMetrics().heightPixels;

        // Calcule a proporção esperada (por exemplo, 16:9)
        float expectedAspectRatio = 16f / 9f; // Altere para a proporção desejada

        // Verifique se a proporção do elemento está de acordo com a proporção esperada
        float actualAspectRatio = (float) width / height;
        assertEquals(expectedAspectRatio, actualAspectRatio, 0.1); // Margem de erro adequada
    }
}