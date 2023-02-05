package com.numbersystem;

import java.util.Scanner;

public class FactorialNumberDigitSum {

	public static int factsum(int num)
	{   int fact=1;
		for(int i=num;i>=1;i-- )
		{
			fact=fact*i;
		}
		int temp=fact;
		int sum=0;
		while(temp>0)
		{
		 int rem=temp%10;
		  sum=sum+rem;
		  temp=temp/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		System.out.println(factsum(n));
	}


}
