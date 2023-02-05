package com.numbersystem;
import java.util.Scanner;

class Nprime 
{
	 static void nprime(int num)
	{  	
		int [] a=new int[num];
		int index=0;
		int count=0;
		for(int i=2;i>0;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				a[index++]=i;
				count++;
			}
			if(count==num)
			{
				break;
			}
		}
		int sum=0;
		System.out.print("N Prime Numbers: ");
		for(int i=0;i<a.length;i++)
		{   sum=sum+a[i];
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		float avg=sum/num;
		System.out.println("Sum is : " +sum);
		System.out.println("Avg is : "+avg);
  }
}
public class NPrimeNumbersSumAverage {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
    Nprime.nprime(n);
}

}
