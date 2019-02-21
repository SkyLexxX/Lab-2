package ua.lviv.lot.cosmetics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import ua.lviv.lot.cosmetics.enums.NapType;
import ua.lviv.lot.cosmetics.model.Mascara;

public class MascaraTests {
    @Test
    void testNapTypeGetterAndSetter() {
        Mascara mascara = new Mascara();
        mascara.setNapType(NapType.LONG);
        assertEquals(NapType.LONG, mascara.getNapType(),
                "There is an error in getNapType() or setNapType()");
    }

    @Test
    void testSolubleGetterAndSetter() {
        Mascara mascara = new Mascara();
        mascara.setSoluble(true);
        assertTrue(mascara.isSoluble(), "There is an error in isSoluble() or setSoluble()");
    }
}
