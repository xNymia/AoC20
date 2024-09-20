package se.nymia.dayOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class dayOneRefactorTwo {
    public static void answerPuzzle() {
        List<String> input;

        try {
            input = getInputFile("src/main/resources/dayOneInput.txt");
        } catch (IOException e) {
            System.out.print(e.getMessage());
            return;
        }

        List<Integer> inputlist = new ArrayList<>();
        for (String line : input) {
            inputlist.add(Integer.parseInt(line));
        }

        int pairProduct = getPair(inputlist);
        if (pairProduct != -1) {
            System.out.println(pairProduct);
        }
        int tripleProduct = getTriple(inputlist);
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

    private static int getPair(List<Integer> input) {
        for (Integer valOne : input) {
            int searchVal = 2020-valOne;
            if (input.contains(searchVal)) return valOne * searchVal;
        }
        return -1;
    }

    private static int getTriple(List<Integer> input) {
        for (Integer valOne : input) {
            int searchVal = 2020 - valOne;
            for (Integer valTwo : input) {
                if (valTwo >= searchVal) continue;
                int newSearchVal = searchVal - valTwo;
                if (input.contains(newSearchVal)) {
                    return(valOne*valTwo*newSearchVal);
                }
            }
        }
        return -1;
    }
}
