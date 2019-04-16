package ua.lviv.lot.cosmetics;

public class CosmeticsNotFoundException extends RuntimeException {

    CosmeticsNotFoundException(Integer id) {
        super("Could not find cosmetic by id = " + id);
    }
}
