/*

Program: Digits.java       		Date: November 26, 2025

Purpose: Create an application that displays the digit places of a number.


Author: Karanveer S.
School: CHHS
Course: Computer Science 10
 

*/
package skillbuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		int num;
		int tens;
		int ones;
		Scanner input = new Scanner(System.in);
		//ask user for number and add to declared num variable
		
		System.out.println("2 Digit Number? ");
		num = input.nextInt();
		input.close();
		//seperate ones using module 10 and tens using integer of number divided by 10
		
		ones = (int)(num%10);
		tens = (int)(num / 10);
		System.out.println("Tens: " + tens + "\nOnes: " + ones);

		

	}

}
/* Screen Dump
2 Digit Number? 
45
Tens: 4
Ones: 5







*/