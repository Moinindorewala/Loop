package LoopExample;

import java.util.Scanner;

public class Armstrong {
	static int num;
	static int cube = 0;
	static int r, t;

	public static void isArmstrong() {

		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);

		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number for Check: ");
		num = s.nextInt();
		isArmstrong();

		if (t == cube) {
			System.out.println("Entered Number is an Armstrong: " +t );

		} else {
			System.out.println("Entered Number is not an Armstrong: " +t);
		}

	}

}
