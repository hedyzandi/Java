//*****************************************************************************
//MagazineRack.java
//*****************************************************************************


public class MagazineRack
{

public static void main (String[] args)
{
	MagazineList rack = new MagazineList();
	
	rack.add (new Magazine("Time"));
	rack.add (new Magazine("Woodworking Today"));
	rack.add (new Magazine("Communications of the ACM"));
	rack.add (new Magazine("House and Garden"));
	rack.add (new Magazine("GQ"));
	
	rack.insert(new Magazine("Style"));
	rack.delete("Style");
	
	System.out.println (rack);

}

}