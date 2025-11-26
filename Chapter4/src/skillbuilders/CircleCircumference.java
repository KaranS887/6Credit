/*

Program:CircleCircumference.java       		Date: November 26, 2025

Purpose: Create an application that displays the circumference of a circle given radius.


Author: Karanveer S.
School: CHHS
Course: Computer Science 10
 

*/
package skillbuilders;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		//ask user for radius
		double radius;
		Scanner input = new Scanner(System.in);
		System.out.print("Radius: ");
		radius = input.nextDouble();
		input.close();
		//compute circumference using built-in pi feature
		System.out.println("Circumference: " + (2 * Math.PI * radius));
		
		

	}

}
/* Screen Dump
Radius: 10
Circumference: 62.83185307179586






*/
