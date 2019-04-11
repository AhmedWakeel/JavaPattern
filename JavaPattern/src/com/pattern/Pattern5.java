package com.pattern;

public class Pattern5 {

	public static void main(String[] args)
	{
		int ch ='A';
//		System.out.println('A');
		
		int n = 5;
		
		for(int i =  1 ; i<=n ; i++)
		{
			for(int k = n-1 ; k>=i ;k--)
			{
				System.out.print(" ");
			}
			for(int p = 1 ; p<=i ; p++)
			{
				System.out.print((char)(64+p));
			}
			System.out.println();
		}
		
		/*for(int i =  0 ; i<n ; i++)
		{
			for(int k = n-1 ; k>i ;k--)
			{
				System.out.print(" ");
			}
			for(int p = 0 ; p<=i ; p++)
			{
				System.out.print((char)(65+p));
			}
			System.out.println();
		}*/
	}
}

