// ******************************************************************* 
// Palindrome.java
// *******************************************************************

import java.util.Scanner;

public class Palindrome
{

public static void main (String[] args)
	{
	string input;
	Scanner scan = new Scanner (System.in); 
	System.out.println("Enter a potential palindrome."
	input=scan.nextLine(); 
	palindromes(input); 
	}

public static void palindromes (String test)
		{
		if (test.length()<2)
			System.out.println("This is a palindrome."); 
		else if (test.charAt(0)==test.charAt(test.length()-1))
			palindromes(test.substring(1,test.length()-1));
		else 
			System.out.println("This is not a palindrome.");
		}
}