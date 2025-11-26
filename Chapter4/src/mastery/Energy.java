package mastery;

import java.util.Scanner;

public class Energy {

	public static void main(String[] args) {
		double mass;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mass in kg: ");
		mass = input.nextDouble();
		input.close();
		double c = 3.0 * 1E8;
		
		System.out.println("The energy produced in joules is: " + (mass*c*c));
		System.out.println("The number of 100-watt light bulbs powered: " + ((mass*c*c) / 360000));


	}

}
/* Screen Dump
Enter mass in kg: 45
The energy produced in joules is: 4.05E18
The number of 100-watt light bulbs powered: 1.125E13
*/