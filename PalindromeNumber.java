package com.numbersystem;
import java.util.Scanner;

class Reverse
{
	public static  boolean reverse(int num)
	{
      int temp=num;
      int temp1=0;
      while(temp>0)
      {
    	 int rem=temp%10;
    	 temp1=temp1*10+rem;
    	 temp=temp/10;
      }
      if(temp1==num)
      {
    	  return true;
      }
      return false;
 }
}

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		boolean res=Reverse.reverse(num);
		if(res==true)
		{
			System.out.println(num+" is a palindrome number");
		}
		else
		{
			System.out.println(num+" is not a palindrome number");
		}
		

	}

}
