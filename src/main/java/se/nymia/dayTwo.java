package se.nymia;


import se.nymia.utils.utilities;

import java.io.IOException;
import java.util.List;

public class dayTwo {
    public static void answerPuzzle() {

        List<String> input;

        try {
            input = utilities.getInputFile("src/main/resources/dayTwoInput.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }


        System.out.println(input);


    }
}
