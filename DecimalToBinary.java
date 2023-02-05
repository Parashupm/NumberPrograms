package com.numbersystem;
import java.util.Scanner;

class DecimalConversation
{
	public static void convert(int num)
	{ 
		if(num==0)
		{
			System.out.println(0);
		}
		int temp=num;
		int count=0;
		
		while(temp>0)
		{
			count++;
			temp=temp/2;
		}
		int res[]=new int[count];
		int arr=res.length-1;
		while(num>0)
		{
			int rem=num%2;
			res[arr--]=rem;
			num=num/2;
		}
		
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}	
	}
}

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		DecimalConversation.convert(n);
	}
}
