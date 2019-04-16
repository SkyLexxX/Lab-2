package ua.lviv.lot.cosmetics;

import org.springframework.web.bind.annotation.*;
import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;
import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.UseType;
import ua.lviv.lot.cosmetics.model.Cream;
import ua.lviv.lot.cosmetics.repositories.CreamRepository;

@RestController
public class CosmeticsController {
    private CreamRepository cosmeticsRepository;

    public CosmeticsController(CreamRepository cosmeticsRepository) {
        this.cosmeticsRepository = cosmeticsRepository;
    }

    @GetMapping("/cosmetics/")
    public Iterable<Cream> all() {
        return cosmeticsRepository.findAll();
    }

    @GetMapping("/cosmetics/{id}")
    Cream one(@PathVariable Integer id) {
        return cosmeticsRepository.findById(id)
                .orElseThrow(() -> new CosmeticsNotFoundException(id));
    }

    @PostMapping("/cosmetics")
    Cream newCosmetics(@RequestParam(defaultValue = "defaultName") String name,
                       @RequestParam(defaultValue = "0") Double price,
                       @RequestParam(defaultValue = "PROTECTIVE") CosmeticType cosmeticType,
                       @RequestParam(defaultValue = "LIQUID") ConsistenceType consistenceType,
                       @RequestParam(defaultValue = "GOOD") Rating rating,
                       @RequestParam(defaultValue = "0") int volume,
                       @RequestParam(defaultValue = "false") Boolean isAvailable,
                       @RequestParam(defaultValue = "BODY") UseType useType,
                       @RequestParam(defaultValue = "defaultExtract") String extract) {
        Cream newCosmetics = new Cream(name, price, cosmeticType,consistenceType,rating, volume,isAvailable, useType, extract);
        return cosmeticsRepository.save(newCosmetics);
    }

    @PutMapping("/cosmetics/{id}")
    Cream replaceEmployee(@RequestParam(defaultValue = "defaultName") String name,
                          @RequestParam(defaultValue = "0") Double price,
                          @RequestParam(defaultValue = "PROTECTIVE") CosmeticType cosmeticType,
                          @RequestParam(defaultValue = "LIQUID") ConsistenceType consistenceType,
                          @RequestParam(defaultValue = "GOOD") Rating rating,
                          @RequestParam(defaultValue = "0") int volume,
                          @RequestParam(defaultValue = "false") Boolean isAvailable,
                          @RequestParam(defaultValue = "BODY") UseType useType,
                          @RequestParam(defaultValue = "defaultExtract") String extract,
                          @PathVariable Integer id) {
        Cream newCosmetics = new Cream(name, price, cosmeticType,consistenceType,rating, volume,isAvailable, useType, extract);
        return cosmeticsRepository.findById(id)
                .map(cosmetics -> {
                    cosmetics.setName(newCosmetics.getName());
                    cosmetics.setPrice(newCosmetics.getPrice());
                    cosmetics.setVolume(newCosmetics.getVolume());
                    cosmetics.setCosmeticType(newCosmetics.getCosmeticType());
                    cosmetics.setConsistenceType(newCosmetics.getConsistenceType());
                    cosmetics.setRating(newCosmetics.getRating());
                    cosmetics.setAvailable(newCosmetics.isAvailable());

                    cosmetics.setExtract(newCosmetics.getExtract());
                    cosmetics.setUseType(newCosmetics.getUseType());
                    cosmetics.setId(id);
                    return cosmeticsRepository.save(cosmetics);
                })
                .orElseThrow(() -> new CosmeticsNotFoundException(id));
    }

    @DeleteMapping("/cosmetics/{id}")
    public void deleteCosmetics(@PathVariable Integer id) {
        cosmeticsRepository.deleteById(id);
    }
}
