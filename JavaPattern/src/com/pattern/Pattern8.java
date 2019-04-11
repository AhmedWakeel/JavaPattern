package com.pattern;

public class Pattern8 {

	public static  void main(String[] args)
	{
		int n = 5;
		int k = 1;
		
		for(int i = 1 ; i<=n;i++)
		{
			for(int x = n-1;x>=i;x--)
			{
				System.out.print(" ");
			}
			for(int f = 1; f<=k;f++)
			{
				System.out.print(i);
			}
			k+=2;
			System.out.println();
		}
	}
}

/*O/P :
	 
    1
   222
  33333
 4444444
555555555*/

