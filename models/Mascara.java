package ua.lviv.lot.cosmetics.models;

import ua.lviv.lot.cosmetics.enums.*;

public class Mascara extends Cosmetics {
    private NapType napType;
    private boolean isSoluble;

    public Mascara() {
    }

    public Mascara(String name, double price, CosmeticType cosmeticType, ConsistenceType consistenceType, Rating rating, int volume, boolean isAvailable, NapType napType, boolean isSoluble) {
        super(name, price, cosmeticType, consistenceType, rating, volume, isAvailable);
        this.napType = napType;
        this.isSoluble = isSoluble;
    }

    public NapType getNapType() {
        return napType;
    }

    public void setNapType(NapType napType) {
        this.napType = napType;
    }

    public boolean isSoluble() {
        return isSoluble;
    }

    public void setSoluble(boolean soluble) {
        isSoluble = soluble;
    }
}
