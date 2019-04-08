package ua.lviv.lot.cosmetics.repositories;

import org.springframework.data.repository.CrudRepository;
import ua.lviv.lot.cosmetics.model.Cosmetics;

public interface CosmeticsRepository<T extends Cosmetics>
        extends CrudRepository<Cosmetics, Integer> {

}
