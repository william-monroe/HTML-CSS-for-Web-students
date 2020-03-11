/*
Author: William Monroe
Date: 3/11/20

This program will calculate the amount in a savings account
*/
import java.util.Scanner;
class W2x13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double savingsNum = 0.0;
		double semiFinalNum1 = 0.0;
		double semiFinalNum2 = 0.0;
		double semiFinalNum3 = 0.0;
		double semiFinalNum4 = 0.0;
		double semiFinalNum5 = 0.0;
		double finalNum = 0.0;
		
		System.out.println("Enter a monthly saving amount.");
		System.out.print("Amount: ");
		savingsNum = input.nextDouble();
		
		semiFinalNum1 = savingsNum * ( 1 + 0.00417 );
		semiFinalNum2 = ( savingsNum + semiFinalNum1 ) * ( 1 + 0.00417 );
		semiFinalNum3 = ( savingsNum + semiFinalNum2 ) * ( 1 + 0.00417 );
		semiFinalNum4 = ( savingsNum + semiFinalNum3 ) * ( 1 + 0.00417 );
		semiFinalNum5 = ( savingsNum + semiFinalNum4 ) * ( 1 + 0.00417 );
		finalNum = ( savingsNum + semiFinalNum5 ) * ( 1 + 0.00417 );
		
		System.out.print("After the sixth month, the account value is $" + finalNum);
		
	}
}