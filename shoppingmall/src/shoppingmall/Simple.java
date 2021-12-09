package shoppingmall;

import java.util.*;

class Simple {
	public static void main(String args[]) {
		List l = new ArrayList();
		l.add("Clothes");
		l.add("watches");
		l.add("grocery");
		System.out.println("please enter 1 to see the list");
		System.out.println("please enter 2 to add the list");
		Scanner input = new Scanner(System.in);

		String a = input.nextLine();
         int z = 0;
		if(z==1) {
	    System.out.println(l);
      }
         else if (z==2) {
        	 l.add(2, "   ");}
     		{
     			System.out.println(l);
     		}
     			System.out.println("please enter 2 to add an item");

     			String a3 = input.nextLine();
     			l.set(0, "mobiles");
     			System.out.println(l);
     			l.remove("grocery");

     			System.out.println("please enter 3 o remove grocery");
     			String a4 = input.nextLine();

     			System.out.println(l);

     		}
         }


		
	
