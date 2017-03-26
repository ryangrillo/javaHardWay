package javaHardWay;
import java.util.Scanner;
 
 public class BMICalculator {
     public static void main( String[] args ) {
         Scanner keyboard = new Scanner(System.in);
         double m, kg, bmi, lbs, inches, feet;
         String color;
 
         System.out.print( "Your height(feet only): " );
         feet = keyboard.nextInt();
         
         System.out.print( "Your height in inches: " );
         inches = keyboard.nextDouble();
        
         System.out.print( "Your weight in lbs: " );
         lbs = keyboard.nextDouble();
         
         
         System.out.print( "What is your favorite color?");
         color = keyboard.next();
         
         double inchesFinal = (feet * 12) + inches;
 
         bmi = (lbs * .454) / ((inchesFinal * .0254) * (inchesFinal * .0254));
 
         System.out.println( "Your BMI is " + bmi );
         System.out.println( "Your favorit color is " + color);
     }
     
 }
// 1.Does the program blow up if you enter an integer value when it is expecting you to type a double? 
// No because and double variable is big enough to hold an integer sized piece of information
// 
// 2. Does the program blow up if you enter a numeric value (integer or double) when it is expecting a String?
// yes.  Java can only store one type of value per variable and it must be declared on initialization
// 
// 3.  Type something that makes the program blow up on every question possible, and add comments 
// explaining what blew it up and why.
// words.52*
// This includes a string without "" and a decimal and char all in one.  No variable would allow for this many
// classifications