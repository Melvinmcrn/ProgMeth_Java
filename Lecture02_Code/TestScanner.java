import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4 numbers: ");
		double d1=0,d2=0,d3=0,d4=0;
		try {
			d1 = sc.nextDouble();
			d2 = sc.nextDouble();
			d3 = sc.nextDouble();
			d4 = sc.nextDouble();
		}
		catch(InputMismatchException e) {
			System.out.println("Error, must enter number!");
		}
		double sum = d1 + d2 + d3 + d4;
		System.out.println("sum is " + sum);
	}

}
