package ua.lviv.lot.cosmetics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ua.lviv.lot.cosmetics.model.Soap;

public class SoapTests {
    @Test
    void testFatPercentageGetterAndSetter() {
        Soap soap = new Soap();
        soap.setFatPercentage(72);
        assertEquals(72, soap.getFatPercentage(),
                "There is an error in getFatPercentage() or setFatPercentage()");
    }

    @Test
    void testTasteGetterAndSetter() {
        Soap soap = new Soap();
        soap.setTaste("Apple");
        assertEquals("Apple", soap.getTaste(),
                "There is an error in getTaste() or setTaste()");
    }
}
