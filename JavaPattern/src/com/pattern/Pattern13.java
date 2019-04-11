package com.pattern;

public class Pattern13 {

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
			for(int s = p; s>=1; s--)
			{
				System.out.print(s);
			}
			p+=2;
			System.out.println();
		}
	}
}

/*O/P :
    1
   321
  54321
 7654321
987654321*/
