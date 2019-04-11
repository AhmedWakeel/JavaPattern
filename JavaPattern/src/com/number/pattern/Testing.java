package com.number.pattern;

import java.util.ArrayList;

public class Testing {

	String name = "hiwww";
}

class Employee<T>
{
	  public  void m1(Teacher<T> teacher)
	  {
		  int i = 7;
//		  float f = im;
		  
		  ArrayList<T> arrayList = new ArrayList<>();
//		  arrayList.add(T);
		  
               System.out.println(teacher.getClass().getName());
	  }
	  public static void main(String[] rgs)
	  {
		  Employee<String> employee = new Employee<String>();
		  Employee<Integer> employee1 = new Employee<Integer>();		  
		  Teacher<Integer> teacher = new Teacher<Integer>();
		  employee1.m1(teacher);
	  }
}


class Teacher<F>
{
	String m = "ddd";
	public Teacher() {
	}
}