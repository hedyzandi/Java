// ******************************************************************** 
// ParenMatch.java
//
// Determines whether or not a string of characters contains
// matching left and right parentheses.
// ******************************************************************** 

import java.util.*; 
import java.util.Scanner;

public class ParenMatch 
{

public static void main (String[] args) 
{

Stack s = new Stack();

String line; // the string of characters to be checked

Scanner scan = new Scanner(System.in);

System.out.println ("\nParenthesis Matching");
System.out.print ("Enter a parenthesized expression: ");

line = scan.nextLine();

int rights=-1;



for (int i=0; i<line.length(); i++)
{
	if(line.charAt(i)=='(')
		s.push(new Integer(i));
	else if(line.charAt(i)==')')
	{
		if(!s.empty())
			s.pop();
		else
			rights=i;
	}
}

if(s.empty()&& rights<0)
	System.out.println("okay");
else if(s.empty())
	System.out.println("too many ) at "+ rights);
else
	System.out.println("too many ( " + s.pop());

}
}


