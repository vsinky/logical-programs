package com.bridgelabz.junit;

import java.util.*;

public class Temperature {
	public static void main(String arg[]) {
		double f, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the conversion ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter  Fahrenheit temperature");
			f = sc.nextDouble();
			c = (f - 32) * 5 / 9;
			System.out.println("Celsius temperature is = " + c);
			break;
		case 2:
			System.out.println("Enter  Celsius temperature");
			c = sc.nextDouble();
			f = ((9 * c) / 5) + 32;
			System.out.println("Fahrenheit temperature is = " + f);
			break;
		default:
			System.out.println("please choose valid choice");
		}
	}
}