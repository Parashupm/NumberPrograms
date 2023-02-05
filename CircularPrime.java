package com.numbersystem;
import java.util.Scanner;

class Solution
{
	public static int count(int num)// returns the number of digits
	{
		int c=0;
		while(num>0)
		{
			num=num/10;
			c++;	
		}
		return c;
	}
	public static boolean check(int num)// check each circular is prime
	{   if(num<10)
	    {
		    if (num==2 || num==3|| num==5|| num==7)
		    {
			   return true;
		    }else
		    {
		    	return false;
		    }
		
	     }
		
		int digit=Solution.count(num);
		int rprime=0;
		
		for(int i=1;i<digit;i++)//loop will execute number of digits-1 time
		{
			int rem=num%10;
			num=num/10;
			for(int j=1;j<digit;j++)
			{
				rem=rem*10;
			}
			num=rem+num;
			int prime=0;
			for(int k=2;k<num;k++)
			{
				if(num%k==0)
				{
					prime++;
					break;
				}
			}
			if(prime==0)
			{
				rprime++;
			}
		}
		
		if(digit-1==rprime)
		{
			return true;
		}
		else
		{
			return false;
		}
   }
}
public class CircularPrime {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Solution.check(num));
	}
}
