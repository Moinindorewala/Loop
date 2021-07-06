package LoopExample;

import java.util.Scanner;

public class Fibbonacci {
	static int N;
	
	 public  static void Fibonacci()
	    {
	        int num1 = 0, num2 = 1;
	  
	        int counter = 0;
	  
	        // Iterate till counter is N
	        while (counter < N) {
	  
	            // Print the number
	            System.out.print(num1 + " ");
	  
	            // Swap
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	            counter = counter + 1;
	        }
	    }
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the N Number ");
		
		N= s.nextInt();
		
		Fibbonacci f = new Fibbonacci();
		f.Fibonacci();
		System.out.println(N);
	
		
	
	}

}
