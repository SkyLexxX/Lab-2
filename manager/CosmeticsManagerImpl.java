package ua.lviv.lot.cosmetics.manager;

import ua.lviv.lot.cosmetics.enums.*;
import ua.lviv.lot.cosmetics.model.*;
import java.util.ArrayList;
import java.util.List;

public class CosmeticsManagerImpl implements CosmeticsManager {
    private List<Cosmetics> cosmetics = new ArrayList<>();
    private double customerBalance = 0;

    public CosmeticsManagerImpl() {
    }

    public CosmeticsManagerImpl(List<Cosmetics> cosmetics) {
        this.cosmetics = cosmetics;
    }

    public List<Cosmetics> getCosmetics() {
        return cosmetics;
    }

    @Override
    public List<Cosmetics> sortByVolume(boolean reverser) {
        int reverse = reverser ? 1: -1;
        cosmetics.sort((Cosmetics o1, Cosmetics o2)->(reverse * o1.getVolume()-o2.getVolume()));
        cosmetics.forEach((Cosmetics)->System.out.println(Cosmetics.getVolume()));
        return cosmetics;
    }

    @Override
    public List<Cosmetics> sortByPrice(boolean reverser) {
        int reverse = reverser ? 1: -1;
        cosmetics.sort((Cosmetics o1, Cosmetics o2)-> (int) (reverse * (o1.getPrice()-o2.getPrice())));
        cosmetics.forEach((Cosmetics)->System.out.println(Cosmetics.getPrice()));
        return cosmetics;
    }

    @Override
    public List<Cosmetics> findByAvailability() {
        cosmetics.stream().filter(cosmetics1 -> cosmetics1.isAvailable()).forEach(cosmetics1 -> System.out.println(cosmetics1.getName()));
        return null;
    }

    //init
    @Override
    public void init() {
        cosmetics.add(new Cream("Nivea", 100, CosmeticType.PROTECTIVE, ConsistenceType.EMULSION, Rating.EXCELLENT, 130, true, UseType.BODY, "Honey"));
        cosmetics.add(new Toothpaste("Colgate", 150, CosmeticType.DECORATIVE, ConsistenceType.LIQUID, Rating.GREAT, 125, false, "Pineapple"));
        cosmetics.add(new Mascara("mascaraName", 200, CosmeticType.HEALING, ConsistenceType.PASTE, Rating.GOOD, 100, true, NapType.LONG, true));
        cosmetics.add(new Soap("Head&Shoulders", 250, CosmeticType.HYGIENIC, ConsistenceType.SOLID, Rating.GREAT, 200, true, 72, "Apple"));
    }

    @Override
    public void checkBalance(){
        if(customerBalance == 0)
            System.out.println("Not enough money. Balance = 0 \n");
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }
}
