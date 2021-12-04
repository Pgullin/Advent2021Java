package org.petter.resources.csvParsers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CsvParser {

    String BASEPATH = "src/org/petter/resources/data/";
    
    public ArrayList<Integer> fileToIntArrayParser(String filename ) throws IOException {

        Path pathToFile = Paths.get(BASEPATH + filename);
        ArrayList<Integer> numbers = new ArrayList<>();


        BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8);
            String line;
            while ((line = br.readLine()) != null) {

                String[] tempnumbers = line.split(",");
                int number = Integer.parseInt(tempnumbers[0]);
                numbers.add(number);
            }
        return numbers;
        
    }

    public ArrayList<String> fileToStringArrayParser(String filename ) throws IOException {

        Path pathToFile = Paths.get(BASEPATH + filename);
        ArrayList<String> strings = new ArrayList<>();


        BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.UTF_8);
        String line;
        while ((line = br.readLine()) != null) {

            //String currentLine = line();

            strings.add(line);
        }
        return strings;

    }
}
