package com.numbersystem;
import java.util.Scanner;

class Happy
{   
	public static int helper(int num)
	{
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			int n=rem*rem;
			sum=sum+n;
			temp=temp/10;
		}
		return sum;
	}
	public static String happy(int  num)
	{
		int res=num;
		while(res!=1 && res!=4)
		{
			res=Happy.helper(res);
		}
		if(res==1)
		{
			return "Happy_Number";
		}
		else
		{
			return "UnHappy_Number";
		}
	}
}

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  num=sc.nextInt();
		System.out.println(Happy.happy(num));
	}

}

//28
//2^2+8^2=68
//6^2+8^2=100
//1^2+0^2+0^2=1
//res=1 


