/*

Program: Distance1n2.java       		Date: November 26, 2025

Purpose: Create an application that displays the total distance and name of runner.


Author: Karanveer S.
School: CHHS
Course: Computer Science 10
 

*/
package skillbuilders;
import java.util.Scanner;
public class Distance_1n2 {

	public static void main(String[] args) {
		//declare each section and name
		double first;
		double second;
		double third;
		String name;
		double distance;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first segment: ");
		first = input.nextDouble();
		System.out.print("Enter second segment: ");
		second = input.nextDouble();
		System.out.print("Enter third segment: ");
		third = input.nextDouble();
		System.out.print("Enter name: ");
		name = input.next();
		//ask user for distance and name
		input.close();
		distance = Math.round((first + second + third) * 10.0) / 10.0;
		//round to one decimal and show rounded number
		System.out.println("Name of runner: " + name + "\nTotal distance: " + distance);

	}

}
/* Screen Dump
 * 
Enter first segment: 45
Enter second segment: 34
Enter third segment: 123
Enter name: Karanveer
Name of runner: Karanveer
Total distance: 202.0

*/
