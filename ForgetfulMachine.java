package javaHardWay;

import java.util.Scanner;

public class ForgetfulMachine {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What city is the Capital of France?");
		keyboard.next();
		
		System.out.println("What is your name?");
		keyboard.nextInt();
		
		System.out.println("Enter a number between 0.0 and 1.0 ?");
		keyboard.nextDouble();
		
		System.out.println("is there anything else you'd like to say?");
		keyboard.next();
//the 2nd questions blows up when i type an answer
	}
}