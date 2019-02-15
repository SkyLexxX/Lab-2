package ua.lviv.lot.cosmetics.models;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.TypeOfConsistence;
import ua.lviv.lot.cosmetics.enums.TypeOfCosmetic;
import ua.lviv.lot.cosmetics.enums.TypeOfNap;

public class Mascara extends Cosmetics {
    private TypeOfNap typeOfNap;
    private boolean isSoluble;

    public Mascara() {
    }

    public Mascara(String name, double price, TypeOfCosmetic typeOfCosmetic, TypeOfConsistence typeOfConsistence, Rating rating, int volume, boolean isAvailable, TypeOfNap typeOfNap, boolean isSoluble) {
        super(name, price, typeOfCosmetic, typeOfConsistence, rating, volume, isAvailable);
        this.typeOfNap = typeOfNap;
        this.isSoluble = isSoluble;
    }

    public TypeOfNap getTypeOfNap() {
        return typeOfNap;
    }

    public void setTypeOfNap(TypeOfNap typeOfNap) {
        this.typeOfNap = typeOfNap;
    }

    public boolean isSoluble() {
        return isSoluble;
    }

    public void setSoluble(boolean soluble) {
        isSoluble = soluble;
    }
}
