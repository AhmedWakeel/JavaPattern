package com.number.pattern;

import java.math.BigInteger;
import java.util.LinkedHashSet;

public class Pattern11 {

	public static void main(String[] args)
	{
//		/igfgfgf/ 
		
//		HashSet<String>  obj1= new HashSet<String>();
		LinkedHashSet<String> obj1 = new LinkedHashSet<>();
        obj1.add("Alive");
        obj1.add("i");
        obj1.add("Awesome");
        System.out.println(obj1);  
		
		
		/*Map<Integer, Integer> map = new HashMap<>();
		Integer put = map.put(1, 4);
		System.out.println(put);
		
		
		Integer put2 = map.put(1, 10);
		System.out.println(put2);*/
		
		/*ArrayList<Integer> arrayList =new ArrayList<>();
		arrayList.add(2);
		arrayList.add(10);
		arrayList.add(1);
		System.out.println(arrayList);
		
		LinkedList<Integer> integers1 = new LinkedList<>();
		integers1.add(2);
		integers1.add(10);
		integers1.add(1);
		System.out.println(integers1);
		
		
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(2);
		hashSet.add(10);
		hashSet.add(1);
		System.out.println(hashSet);
		
		TreeSet<Integer> integers = new TreeSet<>();
		integers.add(2);
		integers.add(10);
		integers.add(1);
		System.out.println(integers);
		
		LinkedHashSet<Integer> hashSet2 = new LinkedHashSet<>();
		hashSet2.add(2);
		hashSet2.add(10);
		hashSet2.add(1);
		System.out.println(hashSet2);*/
		
		
		/*int n = 5;
		int x = 1;
		for(int i =1 ; i<=n ; i++)
		{
			for(int j = 1; j<=n;j++)
			{
				System.out.printf("%3d",mk(x++));
			}
			System.out.println();
		}*/
	}
	
	public static int mk(int n)
	{
		System.out.println("dd"+n);
		BigInteger bigInteger  =  BigInteger.valueOf(0);
		for(int i = 0; i< n ; i++)
		{
			bigInteger = bigInteger.nextProbablePrime();
		}
		return bigInteger.intValue();
	}
}
