package com.numbersystem;


public class SwapTwoNumbers {

	public static void main(String[] args) {
	
		int n1=10;
		int n2=20;
		
	//swaping two numbers without temprary variable
//		n1 =n1+n2;
//		n2= n1-n2;
//		n1=n1-n2;
	    System.out.println(n1+" "+n2); 
   //swaping two numbers using  temprary variable
	    
	    int temp=n1;
	    n1=n2;
	    n2=temp;
	    System.out.println(n1+" "+n2); 
	    
	    
		

	}

}
