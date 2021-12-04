package org.petter.resources.solvers;

import org.petter.resources.csvParsers.CsvParser;

import java.io.IOException;
import java.util.List;

public class SolverDay02 {
    CsvParser parser = new CsvParser();

    public void solverDayTwoProblemOne(String filename) throws IOException {

        List<String> movementArray = parser.fileToStringArrayParser(filename);


        int depth = 0;
        int horizontalPosition = 0;
        int sum = 0;

        for (String movement : movementArray) {
            if (movement.toLowerCase().contains("forward")){
                horizontalPosition = horizontalPosition + Integer.parseInt(movement.substring(movement.length()-1));
            }

            if (movement.toLowerCase().contains("down")){
                depth = depth + Integer.parseInt(movement.substring(movement.length()-1));
            }

             if (movement.toLowerCase().contains("up")){
                 depth = depth - Integer.parseInt(movement.substring(movement.length()-1));
            }
             }
        sum = depth * horizontalPosition;

        System.out.println("-------------------Day Two!-------------------");
        System.out.println("");
        System.out.println("solverDayTwoProblemOne is Alive!!With file: " +filename);
        System.out.println("Depth = " + depth);
        System.out.println("Horizontal position = " + horizontalPosition);
        System.out.println("Answer = " + sum);
        System.out.println("");

    }

        public void solverDayTwoProblemTwo(String filename) throws IOException {
            List<String> movementArray = parser.fileToStringArrayParser(filename);

            int depth = 0;
            int horizontalPosition = 0;
            int aim = 0;
            int sum = 0;

            for (String movement : movementArray) {
                if (movement.toLowerCase().contains("forward")){
                    horizontalPosition = horizontalPosition + Integer.parseInt(movement.substring(movement.length()-1));
                    int x = Integer.parseInt(movement.substring(movement.length()-1));
                    depth = depth + (aim * x);
                }

                if (movement.toLowerCase().contains("down")){
                    //depth = depth + Integer.parseInt(movement.substring(movement.length()-1));
                    aim = aim + Integer.parseInt(movement.substring(movement.length()-1));
                }

                if (movement.toLowerCase().contains("up")){
                    //depth = depth - Integer.parseInt(movement.substring(movement.length()-1));
                    aim = aim - Integer.parseInt(movement.substring(movement.length()-1));
                }
            }
            sum = depth * horizontalPosition;

            System.out.println("solverDayTwoProblemTwo is Alive!!With file: " +filename);
            System.out.println("Depth = " + depth);
            System.out.println("Horizontal position = " + horizontalPosition);
            System.out.println("Answer = " + sum);
            System.out.println("");

        }



    }

