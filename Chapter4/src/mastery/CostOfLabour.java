/*

Program: TempConverter.java       		Date: November 26, 2025

Purpose: Create an application that displays celsius based on a given fahrenheit value.


Author: Karanveer S.
School: CHHS
Course: Computer Science 10
 

*/
package mastery;

import java.util.Scanner;

public class CostOfLabour {

	public static void main(String[] args) {
		int diameter;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter diameter of pizza in inches: ");
		diameter = input.nextInt();
		input.close();
		System.out.println("The cost of making the pizza is: $" + (1.75 + 0.05*diameter*diameter ) );

	}

}
/* Screen Dump
Enter diameter of pizza in inches: 8
The cost of making the pizza is: $4.95
*/
