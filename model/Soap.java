package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.*;

public class Soap extends Cosmetics {
    private int fatPercentage;
    private String taste;

    public Soap() {
    }

    public Soap(String name, double price, CosmeticType cosmeticType, ConsistenceType consistenceType, Rating rating, int volume, boolean isAvailable, int fatPercentage, String taste) {
        super(name, price, cosmeticType, consistenceType, rating, volume, isAvailable);
        this.fatPercentage = fatPercentage;
        this.taste = taste;
    }

    public int getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
