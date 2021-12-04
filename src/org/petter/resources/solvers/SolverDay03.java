package org.petter.resources.solvers;

import org.petter.resources.csvParsers.CsvParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SolverDay03 {
    CsvParser parser = new CsvParser();

    public void solverDayThreeProblemOne(String filename) throws IOException {
        List<String> binary = parser.fileToStringArrayParser(filename);
        int rows = binary.size();
        int one1 = 0;
        int one0 = 0;
        int two1 = 0;
        int two0 = 0;
        int three1 = 0;
        int three0 = 0;
        int four1 = 0;
        int four0 = 0;
        int five1 = 0;
        int five0 = 0;
        int six1 = 0;
        int six0 = 0;
        int seven1 = 0;
        int seven0 = 0;
        int eight1 = 0;
        int eight0 = 0;
        int nine1 = 0;
        int nine0 = 0;
        int ten1 = 0;
        int ten0 = 0;
        int eleven1 = 0;
        int eleven0 = 0;
        int twelve1 = 0;
        int twelve0 = 0;

        String gamma = "";
        String epsilon = "";

        for (String bin : binary) {
            if (bin.charAt(0) == '0') one0++;
            else one1++;

            if (bin.charAt(1) == '0') two0++;
            else two1++;

            if (bin.charAt(2) == '0') three0++;
            else three1++;

            if (bin.charAt(3) == '0') four0++;
            else four1++;

            if (bin.charAt(4) == '0') five0++;
            else five1++;

            if (bin.charAt(5) == '0') six0++;
            else six1++;

            if (bin.charAt(6) == '0') seven0++;
            else seven1++;

            if (bin.charAt(7) == '0') eight0++;
            else eight1++;

            if (bin.charAt(8) == '0') nine0++;
            else nine1++;

            if (bin.charAt(9) == '0') ten0++;
            else ten1++;

            if (bin.charAt(10) == '0') eleven0++;
            else eleven1++;

            if (bin.charAt(11) == '0') twelve0++;
            else twelve1++;
        }

        if (one0 > one1) {
            gamma = "0";
            epsilon = "1";
        } else {
            gamma = "1";
            epsilon = "0";
        }

        if (two0 > two1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (three0 > three1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (four0 > four1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (five0 > five1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (six0 > six1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (seven0 > seven1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (eight0 > eight1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (nine0 > nine1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (ten0 > ten1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (eleven0 > eleven1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
        }

        if (twelve0 > twelve1) {
            gamma = gamma + "0";
            epsilon = epsilon + "1";
        } else {
            gamma = gamma + "1";
            epsilon = epsilon + "0";
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
