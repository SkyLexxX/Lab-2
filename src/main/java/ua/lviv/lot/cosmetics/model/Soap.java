package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;

public class Soap extends Cosmetics {
    private int fatPercentage;
    private String taste;

    public Soap() {
    }

    public Soap(final String name,
                final double price,
                final CosmeticType cosmeticType,
                final ConsistenceType consistenceType,
                final Rating rating,
                final int volume,
                final boolean isAvailable,
                final int fatPercentage,
                final String taste) {
        super(name, price, cosmeticType, consistenceType,
                rating, volume, isAvailable);
        this.fatPercentage = fatPercentage;
        this.taste = taste;
    }

    public final int getFatPercentage() {
        return fatPercentage;
    }

    public final void setFatPercentage(final int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public final String getTaste() {
        return taste;
    }

    public final void setTaste(final String taste) {
        this.taste = taste;
    }
}
