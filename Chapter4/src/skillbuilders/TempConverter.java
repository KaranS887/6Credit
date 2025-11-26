/*

Program: TempConverter.java       		Date: November 26, 2025

Purpose: Create an application that displays celsius based on a given fahrenheit value.


Author: Karanveer S.
School: CHHS
Course: Computer Science 10
 

*/
package skillbuilders;
import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		int fahrenheit;
		Scanner input = new Scanner(System.in);
		System.out.print("Fahrenheit: ");
		fahrenheit = input.nextInt();
		input.close();
		//ask for fahrenheit
		System.out.print("Celsius: " + Math.round((int)(5 * (fahrenheit - 32))/9 ));
		//use fahrenheit conversion formula


		

		

	}

}
/* Screen Dump
Fahrenheit: 78
Celsius: 25
*/