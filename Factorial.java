package com.numbersystem;
import java.util.Scanner;

class Fact
{
	public static int fact(int num)
	{
//		int fact=1;
//		for(int i=num;i>=1;i-- )
//		{
//			fact=fact*i;
//		}
//		return fact;
		
		// recursion
		
		if(num==1)
			return 1;
		return num*fact(num-1);
		
		
	}
}

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Fact.fact(num));
	}

}
