package arrays;

public class ArrayCreation {

	static void min(int arr[]) {

		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (min > arr[i])
				min = arr[i];
		System.out.println(min);

	}

	public static void main(String[] args) {

		int arc[] = new int[5];
		arc[0] = 23;
		arc[1] = 34;
		arc[2] = 92;
		arc[3] = 89;
		arc[4] = 52;
		min(arc);

	}

}
