package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class Newmethods {
	public static ArrayList l = new ArrayList();

	public static void main(String[] args) {
		Names n = new Names("Harsha", 100);
		Names n1 = new Names("Swany", 102);
		Names n2 = new Names("raja", 103);
		l.add(n);
		l.add(n1);
		l.add(n2);
		System.out.println(l);
		// Collections.sort(l);
		System.out.println(l);
		// Collections.binarySearch(l, "imam");
		// System.out.println(Collections.binarySearch(l, "imam"));
//		Collections.reverse(l);
		System.out.println(l);
		getObjects();
	}

	public static void getObjects() {
		for (Object r : l) {
			Names t = (Names) r;
			System.out.print(t.getName() + " And " + t.getId());
		}
	}

}
