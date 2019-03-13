package ua.lviv.lot.cosmetics.manager;

import ua.lviv.lot.cosmetics.model.Cosmetics;

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
        if (reverser) {
            cosmetics.sort((Cosmetics o1, Cosmetics o2) ->
                    (int) (o1.getVolume() - o2.getVolume()));
        } else {
            cosmetics.sort((Cosmetics o1, Cosmetics o2) ->
                    (int) (o2.getVolume() - o1.getVolume()));
        }
        return cosmetics;
    }

    @Override
    public List<Cosmetics> sortByPrice(final boolean reverser) {
        if (reverser) {
            cosmetics.sort((Cosmetics o1, Cosmetics o2) ->
                    (int) (o1.getPrice() - o2.getPrice()));
        } else {
            cosmetics.sort((Cosmetics o1, Cosmetics o2) ->
                    (int) (o2.getPrice() - o1.getPrice()));
        }
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
