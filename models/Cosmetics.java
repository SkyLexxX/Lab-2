package ua.lviv.lot.cosmetics.models;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.TypeOfConsistence;
import ua.lviv.lot.cosmetics.enums.TypeOfCosmetic;

public class Cosmetics {
    private String name;
    private double price;
    private TypeOfCosmetic typeOfCosmetic;
    private TypeOfConsistence typeOfConsistence;
    private Rating rating;
    private int volume;
    private boolean isAvailable;

    public Cosmetics() {
    }

    public Cosmetics(String name, double price, TypeOfCosmetic typeOfCosmetic, TypeOfConsistence typeOfConsistence, Rating rating, int volume, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.typeOfCosmetic = typeOfCosmetic;
        this.typeOfConsistence = typeOfConsistence;
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

    public TypeOfCosmetic getTypeOfCosmetic() {
        return typeOfCosmetic;
    }

    public void setTypeOfCosmetic(TypeOfCosmetic typeOfCosmetic) {
        this.typeOfCosmetic = typeOfCosmetic;
    }

    public TypeOfConsistence getTypeOfConsistence() {
        return typeOfConsistence;
    }

    public void setTypeOfConsistence(TypeOfConsistence typeOfConsistence) {
        this.typeOfConsistence = typeOfConsistence;
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