package com.pattern;

public class Pattern3 {

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
				  System.out.print(p);
			  }
			  System.out.println();
		  }
	}
}
/*
O/P :
	
    1
   12
  123
 1234
12345*/