package com.pattern;

public class Pattern10 {

	public static void main(String[] args)
	{
		int n = 5;
		int p = 1;
		
		for(int i = 1; i<=n ; i++)
		{
			for(int k = n-1 ; k>=i ; k--)
			{
				System.out.print(" ");
			}
			for(int s = 1; s<=p; s++)
			{
				System.out.print((char)(64+i));
			}
			p+=2;
			System.out.println();
		}
	}
}
/*O/P :
    A
   BBB
  CCCCC
 DDDDDDD
EEEEEEEEE*/