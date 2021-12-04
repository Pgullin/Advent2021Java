package org.petter.resources.solvers;
import org.petter.resources.csvParsers.CsvParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SolverDay01 {

    public void solverDayOneProblemOne(String filename) throws IOException {
       CsvParser parser = new CsvParser();
       List<Integer> numbers = parser.fileToIntArrayParser(filename);
       int count = 0;
        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            int previous = numbers.get(i-1);

          if (current > previous) count++;

        }
        System.out.println("-------------------Day One!-------------------");
        System.out.println("solverDayOneProblemOne With file: " +filename);
        System.out.println("result = "+count);
        System.out.println("");
    }

    public void solverDayOneProblemTwo(String filename) throws IOException {
        CsvParser parser = new CsvParser();
        List<Integer> numbers = parser.fileToIntArrayParser(filename);
        List<Integer> addedNumbers = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < numbers.size()-2; i++) {
            int sum = numbers.get(i) + numbers.get(i + 1) + numbers.get(i + 2);
            addedNumbers.add(sum);
        }

            for (int j = 1; j < addedNumbers.size(); j++) {
                int current = addedNumbers.get(j);
                int previous = addedNumbers.get(j-1);

                if (current > previous) count++;

            }


        System.out.println("solverDayOneProblemtwo With file: " +filename);
        System.out.println("result = "+count);
        System.out.println("");

    }
}
