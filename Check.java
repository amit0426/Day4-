package com.masai;

public class Check {
	
	void round(int num){
		
		 int a = num % 10;
		 
		 if(num%2==0) {
			 
			 
		 if ((a >= 5) && (a <= 9))
		 {
		     num = 10 * (num / 10 + 1);
		 }
		 
		 
		 else 
		 {
		     num = 10 * (num / 10);
		 }
		 System.out.println(num);
		 }else
		 {
			 System.out.println(num);
		 }
		
	}
	public static void main(String[] args) {
		
		Check d =  new Check();
		d.round(16);
		
	}

}
