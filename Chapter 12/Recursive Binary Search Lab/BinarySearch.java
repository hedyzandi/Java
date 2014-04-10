//******************************************************************************************************************************
//BinarySearch.java
//
//******************************************************************************************************************************

private int binarySearchR (int target, int lo, int hi) 

{ 
 int index; 
 if (high<lo) 
 index = -1;
 
 else
 { 
 int mid = (lo + hi)/2; 
 
 
 if ( list[mid]==target ) // found it! 
 index = mid; 

 else if (target < list[mid])
	index=binSearchR(target, lo, mid)
	
 else
	index=binSearchR(target, mid, high)
	
}	
 }
