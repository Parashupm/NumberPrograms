package com.numbersystem;
import java.util.Scanner;

class Count
{
	public static int digits(int num)
	{
		int c=0;
		while(num>0)
		{   c++;
			num=num/10;
		}
		return c;
	}
}

public class CountDigitsinNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Count.digits(num));
		
		
	}

}
