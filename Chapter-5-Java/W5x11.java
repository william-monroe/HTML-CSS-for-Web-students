/*
Author: William Monroe
Date: 4/1/20

This program will display all numbers 100 to 200 divisibile by 5 or six but not both.
*/
class W5x11 {
	public static void main(String[] args) {
		
		final int IN_A_LINE = 10;
				int find = 0;
				int num = 0;
				
				System.out.println("Counting from 100 - 200");
				System.out.println("Divisible by 5 or 6, but not 5 and 6");
				System.out.println("---------------------------------------");
				
				for ( num = 100; num <= 200; num++ ) {
					
					if ( num % 5 == 0 ^ num % 6 == 0 ) {
						find++;
						
						if (find % IN_A_LINE == 0)
							System.out.println( num );
							
						else
							System.out.print( num + " " );			
					}
				}
			
	}
}