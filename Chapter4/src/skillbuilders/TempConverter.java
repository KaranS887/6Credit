package skillbuilders;
import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		int fahrenheit;
		Scanner input = new Scanner(System.in);
		System.out.print("Fahrenheit: ");
		fahrenheit = input.nextInt();
		input.close();
		
		System.out.print("Celsius: " + Math.round((int)(5 * (fahrenheit - 32))/9 ));


		

		

	}

}
