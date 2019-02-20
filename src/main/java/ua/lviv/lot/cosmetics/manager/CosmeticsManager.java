package ua.lviv.lot.cosmetics.manager;

public interface CosmeticsManager {
    void sortByVolume(boolean reverser);

    void sortByPrice(boolean reverser);

    void findByAvailability();

    void init();

    void checkBalance();
}
