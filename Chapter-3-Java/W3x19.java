/*
Author: William Monroe
Date: 3/23/20

This program calculates the perimeter of a triangle.
*/
import java.util.Scanner;
class W3x19 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double longSide = 0.0;
		double shortSide1 = 0.0;
		double shortSide2 = 0.0;
		double perimeter = 0.0;
		
		System.out.println("We are going to find the perimeter of a triangle.");
		System.out.print("Enter the length of the first side:1 ");
		longSide = input.nextDouble();
		System.out.print("Enter the length of the second side: ");
		shortSide1 = input.nextDouble();
		System.out.print("Enter the length of the third side: ");
		shortSide2 = input.nextDouble();
		
		if ( (longSide < shortSide1 + shortSide2) && (shortSide1 < longSide + shortSide2) && (shortSide2 < longSide + shortSide1 ) )
		{
			perimeter = ( shortSide1 + shortSide2 + longSide );
			System.out.println( "Perimeter: " + perimeter );
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}