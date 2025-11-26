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
		NumberFormat percent = NumberFormat.getPercentInstance();

		System.out.print("Average: " + percent.format(average / 100));
		input.close();
		

		
		

	}

}
