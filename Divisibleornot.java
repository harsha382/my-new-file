package basics;

import java.util.Scanner;

public class Divisibleornot{


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		if (num % 7 == 0)
			System.out.println(num + ":is divisible");
		else
			System.out.println(num + ":is not divisible");
	}
}




	


