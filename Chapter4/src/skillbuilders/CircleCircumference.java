package skillbuilders;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		double radius;
		Scanner input = new Scanner(System.in);
		System.out.print("Radius: ");
		radius = input.nextDouble();
		input.close();
		System.out.println("Circumference: " + (2 * Math.PI * radius));
		
		

	}

}
