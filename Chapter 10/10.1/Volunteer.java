//********************************************************************
//  Volunteer.java       Author: Zandi/Hedieh
//
//  Represents a staff member that works as a volunteer.
//********************************************************************

public class Volunteer extends StaffMember implements Payable 
{
   //-----------------------------------------------------------------
   //  Constructor: Sets up this volunteer using the specified
   //  information.
   //-----------------------------------------------------------------
   public Volunteer (String eName, String eAddress, String ePhone)
   {
      super (eName, eAddress, ePhone);
   }

   //-----------------------------------------------------------------
   //  Returns a zero pay value for this volunteer.
   //-----------------------------------------------------------------
   public double pay()
   {
      return 0.0;
   }
    public double getPayable;
   {
   return amount;
   }
}