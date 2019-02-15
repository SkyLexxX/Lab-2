package ua.lviv.lot.cosmetics.managers;

import ua.lviv.lot.cosmetics.models.Cosmetics;

import java.util.List;

public interface CosmeticsManager {
    List<Cosmetics> sortByVolume(boolean reverser);
    List<Cosmetics> sortByPrice(boolean reverser);
    List<Cosmetics> findByAvailability();
    void setValues();
    void checkBalance();
}
