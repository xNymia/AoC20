package se.nymia;

import se.nymia.utils.utilities;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dayTwo {
    public static void answerPuzzle() {

        List<String> input;
        int valid = 0;

        try {
            input = utilities.getInputFile(String.format("src/main/resources/day%sInput.txt", "Two"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }

        for (String s : input) {
            List<String> str = Arrays.asList(s.split(" "));

            String value = str.get(1).split(":")[0];
            int min = Integer.parseInt(str.get(0).split("-")[0]);
            int max = Integer.parseInt(str.get(0).split("-")[1]);
            String pass = str.get(2).trim();

            int count = (int) pass.chars().filter(c -> c == value.charAt(0)).count();

            if (count >= min && count <= max) {
                valid++;
            }
        }
        System.out.println(valid);
    }
}