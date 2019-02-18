package ua.lviv.lot.cosmetics.manager;

import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;
import ua.lviv.lot.cosmetics.enums.NapType;
import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.UseType;
import ua.lviv.lot.cosmetics.model.Cosmetics;
import ua.lviv.lot.cosmetics.model.Cream;
import ua.lviv.lot.cosmetics.model.Mascara;
import ua.lviv.lot.cosmetics.model.Soap;
import ua.lviv.lot.cosmetics.model.Toothpaste;

import java.util.ArrayList;
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
    public void sortByVolume(final boolean sortOrder) {
        int order = (sortOrder) ? 1 : -1;
        cosmetics.sort((Cosmetics o1, Cosmetics o2) ->
                (order * o1.getVolume() - o2.getVolume()));
        cosmetics.forEach((Cosmetics) ->
                System.out.println(Cosmetics.getVolume()));
    }

    @Override
    public void sortByPrice(final boolean sortOrder) {
        int order = (sortOrder) ? 1 : -1;
        cosmetics.sort((Cosmetics o1, Cosmetics o2) ->
                (int) (order * (o1.getPrice() - o2.getPrice())));
        cosmetics.forEach((Cosmetics) ->
                System.out.println(Cosmetics.getPrice()));
    }

    @Override
    public void findByAvailability() {
        cosmetics.stream().filter(Cosmetics::isAvailable).forEach(cosmetics1 ->
                System.out.println(cosmetics1.getName()));
    }

    @Override
    public void init() {
        cosmetics.add(new Cream("Nivea", 100, CosmeticType.PROTECTIVE,
                ConsistenceType.EMULSION, Rating.EXCELLENT, 130, true,
                UseType.BODY, "Honey"));
        cosmetics.add(new Toothpaste("Colgate", 150, CosmeticType.DECORATIVE,
                ConsistenceType.LIQUID, Rating.GREAT, 125, false,
                "Pineapple"));
        cosmetics.add(new Mascara("mascaraName", 200, CosmeticType.HEALING,
                ConsistenceType.PASTE, Rating.GOOD, 100, true,
                NapType.LONG, true));
        cosmetics.add(new Soap("Head&Shoulders", 250, CosmeticType.HYGIENIC,
                ConsistenceType.SOLID, Rating.GREAT, 200, true,
                72, "Apple"));
    }

    @Override
    public void checkBalance() {
        if (customerBalance == 0) {
            System.out.println("Not enough money. Balance = 0 \n");
        }
    }

    public final double getCustomerBalance() {
        return customerBalance;
    }

    public final void setCustomerBalance(final double customerBalance) {
        this.customerBalance = customerBalance;
    }
}
