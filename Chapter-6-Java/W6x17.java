/*
Author: William Monroe
Date: 4/3/20

This program generates an N by N matrix of random 1s and 0s
*/
import java.util.Scanner;
public class W6x17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		int n = 0;
		
		
		System.out.print("Enter a number for N: ");
		n = input.nextInt();
		
		printMatrix(n);
	}
	public static void printMatrix(int n) {
		// the loop wouldn't work unless I declared the variables inside the loop conditions.
		for (int rows = 0; rows < n; rows++) {
			
			for (int cols = 0; cols < n; cols ++) {
			
				System.out.print((int)(Math.random() * 2));
				
			}
			System.out.println();
		}
	}
}