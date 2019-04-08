package ua.lviv.lot.cosmetics.model;

import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;
import ua.lviv.lot.cosmetics.enums.UseType;

import javax.persistence.*;

@Entity
@Inheritance
public class Cream extends Cosmetics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private UseType useType;
    private String extract;

    public Cream() {
    }

    public Cream(final String name,
                 final double price,
                 final CosmeticType cosmeticType,
                 final ConsistenceType consistenceType,
                 final Rating rating,
                 final int volume,
                 final boolean isAvailable,
                 final UseType useType,
                 final String extract) {
        super(name, price, cosmeticType, consistenceType,
                rating, volume, isAvailable);
        this.useType = useType;
        this.extract = extract;
    }

    public String getHeaders() {
        return super.getHeaders() + ", useType"
                + ", extract";
    }

    public String toCSV() {
        return super.toCSV()
                + ", " + useType
                + ", " + extract;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
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
