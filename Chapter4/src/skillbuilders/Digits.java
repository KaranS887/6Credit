package skillbuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		int num;
		int tens;
		int ones;
		Scanner input = new Scanner(System.in);
		
		System.out.println("2 Digit Number? ");
		num = input.nextInt();
		input.close();
		
		ones = (int)(num%10);
		tens = (int)(num / 10);
		System.out.println("Tens: " + tens + "\nOnes: " + ones);

		

	}

}