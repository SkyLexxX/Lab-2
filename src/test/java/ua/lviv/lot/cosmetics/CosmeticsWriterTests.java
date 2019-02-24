package ua.lviv.lot.cosmetics;

import org.junit.jupiter.api.Test;
import ua.lviv.lot.cosmetics.manager.CosmeticsManagerImpl;
import ua.lviv.lot.cosmetics.manager.CosmeticsWriter;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class CosmeticsWriterTests {

    @Test
    void testWriteToFile() {
        File myFile = new File("result.csv");
        assertTrue(myFile.exists() && myFile.isFile(),
                "Initialization file problem");

        CosmeticsManagerImpl manager = new CosmeticsManagerImpl();
        manager.init();
        CosmeticsWriter writer = new CosmeticsWriter();
        writer.writeToFile(manager.getCosmetics());
    }
}
