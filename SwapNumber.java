package com.functionalprogram;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int a,b;
		System.out.println("Enter first Number :");
		int a=sc.nextInt();
		System.out.println("Enter sencond Number :");
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp ;
		System.out.println(" first Number :"+a);
		System.out.println(" Second Number :"+b);
		

	}

}
