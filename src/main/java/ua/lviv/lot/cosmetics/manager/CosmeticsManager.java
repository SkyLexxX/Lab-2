package ua.lviv.lot.cosmetics.manager;

import ua.lviv.lot.cosmetics.model.Cosmetics;

import java.util.List;

public interface CosmeticsManager {
    List<Cosmetics> sortByVolume(boolean reverser);

    List<Cosmetics> sortByPrice(boolean reverser);

    List<Cosmetics> findByAvailability();

    String checkBalance();

    void addCosmetic(Cosmetics cosmetics);
}
