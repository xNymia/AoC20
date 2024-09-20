package se.nymia.dayThree;

import se.nymia.utils.utilities;
import java.io.IOException;
import java.util.List;

public class DayThree {
    public static void answerPuzzle() {

        List<String> input;

        try {
            input = utilities.getInputFile(String.format("src/main/resources/day%sInput.txt", "Three"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        for (String s : input) {
            System.out.println(s);
        }



    }
}