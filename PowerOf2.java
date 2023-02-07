package com.functionalprogram;

import java.util.Scanner;

public class PowerOf2 {
	public static final int VALUE=2;
	static int temp=1;
	static int i=1;

	public static void main(String[] args) {
		
	System.out.println("Enter power of two you wish :");
	Scanner sc = new Scanner(System.in);
	int power =sc.nextInt();
	while(i<=power)
	{
		if(i>=0 && i<31)
		{
			temp =temp * VALUE;
		}
		else
		{
			System.out.println("Invalid Power");
			return;
		}
		i++;
	}
	System.out.println(temp);
		

	}

}
