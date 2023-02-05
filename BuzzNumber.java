package com.numbersystem;
import java.util.Scanner;

class Buzz
{
	public static String buzz(int num)
	{
		if(num%7==0 || num%10==7)
		{
			return "Buzz Number";
		}
		
		 return "Not a Buzz Number";
	}
}

public class BuzzNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Buzz.buzz(num));
		

	}

}
