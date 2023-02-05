package com.numbersystem;
import java.util.Scanner;

class FibSeries
{
	static void fib(int num)
	{
		int n1=1;
		int n2=1;
		int sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<num;i++)
		{
			sum=n1+n2;
			System.out.print(" "+ sum);
			n1=n2;
			n2=sum;
		}
	}
}

public class FibnocciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		FibSeries.fib(num);
		

	}

}
