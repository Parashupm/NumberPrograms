package com.numbersystem;

import java.util.Scanner;

class Fibbnocci
{
	static int fib(int num)
	{
		
		if(num==1|| num==2)
		return 1;
		
		return fib(num-1)+fib(num-2);
	}
}

public class NthFibbnocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Fibbnocci.fib(num));

	}

}
