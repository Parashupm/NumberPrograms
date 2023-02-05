package com.numbersystem;
import java.util.Arrays;
import java.util.Scanner;

class Maximum
{
	public static int  max(int num)
	{
		String str=num+"";
		char c[]=str.toCharArray();
		int res[]=new int[str.length()-1];
		for(int i=0;i<c.length-1;i++)
		{
			int  n1=c[i]-48;
			int n2=c[i+1]-48;
			int n3=10*n1;
			int n4=n3+n2;
			res[i]=n4;	
		}
		Arrays.sort(res);
		return res[res.length-1];
	}
}
public class MaxPairNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
       System.out.println(Maximum.max(num));
	}
}

// num=45392187
// 45 , 53,39, 92, 21, 18 , 87
// res=92