/*
Author: William Monroe
Date: 4/22/20

This program formats a number to a certain width by adding 0s to the begginning of it.
*/
import java.util.Scanner;
class W6x37 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		int width = 0;
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		System.out.print("Enter a width for the number: ");
		width = input.nextInt();
		
		System.out.println("");
		System.out.println(format(number, width));
	}
	public static String format(int number, int width) {
		
		String num = "" + number;
		if ( num.length() < width ) {
			for (int i = width - num.length(); i > 0; i--) {
				num = 0 + num;
			}
		}
		
		return num;
	}
}