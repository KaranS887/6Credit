package mastery;

import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[] args) {
		double time;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter time less than 4.5 seconds: ");
		time = input.nextDouble();
		input.close();
		System.out.println("The height of the object is " + (int)((100- (4.9 * (time * time) ))) + "m");


	}

}
/* Screen Dump
Enter time less than 4.5 seconds: 
2.3
The height of the object is 74

*/