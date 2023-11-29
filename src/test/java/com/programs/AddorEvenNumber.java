package com.programs;

import java.util.Scanner;

public class AddorEvenNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int number=sc.nextInt();
		
		if(number%2==1) {
			
			System.out.println("Odd number");
		}else {
			
			System.out.println("Even number");
		}
		
		
		
	}

}