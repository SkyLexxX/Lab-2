package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.manager.CosmeticsManagerImpl;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        CosmeticsManagerImpl one = new CosmeticsManagerImpl();
        one.init();
        one.sortByVolume(true);
        System.out.println();
        one.sortByPrice(false);
        System.out.println();
        one.setCustomerBalance(0);
        one.checkBalance();
        one.findByAvailability();
    }
}
