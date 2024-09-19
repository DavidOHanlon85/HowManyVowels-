/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise06_HowManyVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = getUserName();
		System.out.println();
		calculateNumberOfVowelsInName(name);
	}

	/**
	 * This method calculates the number of vowels in a user's name based on user
	 * input
	 * 
	 * @param name - User name
	 */
	public static void calculateNumberOfVowelsInName(String name) {
		int vowel = 0;
		int vowela = 0;
		int vowele = 0;
		int voweli = 0;
		int vowelo = 0;
		int vowelu = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'A' || name.charAt(i) == 'a') {
				vowel++;
				vowela++;
			} else if (name.charAt(i) == 'E' || name.charAt(i) == 'e') {
				vowel++;
				vowele++;
			} else if (name.charAt(i) == 'I' || name.charAt(i) == 'i') {
				vowel++;
				voweli++;
			} else if (name.charAt(i) == 'O' || name.charAt(i) == 'o') {
				vowel++;
				vowelo++;
			} else if (name.charAt(i) == 'U' || name.charAt(i) == 'u') {
				vowel++;
				vowelu++;
			}

		}
		System.out.println("Number of vowels in your name: " + vowel + "\nNumber of a's in your name: " + vowela + "\nNumber of e's in your name: " + vowele + "\nNumber of i's in your name: " + voweli + "\nNumber of o's in your name: " + vowelo + "\nNumber of u's in your name: " + vowelu);
	}

	public static String getUserName() {
		// Instantiate scanner
		Scanner myScan = new Scanner(System.in);

		// Initialise and declare variables
		String name;

		// Prompt user
		System.out.println("What is your name?");
		name = myScan.nextLine();

		return name;
	}

}
