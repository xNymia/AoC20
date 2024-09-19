package se.nymia;

import se.nymia.utils.utilities;
import java.io.IOException;
import java.util.List;

public class TEMPLATE {
    public static void answerPuzzle() {

        List<String> input;

        try {
            input = utilities.getInputFile(String.format("src/main/resources/day%sInput.txt", "DAY"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        for (String s : input) {
            System.out.println(s);
        }



    }
}