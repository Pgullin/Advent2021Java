package org.petter.resources.solvers;

import org.petter.resources.csvParsers.CsvParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolverDay03 {
    CsvParser parser = new CsvParser();

    public void solverDayThreeProblemOne(String filename) throws IOException {
        List<String> binary = parser.fileToStringArrayParser(filename);

        int length;
        if(filename.equals("03Sample")) length = 5;
        else length = 12;

        int[] ones = new int[length];
        int[] zeroes = new int[length];

        String gamma = "";
        String epsilon = "";

        for (int i = 0; i < length; i++) {
            int zero = 0;
            int one = 0;
            for (String bin : binary) {
                if (bin.charAt(i) == '0') zero++;
            else one++;
            }
            ones[i] = one;
            zeroes[i] = zero;
        }

        for (int i = 0; i < length; i++) {

                if (ones[i] > zeroes[i]) {
                    gamma += "1";
                    epsilon += "0";
                }
                else {
                    gamma += "0";
                    epsilon += "1";
                }
            }

        int gammaDecimal = Integer.parseInt(gamma, 2);
        int epsilonDecimal = Integer.parseInt(epsilon, 2);
        int answer = gammaDecimal * epsilonDecimal;

        System.out.println("-------------------Day Three!-------------------");
        System.out.println("");
        System.out.println("solverDayThreeProblemOne is present and ready!! With file: " + filename);
        System.out.println("The answer is " + answer);
        System.out.println("--");
        System.out.println("");
    }


    public void solverDayThreeProblemTwo(String filename) throws IOException {
        List<String> oxygenList = parser.fileToStringArrayParser(filename);
        List<String> co2List = parser.fileToStringArrayParser(filename);

        int counterOxygen = 0;
        int counterCo2 = 0;

        while (oxygenList.size() > 1) {
            oxygenList = filterOxygen(oxygenList, counterOxygen);
            counterOxygen++;
        }

        while (co2List.size() > 1) {
            co2List = filterCo2(co2List, counterCo2);
            counterCo2++;
        }

        int oxygenDecimal = Integer.parseInt(oxygenList.get(0), 2);
        int co2Decimal = Integer.parseInt(co2List.get(0), 2);

        int answer = oxygenDecimal * co2Decimal;

        System.out.println("Should be 23 x 10 = 230");
        System.out.println("3995 x 2047 = 8177765 är fel!!");
        System.out.println( oxygenDecimal + " x " + co2Decimal + " = " + answer);

    }

    private List<String> filterOxygen(List<String> oxygen, int i) {
        int zeroes = 0;
        int ones = 0;
        List<String> newOxygenList = new ArrayList<>();

        for (String line : oxygen) {
            if (line.charAt(i) == '0') {
                zeroes++;
            } else ones++;
        }
            for (String entry : oxygen) {
                if ( ones >= zeroes && entry.charAt(i) == '1') newOxygenList.add(entry);
                if ( zeroes > ones && entry.charAt(i) == '0') newOxygenList.add(entry);
            }
        return newOxygenList;
    }

    private List<String> filterCo2(List<String> co2, int i) {
        int zeroes = 0;
        int ones = 0;
        List<String> newCo2List = new ArrayList<>();

        for (String line : co2) {
            if (line.charAt(i) == '0') {
                zeroes++;
            } else ones++;
        }
        for (String entry : co2) {
            if ( zeroes <= ones && entry.charAt(i) == '0') newCo2List.add(entry);
            if ( ones < zeroes && entry.charAt(i) == '1') newCo2List.add(entry);

        }
        return newCo2List;
    }
}
