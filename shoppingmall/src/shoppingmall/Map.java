package shoppingmall;

import java.util.Scanner;

class Map {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Input the sentence");
		String s1 = scn.nextLine();

		System.out.println("Input the word or combination-of-words to be searched");
		String s2 = scn.nextLine();

		/* searching the input word */

		int count = 0;

		while (s1.contains(s2)) {
			s1 = s1.substring(s1.indexOf(s2) + s2.length(), s1.length() - 1);
			count++;
		}
		if (count > 0) {
			System.out.println("String " + s2 + " exists, occures " + count + " times.");
		} else {
			System.out.println("String " + s2 + " does not exists.");
		}
	}
}
