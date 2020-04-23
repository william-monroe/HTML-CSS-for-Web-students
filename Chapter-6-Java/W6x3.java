/*
Author: William Monroe
Date: 4/8/20, 4/9/20

This program tells if a number you enter is a palindrome
*/
import java.util.Scanner;
public class W6x3 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
				
		int num = 0;
				
		System.out.print("Enter a number: ");
		num = in.nextInt();
				
		System.out.println(num + (isPalindrone(num) ? " is " : " is not ") +
							"a palindrome.");
	}
	
	public static int reverse(int num){
		
		String revNum = "";

		while(num != 0){
			revNum += num % 10;
			num = num / 10;
		}
		
		return Integer.parseInt(revNum);
	}
	
	public static boolean isPalindrone(int num){
		if (num == reverse(num))
		return true;
		return false;
	}
}