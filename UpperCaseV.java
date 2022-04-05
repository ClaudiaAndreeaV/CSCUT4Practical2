import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class UpperCaseV {

    public static void main(String[] args) throws FileNotFoundException
    {
     
    	File input = new File(args[0]);   //creating two objects of the file class and
    	File output = new File(args[1]); //reading the files names from the command line
    	
    	Scanner scan = new Scanner(input); //creating an object of the scanner class
    	PrintWriter print = new PrintWriter(output); //creating an object of the printWriter class
    	
    	while(scan.hasNextLine()) //reading the input file line by line
    	{
    		String line = scan.nextLine();
    		Scanner lineScanner = new Scanner(line);

    		String name = lineScanner.next();
    		 name = name.toUpperCase();
    		 String temp;
    		while (!lineScanner.hasNextInt())
    		{
    		     temp = lineScanner.next();
    		  name = name + " " + temp.toUpperCase();
    		} //changing the name to title case

            String date = lineScanner.next();
           date = date.substring(0,2) + "/" + date.substring(2,4) + "/" + date.substring(4); //converting into date format
    		
            line = name + " " + date;
    		print.println(line); //writing the modified data into the output file
    		
    		lineScanner.close();
    	}
    	scan.close();
    	print.close();    	


    } // main

} // UpperCaseV
