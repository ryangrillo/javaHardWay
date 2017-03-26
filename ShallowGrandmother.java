package javaHardWay;

import java.util.Scanner;

public class ShallowGrandmother {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		double income, cute;
		boolean allowed;
		boolean allowed2;
		int happy;
		
		System.out.print("Enter your age");
		age = keyboard.nextInt();
		
		System.out.print("Enter your yearly income: ");
		income = keyboard.nextDouble();
		
		System.out.print("How happy do you make them on a scale from 1-10? ");
		happy = keyboard.nextInt();
		
		System.out.print("How cute are you on a scale from 0.0 to 10.0 ? ");
		cute = keyboard.nextDouble();
		
		allowed = (age > 25 && age < 40 && (happy > 7));
		
		System.out.println("Allowed to date my grandchild? " + allowed);
		
	}
}