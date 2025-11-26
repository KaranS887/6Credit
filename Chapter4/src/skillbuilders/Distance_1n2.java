package skillbuilders;
import java.util.Scanner;
public class Distance_1n2 {

	public static void main(String[] args) {
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
		
		input.close();
		distance = Math.round((first + second + third) * 10.0) / 10.0;
		System.out.println("Name of runner: " + name + "\nTotal distance: " + distance);

	}

}
