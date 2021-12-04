package org.petter;

import org.petter.resources.solvers.SolverDay01;
import org.petter.resources.solvers.SolverDay02;
import org.petter.resources.solvers.SolverDay03;
import org.petter.resources.solvers.SolverDay04;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

         /** Advent of code 2021 */

         /** Day one */
         String filename01S = "01Sample.csv";
         String filename01F = "01Full.csv";
         new SolverDay01().solverDayOneProblemOne(filename01F);
         new SolverDay01().solverDayOneProblemTwo(filename01F);

         /** Day Two */
         String filename02S = "02Sample.csv";
         String filename02F = "02Full.csv";
         new SolverDay02().solverDayTwoProblemOne(filename02F);
         new SolverDay02().solverDayTwoProblemTwo(filename02F);

         /** Day Three */
         String filename03S = "03Sample.csv";
         String filename03F = "03Full.csv";
         new SolverDay03().solverDayThreeProblemOne(filename03F);
         new SolverDay03().solverDayThreeProblemTwo(filename03S);

         /** Day Four */
         /*
         String filename04S = "04Sample.csv";
         String filename04F = "04Full.csv";
         new SolverDay04().solverDayFourProblemOne(filename04S);
         new SolverDay04().solverDayFourProblemTwo(filename04F);
         */

    }
}
