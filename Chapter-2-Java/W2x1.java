import java.util.Scanner;
/*
Author: William Monroe
Date: 3/10/20

This is how to convert fahrenheit to celsius
*/
class W2x1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double celsiusTemp = 0.0;
		double fahrenheitTemp = 0.0;
		
		System.out.println("Lets convert Celsius to Fahrenheit.");
		System.out.print("Enter Celsius Temperature: ");
		celsiusTemp = input.nextDouble();
		
		fahrenheitTemp = ( 9.0 / 5 ) * celsiusTemp + 32;
		
		System.out.println(celsiusTemp + " Celsius is " + fahrenheitTemp + " Fahrenheit.");
		System.out.println();
	}
}