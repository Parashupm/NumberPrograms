package com.numbersystem;
import java.util.Scanner;

class Round
{
	public static int round(int num)
	{  
		int count=0;
		int temp=num;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
	   int n=10*count;
	
       int rem=num%10;
       if(rem<=5)
       {
    	   num=num-rem;
       }
       else
       {
    	   int n2=n-num;
    	   num=num+n2;
       }
       
       return num;
	}
}
public class RoundUpNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(Round.round(num));	
	}
}

// num=>11 && num<=15 => 10
//num>15 && num<=20 =>20