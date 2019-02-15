package ua.lviv.lot.cosmetics.models;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.TypeOfConsistence;
import ua.lviv.lot.cosmetics.enums.TypeOfCosmetic;
import ua.lviv.lot.cosmetics.enums.TypeOfUse;

public class Cream extends Cosmetics {
    private TypeOfUse typeOfUse;
    private String extract;

    public Cream() {
    }

    public Cream(String name, double price, TypeOfCosmetic typeOfCosmetic, TypeOfConsistence typeOfConsistence, Rating rating, int volume, boolean isAvailable, TypeOfUse typeOfUse, String extract) {
        super(name, price, typeOfCosmetic, typeOfConsistence, rating, volume, isAvailable);
        this.typeOfUse = typeOfUse;
        this.extract = extract;
    }

    public TypeOfUse getTypeOfUse() {
        return typeOfUse;
    }

    public void setTypeOfUse(TypeOfUse typeOfUse) {
        this.typeOfUse = typeOfUse;
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }
}
