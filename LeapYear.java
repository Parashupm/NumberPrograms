package com.numbersystem;

import java.util.Scanner;

class Solution1
{
	static void leap(int year)
	{
        boolean leap=false;
		if(year % 4==0)
		{
			if(year %100==0)
			{
				if(year%400==0)
				{
					leap=true;
				}
				else
				{
					leap=false;
				}	
			}
			else
			{
				leap=true;
			}
		}
		else
		{
			leap=false;
		}
		
		if(leap)
		{
			System.out.println(year + " is a leap year");
		}
		else
		{
			System.out.println(year + " is a not leap year");
			
		}
	}
}
public class LeapYear {
     public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int year=sc.nextInt();
	 Solution1.leap(year);
}


}
