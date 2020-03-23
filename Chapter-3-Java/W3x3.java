/*
Author: William Monroe
Date: 3/12/20

This program will allow you to find the solution of two linear equations.
*/
import java.util.Scanner;
class W3x3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;
		double x = 0.0;
		double y = 0.0;
		
		System.out.println("Have your two equations in the ax+by=e and cx+dy=f formats");
		System.out.print("Enter a: ");
		a = input.nextDouble();
		System.out.print("Enter b: ");
		b = input.nextDouble();
		System.out.print("Enter c: ");
		c = input.nextDouble();
		System.out.print("Enter d: ");
		d = input.nextDouble();
		System.out.print("Enter e: ");
		e = input.nextDouble();
		System.out.print("Enter f: ");
		f = input.nextDouble();
		
		if ((( a * d ) - ( b * c )) == 0 )
		{
			System.out.println("Unsolvable");
		}
		else {
			
			x = ((( e * d ) - ( b * f ))/(( a * d ) - ( b * c )));
			y = ((( a * f ) - ( e * c ))/(( a * d ) - ( b * c )));
			
			System.out.println( "x = " + x );
			System.out.println( "y = " + y );
			
		}
	}
}