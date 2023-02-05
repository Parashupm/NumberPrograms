package com.numbersystem;
import java.util.Scanner;

class Perfect{
	public static boolean pnumber(int n)
	{   
		int sum=0;
	
		for(int k=1;k<n;k++)
		{
			if(n%k==0)
			{
				sum=sum+k;
			}	
	     }
		if(n==sum)
		{
			return true;
		}
		return false;
		}	
   }


public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Perfect.pnumber(n));
	

	}

}