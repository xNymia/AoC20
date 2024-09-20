package se.nymia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class dayOne {
    public static void answerPuzzle() {

        List<String> f = new ArrayList<>();

        try {
            f = getFile();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

        outerloop:
        for (String a : f) {
            int valOne = Integer.parseInt(a);
            for (String b : f) {
                int valTwo = Integer.parseInt(b);

                //System.out.format("%b plus %b equals %d\n", f.get(i), f.get(j), valOne+valTwo);

                if (valOne + valTwo == 2020) {
                    System.out.println(valOne * valTwo);
                    break outerloop;
                }
            }
        }

        outerloop:
        // String a in f ?
        for (String a : f) {
            int valOne = Integer.parseInt(a);

            for (String b : f) {
                int valTwo = Integer.parseInt(b);

                for (String c : f) {
                    int valThree = Integer.parseInt(c);

                    if (valOne + valTwo + valThree == 2020) {
                        System.out.println(valOne * valTwo * valThree);
                        break outerloop;
                    }
                }
            }
        }
    }


    /**
     * @return List<String>
     * @throws IOException
     */
    private static List<String> getFile() throws IOException {

        //TODO: Move to standalone class / file.

        BufferedReader reader = new BufferedReader( new FileReader("src/main/resources/dayOneInput.txt") );
        String line = reader.readLine();
        List<String> input = new ArrayList<>();

        while (line != null) {
            input.add(line);
            line = reader.readLine();
        }
        reader.close();
        return input;
    }
}

