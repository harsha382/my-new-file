package constructorchaining;

import com.constructor.Main;

public class ConstructorChaining {

	ConstructorChaining() {
	
		System.out.println("this is default constructor");
	}

	ConstructorChaining(String Harsha) {
	
		System.out.println("this is parameterized constructor");

	}

	public static void main(String[] args) {
		ConstructorChaining c1 = new ConstructorChaining();
	}

	{

	}
}