package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;
import ua.lviv.lot.cosmetics.enums.UseType;

public class Cream extends Cosmetics {
    private UseType useType;
    private String extract;

    public Cream() {
    }

    public Cream(final String name, final double price, final CosmeticType cosmeticType, final ConsistenceType consistenceType, final Rating rating, final int volume, final boolean isAvailable, final UseType useType, final String extract) {
        super(name, price, cosmeticType, consistenceType, rating, volume, isAvailable);
        this.useType = useType;
        this.extract = extract;
    }

    public final UseType getUseType() {
        return useType;
    }

    public final void setUseType(final UseType useType) {
        this.useType = useType;
    }

    public final String getExtract() {
        return extract;
    }

    public final void setExtract(final String extract) {
        this.extract = extract;
    }
}
