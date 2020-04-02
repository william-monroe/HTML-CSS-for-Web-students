/*
Author: William Monroe
Date: 4/2/20

This program finds the numbers of consonants and vowels in a string.
*/
import java.util.Scanner;
class W5x49 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double voCo = 0;
		double coCo = 0;
		String word;
		int i;
		
		System.out.print("Type some text: ");
		word = input.nextLine();
		
		word = word.toLowerCase();
		
		for( i = 0; i < word.length(); i++) {
			
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
				
				voCo++;
			}
			else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
				coCo++;
			}
		}
		System.out.printf("There are %.0f consonants and %.0f vowels.", coCo, voCo);
		System.out.println(" ");
		System.out.println("(The letter 'y' is considered a consonant.)");
	}
}