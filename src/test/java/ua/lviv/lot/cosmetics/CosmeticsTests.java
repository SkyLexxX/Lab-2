package ua.lviv.lot.cosmetics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;
import ua.lviv.lot.cosmetics.enums.Rating;

import ua.lviv.lot.cosmetics.model.Cosmetics;

public class CosmeticsTests {
    @Test
    void testNameGetterAndSetter() {
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.setName("NIVEA");
        assertEquals("NIVEA", cosmetics.getName(),
                "There is an error in getName() or setName()");
    }

    @Test
    void testPriceGetterAndSetter() {
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.setPrice(100);
        assertEquals(100, cosmetics.getPrice(),
                "There is an error in getPrice() or setPrice()");
    }

    @Test
    void testCosmeticTypeGetterAndSetter() {
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.setCosmeticType(CosmeticType.HYGIENIC);
        assertEquals(CosmeticType.HYGIENIC, cosmetics.getCosmeticType(),
                "There is an error in getCosmeticType() or setCosmeticType()");
    }

    @Test
    void testConsistenceTypeGetterAndSetter() {
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.setConsistenceType(ConsistenceType.EMULSION);
        assertEquals(ConsistenceType.EMULSION, cosmetics.getConsistenceType(),
                "There is an error in getConsistenceType() or setConsistenceType()");
    }

    @Test
    void testRatingGetterAndSetter() {
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.setRating(Rating.EXCELLENT);
        assertEquals(Rating.EXCELLENT, cosmetics.getRating(),
                "There is an error in getRating() or setRating()");
    }

    @Test
    void testVolumeGetterAndSetter() {
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.setVolume(125);
        assertEquals(125, cosmetics.getVolume(),
                "There is an error in getVolume() or setVolume()");
    }

    @Test
    void testAvailableGetterAndSetter() {
        Cosmetics cosmetics = new Cosmetics();
        cosmetics.setAvailable(false);
        assertFalse(cosmetics.isAvailable(), "There is an error in isAvailable() or setAvailable()");
    }
}