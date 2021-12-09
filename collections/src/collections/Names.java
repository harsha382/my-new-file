package collections;

public class Names {
	private String name;
	private int id;

	public Names(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return " The Name is "+name+" And id is "+id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}
