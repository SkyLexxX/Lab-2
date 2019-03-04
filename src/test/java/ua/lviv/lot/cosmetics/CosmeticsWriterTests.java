package ua.lviv.lot.cosmetics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.lot.cosmetics.enums.ConsistenceType;
import ua.lviv.lot.cosmetics.enums.CosmeticType;
import ua.lviv.lot.cosmetics.enums.Rating;
import ua.lviv.lot.cosmetics.enums.UseType;
import ua.lviv.lot.cosmetics.enums.NapType;

import ua.lviv.lot.cosmetics.manager.CosmeticsWriter;

import ua.lviv.lot.cosmetics.model.Cosmetics;
import ua.lviv.lot.cosmetics.model.Cream;
import ua.lviv.lot.cosmetics.model.Mascara;
import ua.lviv.lot.cosmetics.model.Toothpaste;
import ua.lviv.lot.cosmetics.model.Soap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CosmeticsWriterTests {

    private List<Cosmetics> cosmetics = new ArrayList<>();

    @BeforeEach
    public void init() {
        cosmetics.add(new Cream("Nivea", 10, CosmeticType.PROTECTIVE,
                ConsistenceType.EMULSION, Rating.EXCELLENT, 130, true,
                UseType.BODY, "Honey"));
        cosmetics.add(new Toothpaste("Colgate", 15, CosmeticType.DECORATIVE,
                ConsistenceType.LIQUID, Rating.GREAT, 125, false,
                "Pineapple"));
        cosmetics.add(new Mascara("mascaraName", 20, CosmeticType.HEALING,
                ConsistenceType.PASTE, Rating.GOOD, 100, false,
                NapType.LONG, true));
        cosmetics.add(new Soap("Head&Shoulders", 25, CosmeticType.HYGIENIC,
                ConsistenceType.SOLID, Rating.GREAT, 200, true,
                72, "Apple"));
    }

    @Test
    void testWriteToFile() {
        CosmeticsWriter writer = new CosmeticsWriter();
        writer.writeToFile(cosmetics);

        try (FileInputStream fis = new FileInputStream("result.csv");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr)) {

            for (Cosmetics cosmetic : cosmetics) {
                assertEquals(cosmetic.getHeaders(), bufReader.readLine());
                assertEquals(cosmetic.toCSV(), bufReader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void isFileAvailable(){
        File myFile = new File("result.csv");
        assertTrue(myFile.exists() && myFile.isFile(),
                "Initialization file problem");
    }
}
