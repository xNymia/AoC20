package se.nymia.dayOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class dayOneRefactor {
    public static void answerPuzzle() {
        List<String> input;

        try {
            input = getInputFile("src/main/resources/dayOneInput.txt");
        } catch (IOException e) {
            System.out.print(e.getMessage());
            return;
        }

        int pairProduct = getPair(input);
        if (pairProduct != -1) {
            System.out.println(pairProduct);
        }
        int tripleProduct = getTriple(input);
        if (tripleProduct != -1) {
            System.out.println(tripleProduct);
        }
    }

    private static List<String> getInputFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        List<String> input = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            input.add(line);
        }
        reader.close();
        return input;
    }

    private static int getPair(List<String> input) {
        for (String a : input) {
            int valOne = Integer.parseInt(a);
            for (String b : input) {
                int valTwo = Integer.parseInt(b);
                if (valOne + valTwo == 2020) {
                    return valOne * valTwo;
                }
            }
        }
        return -1;
    }

    private static int getTriple(List<String> input) {
        for (String a : input) {
            int valOne = Integer.parseInt(a);
            for (String b : input) {
                int valTwo = Integer.parseInt(b);
                for (String c : input) {
                    int valThree = Integer.parseInt(c);
                    if (valOne + valTwo + valThree == 2020) {
                        return valOne * valTwo * valThree;
                    }
                }
            }
        }
        return -1;
    }
}
