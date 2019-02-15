package ua.lviv.lot.cosmetics.models;

import ua.lviv.lot.cosmetics.enums.*;

public class Toothpaste extends Cosmetics {
    private String extract;

    public Toothpaste() {
    }

    public Toothpaste(String name, double price, CosmeticType cosmeticType, ConsistenceType consistenceType, Rating rating, int volume, boolean isAvailable, String extract) {
        super(name, price, cosmeticType, consistenceType, rating, volume, isAvailable);
        this.extract = extract;
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }
}
