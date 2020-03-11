/*
Author: William Monroe
Date: 3/11/20

This program will find the cost of driving
*/
import java.util.Scanner;
class W2x23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double distance = 0.0;
		double mpg = 0.0;
		double ppg = 0.0;
		double total = 0.0;
		
		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		mpg = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		ppg = input.nextDouble();
		
		total = ( distance / mpg ) * ppg;
		
		System.out.println("The cost of driving is $" + total);
	}
}