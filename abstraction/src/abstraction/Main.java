package abstraction;

public class Main {
	public static void main(String[] args) {
		Bank b1 = new Sbi();
		System.out.println("intrest of sbi+" + b1.intrest() + "%");
		Bank b2 = new Pnb();
		System.out.println("intrest of pnb+" + b2.intrest() + "%");
	}

}
