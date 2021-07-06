package LoopExample;

public class Right_Pattern {

	public static void main(String[] args) {

		//int n = 7;

		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
