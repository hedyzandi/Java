//********************************************************************
//  ExceptionMain2.java       
//
// Programming Project 11.2
//********************************************************************

import java.util.Scanner;

public class ExceptionMain
{

   public static void main (String[] args) throws StringTooLongException
   {
      final int MAX = 20;

      Scanner scan = new Scanner (System.in);

String value=null; 
	  
StringTooLongException problem =
new StringTooLongException ("Input value is too long.");


do {
      try {
	  System.out.print ("Enter an string length of " + MAX + ", inclusive: ");
      int value = scan.nextInt();

			if (value.length() > MAX)
			throw problem;
			}
	   catch (StringTooLongException exception)
			{System.out.println(exception.getMessage()}
		 
	}
while (!value.equals("DONE"));

      System.out.println ("End of main method."); 
   }
}