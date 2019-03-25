package ua.lviv.lot.cosmetics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ua.lviv.lot.cosmetics.model.Toothpaste;

public class ToothpasteTests {
    @Test
    void testExtractGetterAndSetter() {
        Toothpaste toothpaste = new Toothpaste();
        toothpaste.setExtract("Ice");
        assertEquals("Ice", toothpaste.getExtract(),
                "There is an error in getExtract() or setExtract()");
    }
}
