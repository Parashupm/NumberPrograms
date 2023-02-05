package com.numbersystem;
import java.util.Scanner;

class Sum
{
	public static int digits(int num)
	{
		int sum=0;
		while(num>0)
		{   
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
}
public class SumofDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Sum.digits(num));
	}

}
