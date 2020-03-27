/*
Author: William Monroe
Date: 3/25/20

This program will find the area of a pentagon
*/
import java.util.*;
import java.util.Scanner;
import javax.swing.*;

class W4x1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double r = 0.0;
		double s = 0.0;
		double area = 0.0;
		double pi = 3.14;
		double sinV = Math.sin( pi / 5 );
		double tanV = Math.tan( pi / 5 );
		
		System.out.println("This program finds the area of a Pentagon.");
		System.out.print("Enter the distance from the center to a vertex: ");
		r = input.nextDouble();
		
		s = ( 2 * r * sinV);
		area = ( ( 5 * ( s * s ) ) / (4 * tanV));
		
		System.out.println( "The area is " + area );
	}
}