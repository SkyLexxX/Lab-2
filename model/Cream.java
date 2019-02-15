package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.*;

public class Cream extends Cosmetics {
    private UseType useType;
    private String extract;

    public Cream() {
    }

    public Cream(String name, double price, CosmeticType cosmeticType, ConsistenceType consistenceType, Rating rating, int volume, boolean isAvailable, UseType useType, String extract) {
        super(name, price, cosmeticType, consistenceType, rating, volume, isAvailable);
        this.useType = useType;
        this.extract = extract;
    }

    public UseType getUseType() {
        return useType;
    }

    public void setUseType(UseType useType) {
        this.useType = useType;
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }
}
