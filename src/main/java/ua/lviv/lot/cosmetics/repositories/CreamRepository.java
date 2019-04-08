package ua.lviv.lot.cosmetics.repositories;

import ua.lviv.lot.cosmetics.model.Cream;

import javax.transaction.Transactional;

@Transactional
public interface CreamRepository extends CosmeticsRepository<Cream>{

}