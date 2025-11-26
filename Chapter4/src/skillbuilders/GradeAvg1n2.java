/*

Program:  GradeAvg.java       		Date: November 26, 2025

Purpose: Create an application that displays the average of a group of grades.


Author: Karanveer S.
School: CHHS
Course: Computer Science 10
 

*/
package skillbuilders;

import java.util.Scanner;
import java.text.NumberFormat;


public class GradeAvg1n2 {

	public static void main(String[] args) {
		int grade1;

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first grade: ");
		grade1 = input.nextInt();
		System.out.print("Enter second grade: ");
		grade1 += input.nextInt();
		System.out.print("Enter third grade: ");
		grade1 += input.nextInt();
		System.out.print("Enter fourth grade: ");
		grade1 += input.nextInt();
		System.out.print("Enter fifth grade: ");
		grade1 += input.nextInt();
		double average = grade1/5;
		//add all grades to one variable and divide by 5
		NumberFormat percent = NumberFormat.getPercentInstance();
		//turn to percent by formatting and dividing by 100
		System.out.print("Average: " + percent.format(average / 100));
		input.close();
		

		
		

	}

}
/* Screen Dump
 * 
Enter first grade: 78
Enter second grade: 95
Enter third grade: 32
Enter fourth grade: 25
Enter fifth grade: 98
Average: 65%
*/

