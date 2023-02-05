package com.numbersystem;
import java.util.Scanner;

class Prefix
{
	public static void addNumberRight(int n1, int n2)
	{
		int n2count=0;
		int temp1=n2;
		int res=0;
		while(temp1>0)
		{
			n2count++;
			temp1=temp1/10;
		}
		for(int i=0;i<n2count;i++)
		{
			n2=n2*10;
		}
		res=n2+n1;
		System.out.println(res);
	}
}

public class PrefixNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Prefix.addNumberRight(n1, n2);
		

	}

}
