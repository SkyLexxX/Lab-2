package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.manager.CosmeticsManagerImpl;

public final class Main {

    private Main() {
    }

    public static void main(final String[] args) {
        CosmeticsManagerImpl cosmeticsManager = new CosmeticsManagerImpl();
        cosmeticsManager.init();
        cosmeticsManager.sortByVolume(true);
        System.out.println();
        cosmeticsManager.sortByPrice(false);
        System.out.println();
        cosmeticsManager.setCustomerBalance(0);
        cosmeticsManager.checkBalance();
        cosmeticsManager.findByAvailability();
    }
}
