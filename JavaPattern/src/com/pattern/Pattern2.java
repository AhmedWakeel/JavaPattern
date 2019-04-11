package com.pattern;

public class Pattern2 {

	public static void main(String[] aegs)
	{
		int n = 5;
		 
		  for(int i = 1 ; i<=n ; i++)
		  {
			  for(int k = n-1 ;k>=i; k--)
			  {
				  System.out.print(" ");
			  }
			  for(int p = 1 ; p<=i;p++)
			  {
				  System.out.print(i);
			  }
			  System.out.println();
		  }
	}
	/*O/P:
           1
          22
         333
        4444
       55555
*/}
