package ua.lviv.lot.cosmetics.manager;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;
import ua.lviv.lot.cosmetics.enums.UseType;
import ua.lviv.lot.cosmetics.enums.NapType;

import ua.lviv.lot.cosmetics.model.Cosmetics;
import ua.lviv.lot.cosmetics.model.Cream;
import ua.lviv.lot.cosmetics.model.Mascara;
import ua.lviv.lot.cosmetics.model.Toothpaste;
import ua.lviv.lot.cosmetics.model.Soap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CosmeticsManagerImpl implements CosmeticsManager {
    private List<Cosmetics> cosmetics = new ArrayList<>();
    private double customerBalance;

    public CosmeticsManagerImpl() {
    }

    public CosmeticsManagerImpl(final List<Cosmetics> cosmetics) {
        this.cosmetics = cosmetics;
    }

    public List<Cosmetics> getCosmetics() {
        return cosmetics;
    }

    @Override
    public List<Cosmetics> sortByVolume(final boolean reverser) {
        int reverse = (reverser) ? 1 : -1;
        cosmetics.sort((Cosmetics o1, Cosmetics o2) ->
                (reverse * o1.getVolume() - o2.getVolume()));
        return cosmetics;
    }

    @Override
    public List<Cosmetics> sortByPrice(final boolean reverser) {
        int reverse = (reverser) ? 1 : -1;
        cosmetics.sort((Cosmetics o1, Cosmetics o2) ->
                (int) (reverse * (o1.getPrice() - o2.getPrice())));
        return cosmetics;
    }

    @Override
    public List<Cosmetics> findByAvailability() {
        List<Cosmetics> result = new LinkedList<Cosmetics>();
        for (Cosmetics cosmetic : cosmetics) {
            if (cosmetic.isAvailable()) {
                result.add(cosmetic);
            }
        }
        return result;
    }

    @Override
    public String checkBalance() {
        if (customerBalance == 0) {
            System.out.println("Not enough money. Balance = 0 \n");
            return  "Not enough money. Balance = 0";
        } else {
            return  "Yor balance = " + customerBalance;
        }
    }

    @Override
    public void init() {
        cosmetics.add(new Cream("Nivea", 10, CosmeticType.PROTECTIVE,
                ConsistenceType.EMULSION, Rating.EXCELLENT, 130, true,
                UseType.BODY, "Honey"));
        cosmetics.add(new Toothpaste("Colgate", 15, CosmeticType.DECORATIVE,
                ConsistenceType.LIQUID, Rating.GREAT, 125, false,
                "Pineapple"));
        cosmetics.add(new Mascara("mascaraName", 20, CosmeticType.HEALING,
                ConsistenceType.PASTE, Rating.GOOD, 100, false,
                NapType.LONG, true));
        cosmetics.add(new Soap("Head&Shoulders", 25, CosmeticType.HYGIENIC,
                ConsistenceType.SOLID, Rating.GREAT, 200, true,
                72, "Apple"));
    }

    @Override
    public void addCosmetic(final Cosmetics cosmetic) {
        cosmetics.add(cosmetic);
    }

    public final double getCustomerBalance() {
        return customerBalance;
    }

    public final void setCustomerBalance(final double customerBalance) {
        this.customerBalance = customerBalance;
    }
}
