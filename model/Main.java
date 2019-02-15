package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.manager.CosmeticsManager;
import ua.lviv.lot.cosmetics.manager.CosmeticsManagerImpl;

public class Main {

    public static void main(String[] args) {
        CosmeticsManager one = new CosmeticsManagerImpl();
        one.init();
        one.sortByVolume(true);
        System.out.println();
        one.sortByPrice(false);
        System.out.println();
        ((CosmeticsManagerImpl) one).setCustomerBalance(0);
        ((CosmeticsManagerImpl) one).checkBalance();
        one.findByAvailability();
    }
}
