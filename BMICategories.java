package javaHardWay;

import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double bmi;
		int feet;
		double inches;
		double lbs;
		
		 System.out.print( "Your height(feet only): " );
         feet = keyboard.nextInt();
         
         System.out.print( "Your height in inches: " );
         inches = keyboard.nextDouble();
         
         System.out.print( "enter your weight in lbs: ");
         lbs = keyboard.nextDouble();
         
         double inchesFinal = (feet * 12) + inches;
         
         bmi = (lbs * .454) / ((inchesFinal * .0254) * (inchesFinal * .0254));
		
		System.out.print("BMI catergory: ");
		
		if (bmi < 15.0) {
			System.out.println( "Very severely underweight ");
		}
		else if (bmi <= 16) {
			System.out.println(" Severely underweight ");
		}
		else if (bmi <= 18.5) {
			System.out.println( "underweight" );
		}
	    if (bmi <= 25.0) {
			System.out.println( "normal weight" );
		}
		else if (bmi <= 30.0) {
			System.out.println( "overweight");
		}
		else if (bmi <= 35.0) {
			System.out.println( "moderately overweight");
		}
		else if (bmi <= 40.0) {
			System.out.println( " severely obese ");
		}
		else {
			System.out.println( "very severly/\"morbidly\" obese");
		}
	}
}