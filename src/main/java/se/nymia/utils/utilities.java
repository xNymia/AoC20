package se.nymia.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class utilities {
    public static List<String> getInputFile(String filePath) throws IOException {
        try( BufferedReader reader = new BufferedReader(new FileReader(filePath)) ) {
            List<String> input = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                input.add(line);
            }
            return input;
        }
    }
}
