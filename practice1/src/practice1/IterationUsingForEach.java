package practice1;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class IterationUsingForEach {

	private static ArrayList heros = new ArrayList();

	public static void main(String[] args) {
		Superheros ironman = new Superheros("ironman", "ironsuit");
		Superheros spiderman = new Superheros("spiderman", "spider web");
		Superheros superman = new Superheros("superman", "Laser eyes");
		Superheros batman = new Superheros("Batman", "technology");

		heros.add(ironman);
		heros.add(spiderman);
		heros.add(superman);
		heros.add(batman);

		getSuperheros();

	}

	private static void getSuperheros() {
		for (Object myheros : heros) {
		Superheros heros = (Superheros) myheros;
		System.out.println(((Superheros) heros).getName() +" uses  "   + heros.getWeapon());

	}
}
}