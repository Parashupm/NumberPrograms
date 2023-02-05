package com.numbersystem;
import java.util.Scanner;

class Special
{
	static boolean sNumber(int num)
	{
		int temp=num;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			int fact=1;
			for(int i=rem;i>=1;i--)
			{
				fact=fact*i;	
			}
			   sum=sum+fact;
			   temp=temp/10;
		 }
		if(sum==num)
		{
            return true;		
         }
		return false;
	}
}

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	    System.out.println(	Special.sNumber(num));
	}

}


// num= 145
//1!+4!+5!
// res=1+24+120=145 
// num==res (true)
