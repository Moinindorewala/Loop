package LoopExample;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String original, reverse = "";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		 original = s.nextLine();
		int lenght = original.length();
		
		for (int i = lenght-1; i>=0; i-- )
			
			reverse=reverse+original.charAt(i);
		
		if(original.equals(reverse))
		{
			System.out.println("Number is palindrom");
		}
		else {
			System.out.println("number is not palindrom");
		}
		
		
		
	}

}
