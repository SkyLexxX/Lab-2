package ua.lviv.lot.cosmetics.models;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.TypeOfConsistence;
import ua.lviv.lot.cosmetics.enums.TypeOfCosmetic;

public class Toothpaste extends Cosmetics {
    private String extract;

    public Toothpaste() {
    }

    public Toothpaste(String name, double price, TypeOfCosmetic typeOfCosmetic, TypeOfConsistence typeOfConsistence, Rating rating, int volume, boolean isAvailable, String extract) {
        super(name, price, typeOfCosmetic, typeOfConsistence, rating, volume, isAvailable);
        this.extract = extract;
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }
}
