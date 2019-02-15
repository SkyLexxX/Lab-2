package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.*;

public class Cosmetics {
    private String name;
    private double price;
    private CosmeticType cosmeticType;
    private ConsistenceType consistenceType;
    private Rating rating;
    private int volume;
    private boolean isAvailable;

    public Cosmetics() {
    }

    public Cosmetics(String name, double price, CosmeticType cosmeticType, ConsistenceType consistenceType, Rating rating, int volume, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.cosmeticType = cosmeticType;
        this.consistenceType = consistenceType;
        this.rating = rating;
        this.volume = volume;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CosmeticType getCosmeticType() {
        return cosmeticType;
    }

    public void setCosmeticType(CosmeticType cosmeticType) {
        this.cosmeticType = cosmeticType;
    }

    public ConsistenceType getConsistenceType() {
        return consistenceType;
    }

    public void setConsistenceType(ConsistenceType consistenceType) {
        this.consistenceType = consistenceType;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}