package com.numbersystem;
import java.util.Scanner;


class AutoMorphic
{
	public static boolean  automorphic(int num)
	{
		int temp=num;
		int c=0;
		while(temp>0)
		{
			c++;
			temp=temp/10;	
		}
		
		int res=num*num;
		int temp1=num;
		while(c>0)
		{
			int rem1=temp1%10;
			int rem2=res%10;
			if(rem1!=rem2)
			{
				return false;
			}
			temp1=temp1/10;
			res=res/10;
			c--;
		}
		return true;	
	}
}
public class AutoMorphicNumber {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=AutoMorphic.automorphic(n);
		if(res==true)
		{
			System.out.println(n +" is an AutoMorphicNumber");
		}
		else
		{
			System.out.println(n +" is not AutoMorphicNumber");
		}

	}

}

//5*5=25 
//6*6=36
//25*25=625
// n is present in the result  at last

