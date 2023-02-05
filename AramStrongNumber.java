package com.numbersystem;
import java.util.Scanner;

class AStrong
{
	public static boolean  isAramStrong(int num)
	{
		int temp=num;
		int temp1=num;
		int count=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		int mul=0;
		
		while(temp1>0)
		{   int cube=1;
		
			int rem=temp1%10;
			
			for( int i=1;i<=count;i++)
			{
				cube=cube*rem;	
			}
			 mul=mul+cube;
			 temp1=temp1/10;
		}
		
		if(num==mul)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class AramStrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();// 9474 = 9^4 + 4^4 + 7^4 + 4^4
	    System.out.println(AStrong.isAramStrong(num));

		}

}
