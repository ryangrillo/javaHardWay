package javaHardWay;
import java.util.Scanner;

public class KeepGuessing {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secret;
		int guess;
		
		secret = 1 + (int)(Math.random()*10);
		
		System.out.println("I'm thinking of number from 1 - 10.");
		System.out.println("Try to guess it");
		
		System.out.print("your guess: ");
		guess = keyboard.nextInt();
		
		while (secret != guess) {
			System.out.println("Thats not right, Guess again");
			System.out.println("your guess: ");
			guess = keyboard.nextInt();
		}
		System.out.println("you guess it!!");
	}
}