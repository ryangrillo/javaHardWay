package javaHardWay;
import java.util.Scanner;
public class RunningTotal {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int current = 0;
		int total = 0;
		
		System.out.println("Type in a bunch of values and Ill add them up");
		
		System.out.println("I'll stop you when you type a zero");
		
		System.out.print("Value: ");
		current = keyboard.nextInt();
		
		// do {
// 			System.out.print("Value: ");
// 			current = keyboard.nextInt();
// 			total += current;
// 			System.out.println("The total is: " + total);
//		}
		
		
		
 			
 			
 			while (current != 0) {
 			System.out.print("Value: ");
 			current = keyboard.nextInt();
 			total += current;
 			
 			 if (current != 0) {
 			System.out.println("The total so far is: " + total);
 			}
		}
		
		System.out.println("The final total is: " + total);
	}
}