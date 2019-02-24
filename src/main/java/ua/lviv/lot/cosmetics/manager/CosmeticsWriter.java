package ua.lviv.lot.cosmetics.manager;

import ua.lviv.lot.cosmetics.model.Cosmetics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.io.IOException;

public class CosmeticsWriter {
    public void writeToFile(List<Cosmetics> cosmetics) {
        File myFile = new File("result.csv");

        try (FileOutputStream fos = new FileOutputStream(myFile);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bufWriter = new BufferedWriter(osw)) {

            for (Cosmetics cosmetic : cosmetics) {
                bufWriter.write(cosmetic.getHeaders());
                bufWriter.newLine();
                bufWriter.write(cosmetic.toCSV());
                bufWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
