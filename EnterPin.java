package javaHardWay;

import java.util.Scanner;

public class EnterPin {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		pin = 12345;
		
		System.out.println("Welcome to the Bank of Java");
		System.out.println("Enter your pin");
		entry = keyboard.nextInt();
		
		while (entry != pin) {
			System.out.println("incorrect Pin: Try again");
			System.out.println("Enter your Pin: ");
			entry = keyboard.nextInt();
		}
	}
}