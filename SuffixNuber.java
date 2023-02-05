package com.numbersystem;
import java.util.Scanner;

class Suffix
{
	public static void addNumberLeft(int n1, int n2)
	{
		int n1count=0;
		int temp1=n1;
		int res=0;
		
		while(temp1>0)
		{
			n1count++;
			temp1=temp1/10;
		}
		
		for(int i=0;i<n1count;i++)
		{
			n1=n1*10;
		}
		
		res=n1+n2;
		System.out.println(res);
	
	}
}

public class SuffixNuber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Suffix.addNumberLeft(n1, n2);

	}

}
