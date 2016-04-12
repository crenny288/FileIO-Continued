package com.theironyard.clt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException
{
        // create ArrayList to store Countries
        ArrayList<Country> countries = new ArrayList<>();

        // create a Buffered Reader object instance with a FileReader
        BufferedReader br = new BufferedReader(new FileReader("countries.txt"));

        //read the first line from the text file
        String fileRead = br.readLine();

        // loop until all lines are read
        while (fileRead != null)
        {
            //use string.split to load a string array with the values from each
            //the file, using a pipe as he delimiter
            String[] tokenize = fileRead.split("\\|");

            String abbreviation = tokenize[0];
            String name = tokenize[1];

            Country tempObj = new Country(abbreviation, name);

            //add to array list
            countries.add(tempObj);

            //read next line before looping
            fileRead = br.readLine();

        }

        // close file stream
        br.close();



    }


}

//        //@Override
//        private ArrayList<Countries> getCountries() {
//
//            //if the countries file has already been read, don't read it again
//            if (countries != null) {
//                return countries;
//            }
//
//            countries = new ArrayList<>();
//
//            // if (File.exists(countriesPath))  // prevent the FileNotFoundException
//            {
//                try (BufferedReader in = new BufferedReader(new FileReader(countriesFile))) {
//                    String line = in.readLine();
//
//                    while (line != null) {
//
//                        if (line.length() == 0) {
//                            continue;
//                        }
//
//                        String[] columns = FIELD_SEP.split(line);
//                        String firstName = columns[0];
//                        String lastName = columns[1];
//
//                        Countries c = new Countries(abbreviation, name);
//                        countries.add(c);
//
//                        line = in.readLine();
//
//                    }
//
//                }
//
//            }
//
//
//
//        }
//
//    }
//
	// write your code here


