package se.nymia.dayTwo;

import se.nymia.utils.utilities;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DayTwo {
    public static void answerPuzzle() {

        List<String> input;


        try {
            input = utilities.getInputFile(String.format("src/main/resources/day%sInput.txt", "Two"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return;
        }


        /* --------- VERSION 1 ----------
        for (String s : input) {
            List<String> str = Arrays.asList(s.split(" "));

            char value = str.get(1).charAt(0);
            String[] temp = str.get(0).split("-");
            int min = Integer.parseInt(temp[0]);
            int max = Integer.parseInt(temp[1]);
            String pass = str.get(2).trim();

            int count = (int) pass.chars().filter(c -> c == value).count();

            if (count >= min && count <= max) {
                valid++;
            }
        }
        System.out.println(valid);
        */

        // --------- VERSION 2 ----------
        // Part 1 Counter
        int valid = 0;
        // Part 2 Counter
        int valid2 = 0;
        for (String s : input) {
            passwordManager pm = new passwordManager(s);
            int count = (int) pm.pass.chars().filter(c -> c == pm.value).count();

            if (count >= pm.min && count <= pm.max) valid++;


            char charAtMin = pm.pass.charAt(pm.min-1);
            char charAtMax = pm.pass.charAt(pm.max-1);
            boolean isValid = (charAtMin == pm.value)^(charAtMax == pm.value);

            if(isValid) valid2++;

        }
        System.out.println(valid);
        System.out.println(valid2);

    }
    private static class passwordManager {
            int min;
            int max;
            char value;
            String pass;

        public passwordManager(String input){
            List<String> in = Arrays.asList(input.split(" "));
            String[] temp = in.get(0).split("-");

            this.value = in.get(1).charAt(0);
            this.min = Integer.parseInt(temp[0]);
            this.max = Integer.parseInt(temp[1]);
            this.pass = in.get(2).trim();
        }
    }
}