package com.masai;

public class Bean {
	
	int roll;
	String name;
	int age ;
	int marks;

	 Bean(int roll, String name, int marks, int age) {
		
		
		// TODO Auto-generated constructor stub
		
		this.roll=roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
		
	}
	
	 void name()
	{
		if((age > 18 && age<= 60) && (0<marks && marks<=500))
		{
		System.out.println("Name is:"+name);
		
		
		System.out.println("Roll Number is:"+roll);
	
		System.out.println("Age is :"+age);
	
		System.out.println("Marks is:"+marks);
		}
		
		else
			{
			System.out.println("Invalid Person");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bean d1 = new Bean(20,"amit",400,23);
		Bean d2 = new Bean(18,"jay",400,25);
		
//		int roll = 20;
//	     String name = "Amit";
//		  int age  = 23;
//		 int marks = 500;
//		Bean();
		d1.name();
		
		System.out.println("************");
		d2.name();
		
	}

}
