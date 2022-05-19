package com.masai;

public class Student {
	
	int roll;
	String name;
	String address ;
	String collegeName;
	
	public Student(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		roll = i;
		name = string ;
		address = string2;
		collegeName = string3;
	}

	public void getName() {
		
		System.out.println("Name is :"+this.name);
		System.out.println("Roll is :"+this.roll);
		System.out.println("Address is :"+this.address);
		System.out.println("College name is :"+this.collegeName);
		
		
	}
	
	public void setName(boolean a) {
		
		if(a==true) {
			
			System.out.println("He is blong to NIT");
		  getName();
		}
		else
		{
			System.out.println("He is Not belong to NIT");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Student d1 = new Student(34,"Santosh Chaoudhary Sahab","Mathura","jawahar");
		boolean b = true;
		d1.setName(b);
	}

}
