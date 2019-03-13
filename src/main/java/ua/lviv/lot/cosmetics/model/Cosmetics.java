package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;

public class Cosmetics {
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

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final CosmeticType getCosmeticType() {
        return cosmeticType;
    }

    public final void setCosmeticType(final CosmeticType cosmeticType) {
        this.cosmeticType = cosmeticType;
    }

    public final ConsistenceType getConsistenceType() {
        return consistenceType;
    }

    public final void setConsistenceType(
            final ConsistenceType consistenceType) {
        this.consistenceType = consistenceType;
    }

    public final Rating getRating() {
        return rating;
    }

    public final void setRating(final Rating rating) {
        this.rating = rating;
    }

    public final double getVolume() {
        return volume;
    }

    public final void setVolume(final double volume) {
        this.volume = volume;
    }

    public final boolean isAvailable() {
        return isAvailable;
    }

    public final void setAvailable(final boolean available) {
        isAvailable = available;
    }
}
