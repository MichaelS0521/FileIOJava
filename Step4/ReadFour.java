package Step4;

import java.io.*;
import java.util.Scanner;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) throws FileNotFoundException
        {
            File fileIn = new File("/Users/michael/Desktop/Projects/FileIOJava/Step4/input.txt");
            BufferedReader br = new BufferedReader(new FileReader(fileIn));
            String str;
            int sum = 0;
            try {

            while ((str = br.readLine()) != null)
            {
                
                sum += Integer.parseInt(str);

                System.out.println("Current sum: " + sum);
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
            // Print out a running total of all the
            // values in the input file.
        }
}