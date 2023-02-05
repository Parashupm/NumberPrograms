package com.numbersystem;
import java.util.Scanner;

class  Jump
{
  public static void jumpNumber (int num)
  {
	int temp;
	int digit;
	int check;
	for(int i = 0; i <= num; i++)
	{
		if(i < 10)
		{
			System.out.print(i + " ");
			continue;
		}
		check = 1;
		temp = i;
		digit = temp % 10;
		temp /= 10;
		while(temp != 0)
		{
			if(Math.abs(digit - temp % 10) != 1)
			{
				check = 0;
				break;
			}
			digit = temp % 10;
			temp /= 10;
		}
		if(check != 0)
			System.out.print(i + " ");
		}
	}
}
public class JumpingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Jump.jumpNumber(n);

	}
}
// All Single Digits are Jumping Numbers 
//the difference between the digits in the number is +-1 (65=> 6-5=1, 89=>8-9=-1)
