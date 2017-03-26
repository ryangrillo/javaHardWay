package javaHardWay;
import java.util.Scanner;
public class CoinFlip {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String coin;
		String again;
		int streak = 0;
		boolean gotHeads;
		
		
		gotHeads = Math.random() < .5;
		
		while (gotHeads) {
			coin = "Heads";
			System.out.println("You flipped a coind and got heads");
			streak++;
			System.out.println("thats " + streak + " in a row");
			System.out.println("flip again (y or n) ");
			again = keyboard.next();
			 	if (again.equals("y")) {
				gotHeads = Math.random() < .5;
				}
				else 
				System.out.println("Thank you for playing");
				
		}
		System.out.println("You flipped a coin and it's tails. Game over");
	

			
	
	
	
		// do {
// 			gotHeads = Math.random() < .5;
// 			if (gotHeads)
// 				coin = "HEADS";
// 			else
// 				coin = "TAILS";
// 			
// 			System.out.println("You flip a coin and it is... " + coin);
// 			
// 			if (gotHeads) {
// 				streak++;
// 				System.out.println("\tThats " + streak + " in a row...");
// 				System.out.println("\tWould you like to flip again (y/n)? ");
// 				again = keyboard.next();	
// 			}
// 			else {
// 				System.out.println("\tYou lose everything");
// 				System.out.println("\tYou should have quit while aHead...");
// 					streak = 0;
// 					again = "n";
// 			}
// 		}	
//		while (again.equals("y"));
//			System.out.println("Final score: " + streak);
		
	}
}