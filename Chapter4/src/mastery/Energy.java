/*

Program: Energy.java       		Date: November 26, 2025

Purpose: Create an application that displays energy based of mass using Einstein's formula.


Author: Karanveer S.
School: CHHS
Course: Computer Science 10
 

*/
package mastery;

import java.util.Scanner;

public class Energy {

	public static void main(String[] args) {
		double mass;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mass in kg: ");
		mass = input.nextDouble(); //ask user for mass
		input.close();
		double c = 3.0 * 1E8; //define c to make equation simpler
		
		System.out.println("The energy produced in joules is: " + (mass*c*c)); //display energy
		System.out.println("The number of 100-watt light bulbs powered: " + ((mass*c*c) / 360000)); //energy/360000 is 100-watt light bulb


	}

}
/* Screen Dump
Enter mass in kg: 45
The energy produced in joules is: 4.05E18
The number of 100-watt light bulbs powered: 1.125E13
*/