package javaHardWay;
import java.util.Scanner;
public class SafeSquareRoot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double x;
		double y;
		String ready;
		
		System.out.print("Are you ready (yes/no): ");
		ready = keyboard.next();
		
		while (ready.equals("no")) {
			System.out.println("We will not start until you are ready");
			System.out.print("Are you ready (yes/no: ");
		    ready = keyboard.next();
			
		}
		
		System.out.print("Give me a number, and I'll find the square root. ");
		System.out.print("No negatives please: ");
		x = keyboard.nextDouble();
		
		while (x < 0) {
			System.out.println("I won't take the square root of a negative");
			System.out.println("New number please: ");
			x = keyboard.nextDouble();
		}
		y = Math.sqrt(x);
		
		System.out.println("The square root of " + x + " is equal to " + y);
	}
}