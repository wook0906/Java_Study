package ch04;

public class Triangle {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (4 - i > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < i)
					System.out.print(" ");
				else
					System.out.print("*");

			}
			System.out.print("\n");
		}
	}
}
