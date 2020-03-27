/*
Author: William Monroe
Date: 3/27/20

This program will calculate the pay of an employee.
*/
import java.util.Scanner;
class W4x23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		String name;
		double hoursWorked;
		double payRate;
		double grossPay;
		double fedWthHld;
		double fedWthHldRt;
		double stWthHld;
		double stWthHldRt;
		double ttlDeduction;
		double netPay;

		System.out.println("Enter the following information:");
		
		System.out.print("Employee Name: ");
		name = input.nextLine();
		System.out.print("Number of Hours Worked: ");
		hoursWorked = input.nextDouble();
		System.out.print("Rate of Pay (in dollars per hour): ");
		payRate = input.nextDouble();
		System.out.print("Federal Witholding Rate: ");
		fedWthHldRt = input.nextDouble();
		System.out.print("State Witholding Rate: ");
		stWthHldRt = input.nextDouble();

		//calculate gross pay
		grossPay = ( hoursWorked * payRate );

		//calculate deductions

		fedWthHld = ( grossPay * fedWthHldRt );
		stWthHld = ( grossPay * stWthHldRt );

		ttlDeduction = ( fedWthHld + stWthHld );

		//calculate net pay

		netPay = ( grossPay - ttlDeduction );

		// display result

		//When printing, use "System.out.printf("%.2f\n", variable)" to get only 2 decimal places.
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		System.out.print("Employee Name: ");
		System.out.println(name);
		System.out.print("Hours Worked: ");
		System.out.printf("%.2f\n", hoursWorked);
		
		System.out.print("Pay Rate: $");
		System.out.printf("%.2f\n", payRate);
		System.out.print("Gross Pay: $");
		System.out.printf("%.2f\n", grossPay);
		System.out.println("Deductions:");
		System.out.print("     Federal Witholding Rate: ");
		System.out.printf("%.2f\n", fedWthHldRt);
		System.out.print("     Amount Witheld: $");
		System.out.printf("%.2f\n", fedWthHld);

		System.out.print("     State Witholding Rate: ");
		System.out.printf("%.2f\n", stWthHldRt);
		System.out.print("     Amount Witheld: $");
		System.out.printf("%.2f\n", stWthHld);
		
		System.out.print("     Total Deductions: $");
		System.out.printf("%.2f\n", ttlDeduction);
		System.out.println(" ");
		
		System.out.print("Net Pay: $");
		System.out.printf("%.2f\n", netPay);
		
	}
}