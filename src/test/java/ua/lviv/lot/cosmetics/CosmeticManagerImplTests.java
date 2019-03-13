package ua.lviv.lot.cosmetics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;
import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.UseType;
import ua.lviv.lot.cosmetics.enums.NapType;

import ua.lviv.lot.cosmetics.manager.CosmeticsManager;
import ua.lviv.lot.cosmetics.manager.CosmeticsManagerImpl;

import ua.lviv.lot.cosmetics.model.Cream;
import ua.lviv.lot.cosmetics.model.Mascara;
import ua.lviv.lot.cosmetics.model.Soap;
import ua.lviv.lot.cosmetics.model.Toothpaste;
import ua.lviv.lot.cosmetics.model.Cosmetics;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CosmeticManagerImplTests {

    private CosmeticsManager cosmeticsManager;

    @BeforeEach
    public void setUp() {
        cosmeticsManager = new CosmeticsManagerImpl();
        cosmeticsManager.addCosmetic(new Cream("Nivea", 10, CosmeticType.PROTECTIVE,
                ConsistenceType.EMULSION, Rating.EXCELLENT, 130, true,
                UseType.BODY, "Honey"));
        cosmeticsManager.addCosmetic(new Toothpaste("Colgate", 15, CosmeticType.DECORATIVE,
                ConsistenceType.LIQUID, Rating.GREAT, 125, false,
                "Pineapple"));
        cosmeticsManager.addCosmetic(new Mascara("mascaraName", 20, CosmeticType.HEALING,
                ConsistenceType.PASTE, Rating.GOOD, 100, false,
                NapType.LONG, true));
        cosmeticsManager.addCosmetic(new Soap("Head&Shoulders", 25, CosmeticType.HYGIENIC,
                ConsistenceType.SOLID, Rating.GREAT, 200, true,
                72, "Apple"));
    }

    @Test
    void testCustomerBalance() {
        CosmeticsManagerImpl cosmeticsManager = new CosmeticsManagerImpl();
        cosmeticsManager.setCustomerBalance(50);
        assertEquals(50, cosmeticsManager.getCustomerBalance(),
                "There is an error in getCustomerBalance() or setCustomerBalance()");
    }

    @Test
    void testCheckBalance() {
        CosmeticsManagerImpl cosmeticsManager = new CosmeticsManagerImpl();
        cosmeticsManager.setCustomerBalance(0);
        assertEquals("Not enough money. Balance = 0", cosmeticsManager.checkBalance(),
                "There is an error in CheckBalance()");
    }

    @Test
    void testFindByAvailability() {
        assertEquals(2, cosmeticsManager.findByAvailability().size());
    }

    @Test
    void testSortByPriceInDescendingOrder() {
        List<Cosmetics> result = cosmeticsManager.sortByPrice(false);

        for (int i = 0; i < result.size(); i++) {
            if (i == 0) continue;
            assertTrue(result.get(i - 1).getPrice() > result.get(i).getPrice(),
                    "SortByPrice() doesn't work correctly");
        }
    }

    @Test
    void testSortByPriceInAscendingOrder() {
        List<Cosmetics> result = cosmeticsManager.sortByPrice(true);

        for (int i = 0; i < result.size(); i++) {
            if (i == 0) continue;
            assertTrue(result.get(i - 1).getPrice() < result.get(i).getPrice(),
                    "SortByPrice() doesn't work correctly");
        }
    }

    @Test
    void testSortByVolumeInDescendingOrder() {
        List<Cosmetics> result = cosmeticsManager.sortByVolume(false);

        for (int i = 0; i < result.size(); i++) {
            if (i == 0) continue;
            assertTrue(result.get(i - 1).getVolume() > result.get(i).getVolume(),
                    "sortByVolume() doesn't work correctly");
        }
    }

    @Test
    void testSortByVolumeInAscendingOrder() {
        List<Cosmetics> result = cosmeticsManager.sortByVolume(true);

        for (int i = 0; i < result.size(); i++) {
            if (i == 0) continue;
            assertTrue(result.get(i - 1).getVolume() < result.get(i).getVolume(),
                    "SortByVolume() doesn't work correctly");
        }
    }
}
