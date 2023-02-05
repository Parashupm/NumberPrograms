package com.numbersystem;
import java.util.Scanner;

class PrimeRange {
	static void primeRange(int n)
	{
		for(int i=2;i<n;i++)
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
				System.out.print(i+" ");
			}
		}
	}
}
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		PrimeRange.primeRange(n);
		
	}

}
