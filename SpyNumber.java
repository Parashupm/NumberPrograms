package com.numbersystem;
import java.util.Scanner;

class Spy
{
	public static boolean isSpyNum(int num)//123
	{
		int sum=0;
		int mul=1;
		
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem; // 1+2+3=6
			mul=mul*rem;// 1*2*3=6
			num=num/10;
		}
		if(sum==mul)
		{
			return true;
		}
		return false;
	}
}


public class SpyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt(); 
	System.out.println(Spy.isSpyNum(num));

	}


}
