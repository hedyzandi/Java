//******************************************************************************************************************************
//Pascal.java
//Programming Project 12.9 Page 614
//******************************************************************************************************************************

public class Pascal {
    public static void main(String[] args)
    {
        pp(9);
    }
    
    public static void pp(int lvl)
    {
        int [] pArray = new int[1];
         pArray[0]=1;
        ppr(pArray, lvl);
    }
    
    public static void ppr(int[] pArray, int lvl)
    {
        
        if(lvl==1)
        {
            for(int i=0;i<pArray.length;i++)
            {
                 System.out.print(pArray[i]+" ");
            }
            System.out.println();
        }
        else
        {
            int [] newpArray = new int[pArray.length+1];
            newpArray[0]=1;
             newpArray[newpArray.length-1]=1;
            for(int i=0;i<pArray.length-1;i++)
            {
                newpArray[i+1]=pArray[i]+pArray[i+1];
            }
            
            ppr(newpArray, lvl-1);
         }
    }
}