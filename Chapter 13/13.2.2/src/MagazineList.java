//*****************************************************************************
//MagazineList.java
//*****************************************************************************


public class MagazineList
{
private MagazineNode list;

public MagazineList()
{	
	list=null;
}

public void add (Magazine mag)
{
	MagazineNode node= new MagazineNode (mag);
	MagazineNode current;
	
	if (list==null)
		list=node;
	else
	{
		current = list;
		while (current.next != null)
			current = current.next;
		current.next = node;
	}
}

public String toString()
{
	String result = "";
	MagazineNode current = list;
	while (current != null)
	{
		result += current.magazine + "/n";
		current = current.next;
	}
	
	return result;
}

public void insert(Magazine mag)
{
	MagazineNode node= new MagazineNode (mag);
	MagazineNode current;
	
	if (list==null)
		list=node;
	else
	{
		current = list;
		while (current.next != null)
		{
			if (current.next.magazine.compareTo(mag)<0)
			{
				node.next = current;
				list=node; 
			}
			while(current !=null)
			{
				if(current.next=null)
					current.next=node;
			
				else if(current.next.magazine.compareTo(mag)>0)
				{
				node.next=current.next;
				current.next=node;
				}
				current=current.next;
			}
		}
	}

}

public void delete(Magazine mag)
{
	MagazineNode current;
	
	if (list==null)
		return;
	else
	{
		current = list;
		if (current.magazine.compareTo(mag)==0)
			list=list.next;
		else{
		while (current.next != null)
		{
			if(current.next.magazine.compareTo(mag)==0)
			{
				current.next=current.next.next;
			}
			current = current.next;
		}
	}	
}
}

private class MagazineNode
{
	public Magazine magazine;
	public MagazineNode next;
	
	public MagazineNode (Magazine mag)
	{
		magazine = mag;
		next = null; 
	}
	
}

}