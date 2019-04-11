package com.pattern;

public class Pattern7 {

	public static void main(String[] args)
	{
		int n = 1;
		int b = 5;
		
		for(int i = 1; i<=b; i++)
		{
			for(int j=b-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int y=1; y<=n ; y++)
			{
				System.out.print("*");
			}
			n+=2;
			System.out.println();
		}
	}
}

/*O/P  :
	
    *
   ***
  *****
 *******
*********
*/