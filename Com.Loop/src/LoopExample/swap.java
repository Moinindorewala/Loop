package LoopExample;

import java.util.Scanner;

public class swap {


	
	public static void main(String[] args) {
		
		int x,y,z;
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter number a");
		 x = s.nextInt();
		System.out.println("enter number b");
		 y= s.nextInt(); 
		System.out.println("beofre swapping: " +x+ " " +y );

		 z=x;
		 x=y;
		 y=z;	 
		 
		 System.out.println("after swapping: " +x+ " "+y);
		
		
	}
}
