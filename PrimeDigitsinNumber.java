package com.numbersystem;
import java.util.Scanner;

class PrimeDigit {
	static int  primedigit(int num)
	{
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			int flag=0;
			for(int i=2;i<rem;i++)
			{
				if(rem%i==0 )
				{
					flag++;
					break;
				}
			}
			if(flag==0 &&rem!=1 && rem!=0)
			{
				count++;
			}
			num=num/10;
		}
		return count;
	}

}
public class PrimeDigitsinNumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println(PrimeDigit.primedigit(num));
		
		
	}
}


