//*****************************************************************************
//Magazine.java
//*****************************************************************************

public class Magazine 
{
	private String title;
	
	public Magazine (String newTitle)
	{
		title = newTitle;
	}
	
	public String toString ()
	{
		return title;
	}
	
	public int compareTo(Magazine mag)
	{
		int tbr=title.compareTo(mag.toString());
		
		if (tbr<0)
			tbr = -1; 
		else 
		{
			if (tbr!=0)
			tbr = 1;	
		}
			
		
		return tbr;
	}

}