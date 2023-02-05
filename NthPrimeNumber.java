package com.numbersystem;
import java.util.Scanner;

class Prime
{
	public static int nthPrime(int num)
	{
		int n=0;
		for(int i=2;i<num;i++)
		{
			int count=0;
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			 
			if(count==0)
			{
				n=i;
			}
		}
		return n;
	}	
}
public class NthPrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Prime.nthPrime(n));
	

	}

}
