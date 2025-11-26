package mastery;

import java.util.Scanner;

/*

Program: ObjectHeight.java       		Date: November 26, 2025

Purpose: Create an application that displays the height of a falling object in a parabola.


Author: Karanveer S.
School: CHHS
Course: Computer Science 10
 

*/
public class ObjectHeight {

	public static void main(String[] args) {
		double time;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time less than 4.5 seconds: ");
		time = input.nextDouble();
		input.close(); //get time from user under 4.5
		System.out.println("The height of the object is " + (int)((100- (4.9 * (time * time) ))) + "m");
		//show height using formula in meters


	}

}
/* Screen Dump
Enter time less than 4.5 seconds: 2.3
The height of the object is 74m

*/