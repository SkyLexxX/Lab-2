package ua.lviv.lot.cosmetics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.lot.cosmetics.enums.*;
import ua.lviv.lot.cosmetics.model.Cream;
import ua.lviv.lot.cosmetics.model.Mascara;
import ua.lviv.lot.cosmetics.model.Soap;
import ua.lviv.lot.cosmetics.model.Toothpaste;
import ua.lviv.lot.cosmetics.repositories.CosmeticsRepository;
import ua.lviv.lot.cosmetics.repositories.CreamRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(final CreamRepository creamRepository) {

		return (args) -> {
			creamRepository.save(new Cream("Nivea", 100, CosmeticType.HYGIENIC,
					ConsistenceType.LIQUID, Rating.EXCELLENT, 120, true,
					UseType.BODY, "Honey"));

			creamRepository.findAll().forEach(System.out::println);
		};
	}
}
