package ua.lviv.lot.cosmetics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ua.lviv.lot.cosmetics.enums.UseType;
import ua.lviv.lot.cosmetics.model.Cream;


public class CreamTests {
    @Test
    void testUseTypeGetterAndSetter() {
        Cream cream = new Cream();
        cream.setUseType(UseType.FACE);
        assertEquals(UseType.FACE, cream.getUseType(),
                "There is an error in getUseType() or setUseType()");
    }

    @Test
    void testExtractGetterAndSetter() {
        Cream cream = new Cream();
        cream.setExtract("Honey");
        assertEquals("Honey", cream.getExtract(),
                "There is an error in getExtract() or setExtract()");
    }
}
