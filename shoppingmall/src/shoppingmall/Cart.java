package shoppingmall;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cart {
	private static ArrayList al = new ArrayList();

	private static Scanner sc = new Scanner(System.in);

	public static void getAllElement() {
		for (Object obj : al) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome to Grocerry Shop");
			System.out.println("1 : Adding an item ");
			System.out.println("2 : Remove an item ");
			System.out.println("3 : GetAll  item ");
			System.out.println("4 : Replace an item ");
			System.out.println("5 : Get an item ");
			System.out.println("6 : Exit");

			System.out.println();
			System.out.print("Enter Your Choice ");
			int a = sc.nextInt();

			switch (a) {
			case 1: {
				System.out.println("Enter the Element in the Cart");
				String item = sc.next();
				al.add(item);
				break;

			}
			case 2: {
				System.out.println("Enter the Element to be Removed ");
				int index = sc.nextInt();
				System.out.println(al.get(index));
				al.remove(index);
				getAllElement();
				break;
			}
			case 3: {
				System.out.println("Get All element ");
				getAllElement();
				System.out.println();
				break;
			}
			case 4: {
				System.out.println("Replace an Element");
				int index = sc.nextInt();
				String item = sc.next();
				al.remove(index);
				al.add(index, item);

				getAllElement();
				break;

			}
			case 5: {
				System.out.println("Get An Elements");
				int index = sc.nextInt();

				System.out.println(al.get(index));
				break;
			}
			case 6: {
				System.out.println("Thank You for using the application");
				flag = false;
				break;
			}
			}

		}

	}

}