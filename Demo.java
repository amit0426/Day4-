package com.masai;

public class Demo {
	
	String s;
	int i;
	float f;
	
	Demo(){
		this("hello");
		
	}
	Demo(String s){
		System.out.println("Name is :"+s);
		
	}
	Demo(int i){
		System.out.println("Age is "+i);
		
	}
	Demo(float f){
		System.out.println("it is float value"+f);
		
	}
	
	public static void main(String[] args) {
		
		Demo n = new Demo();
		Demo n1 = new Demo(20);
		Demo n2 = new Demo("Amit");
		float x = 0;
		Demo n3 = new Demo(x);
				
		
	}

}
