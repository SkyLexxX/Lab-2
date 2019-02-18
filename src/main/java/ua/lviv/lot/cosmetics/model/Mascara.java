package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;
import ua.lviv.lot.cosmetics.enums.NapType;

public class Mascara extends Cosmetics {
    private NapType napType;
    private boolean isSoluble;

    public Mascara() {
    }

    public Mascara(final String name,
                   final double price,
                   final CosmeticType cosmeticType,
                   final ConsistenceType consistenceType,
                   final Rating rating,
                   final int volume,
                   final boolean isAvailable,
                   final NapType napType,
                   final boolean isSoluble) {
        super(name, price, cosmeticType, consistenceType,
                rating, volume, isAvailable);
        this.napType = napType;
        this.isSoluble = isSoluble;
    }

    public final NapType getNapType() {
        return napType;
    }

    public final void setNapType(final NapType napType) {
        this.napType = napType;
    }

    public final boolean isSoluble() {
        return isSoluble;
    }

    public final void setSoluble(final boolean soluble) {
        isSoluble = soluble;
    }
}
