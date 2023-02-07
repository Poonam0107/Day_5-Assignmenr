package com.functionalprogram;

import java.util.Scanner;

public class QuotientReminder {

	public static void main(String[] args) {
	     Scanner sc =new Scanner(System.in);
	     System.out.println("Enter first number to divide");
	     int number1 = sc.nextInt();
	     System.out.println("Enter second number by which you want to divide");
	     int number2 =sc.nextInt();
	     int quotient = number1/number2;
	     System.out.println("Quotient is :"+quotient);
	     int reminder = number1%number2;
	     System.out.println("Reminder is :"+reminder);
	     

	}

}
