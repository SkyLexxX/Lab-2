package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;

import javax.persistence.*;

public class Cosmetics {
    private Integer id;
    private String name;
    private double price;
    private CosmeticType cosmeticType;
    private ConsistenceType consistenceType;
    private Rating rating;
    private double volume;
    private boolean isAvailable;

    public Cosmetics() {
    }

    public Cosmetics(final String name,
                     final double price,
                     final CosmeticType cosmeticType,
                     final ConsistenceType consistenceType,
                     final Rating rating,
                     final int volume,
                     final boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.cosmeticType = cosmeticType;
        this.consistenceType = consistenceType;
        this.rating = rating;
        this.volume = volume;
        this.isAvailable = isAvailable;
    }

    public String getHeaders() {
        return "name"
                + ", price"
                + ", cosmeticType"
                + ", consistenceType"
                + ", rating"
                + ", volume"
                + ", isAvailable";
    }

    public String toCSV() {
        return name
                + ", " + price
                + ", " + cosmeticType
                + ", " + consistenceType
                + ", " + rating
                + ", " + volume
                + ", " + isAvailable;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cosmeticType=" + cosmeticType +
                ", consistenceType=" + consistenceType +
                ", rating=" + rating +
                ", volume=" + volume +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
