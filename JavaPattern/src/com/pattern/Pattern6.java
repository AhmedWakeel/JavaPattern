package com.pattern;

public class Pattern6 {

	public static void main(String[] args)
	{
		int n = 5;
		
		for(int i = n; i>=1; i--)
		{
			for(int k = n ;k>i ; k--)
			{
				System.out.print(" ");
			}
			for(int p = 1 ; p<=i; p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
O/P :
	
	*****
	 ****
	  ***
	   **
	    *
*/