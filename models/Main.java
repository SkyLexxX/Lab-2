package ua.lviv.lot.cosmetics.models;

import ua.lviv.lot.cosmetics.managers.CosmeticsManager;
import ua.lviv.lot.cosmetics.managers.CosmeticsManagerImpl;

public class Main {

    public static void main(String[] args) {
        CosmeticsManager one = new CosmeticsManagerImpl();
        one.setValues();
        one.sortByVolume(true);
        System.out.println();
        one.sortByPrice(false);
        System.out.println();
        ((CosmeticsManagerImpl) one).setCustomerBalance(0);
        ((CosmeticsManagerImpl) one).checkBalance();
        one.findByAvailability();
    }
}
