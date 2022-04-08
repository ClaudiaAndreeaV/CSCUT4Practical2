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
public class FormatNamesm {

    public static void main(String[] args) throws FileNotFoundException
    {   
    	File input;
    	File output;  //creating two objects of the file class
    	if(args[0].equals("-u"))  //checking for upper case flag
    	{    
    		 input = new File(args[1]);   
        	 output = new File(args[2]); //reading the files names from the command line
    	}
    	else
    	{
          input = new File(args[0]);   
    	  output = new File(args[1]); //reading the files names from the command line
    	}
    	
    	Scanner scan = new Scanner(input); //creating an object of the scanner class
    	PrintWriter print = new PrintWriter(output); //creating an object of the printWriter class
    	
    	while(scan.hasNextLine()) //reading the input file line by line
    	{
    		String line = scan.nextLine();
    		Scanner lineScanner = new Scanner(line);

    		String name = lineScanner.next();
    		if(args[0].equals("-u"))
    		  name = name.toUpperCase();
    		else
    		  name = name.substring(0,1).toUpperCase() + name.substring(1);
    		 String temp;
    		while (!lineScanner.hasNextInt())
    		{     
    		     temp = lineScanner.next();
    		     if(temp.length() == 1)
    		    	 temp = temp + "."; //middle name
    		     
    		     if(args[0].equals("-u"))
    		       name = name + " " + temp.toUpperCase();
    		     else
    		       name = name + " " + temp.substring(0,1).toUpperCase() + temp.substring(1); 
    		     
    		    	 
    		} //changing the name

            String date = lineScanner.next();
           date = date.substring(0,2) + "/" + date.substring(2,4) + "/" + date.substring(4); //converting into date format
    		
            line = name + " " + date;
    		print.println(line); //writing the modified data into the output file
    		
    		lineScanner.close();
    	}
    	scan.close();
    	print.close();    	


    } // main

} // FormatNamesm