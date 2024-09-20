package se.nymia;

import se.nymia.utils.utilities;
import java.io.IOException;
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

            char value = str.get(1).charAt(0);
            String[] temp = str.get(0).split(":");
            int min = Integer.parseInt(temp[0]);
            int max = Integer.parseInt(temp[1]);
            String pass = str.get(2).trim();

            int count = (int) pass.chars().filter(c -> c == value).count();

            if (count >= min && count <= max) {
                valid++;
            }
        }
        System.out.println(valid);

        for (String s : input) {
            passwordManager pm = new PasswordManager();
        }


    }
    private class passwordManager {}

    private static void passwordManager(){
        int min;
        int max;
        char value;
        String pass;
    }
}