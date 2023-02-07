package com.functionalprogram;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		System.out.println("Enter the Number ");
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		if(isPrime(number))
		{
			System.out.println(number);
		}
		else
		{
			for (int i=1;i<=number/2;i++)
			{
				if(number %i==0 && isPrime(i))
			
				System.out.println(i+"");
				
			}
		}
		
	}
	private static boolean isPrime(int number)
	{
		return false;
	}

}
