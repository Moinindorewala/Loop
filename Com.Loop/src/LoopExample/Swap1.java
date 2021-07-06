package LoopExample;

import java.util.Scanner;

public class Swap1 {
	
	public static void main(String[] args) {
		int a,b;
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("enter the number a");
		a = s.nextInt();
		System.out.println("enter the number a");
		b = s.nextInt();
		
		System.out.println("Before Swapping: " +a+"  "+b );
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Before Swapping: " +a+"  "+b );
		
	}

}
