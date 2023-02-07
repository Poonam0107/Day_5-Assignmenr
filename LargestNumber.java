package com.functionalprogram;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number1 :");
		int number1 =sc.nextInt();
		System.out.println("Enter first number2 :");
		int number2 =sc.nextInt();
		System.out.println("Enter first number3 :");
		int number3 =sc.nextInt();
		if(number1>number2)
		{
			System.out.println("Number1 is greater "+number1);
		}
		else if(number2>number3)
		{
			System.out.println("Number2 is greater "+number2);
			
		}
		else
		{
			System.out.println("Number3 is greater "+number3);
		}
		
		
		

	}

}
