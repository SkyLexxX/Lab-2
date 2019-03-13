package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;

public class Toothpaste extends Cosmetics {
    private String extract;

    public Toothpaste() {
    }

    public Toothpaste(final String name,
                      final double price,
                      final CosmeticType cosmeticType,
                      final ConsistenceType consistenceType,
                      final Rating rating,
                      final int volume,
                      final boolean isAvailable,
                      final String extract) {
        super(name, price, cosmeticType, consistenceType,
                rating, volume, isAvailable);
        this.extract = extract;
    }

    public String getHeaders() {
        return super.getHeaders() + ", extract";
    }

    public String toCSV() {
        return super.toCSV()
                + ", " + extract;
    }

    public final String getExtract() {
        return extract;
    }

    public final void setExtract(final String extract) {
        this.extract = extract;
    }
}
