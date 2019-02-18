package ua.lviv.lot.cosmetics.manager;

public interface CosmeticsManager {
    void sortByVolume(boolean sortOrder);

    void sortByPrice(boolean sortOrder);

    void findByAvailability();

    void init();

    void checkBalance();
}
