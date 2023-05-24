
// example on how to run mutple method in java

package javaBasics_sql;

import java.util.Scanner;

public class methodExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter 2 numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		show(number1, number2);
		
		int a = add (number1, number2);
		int b = min(number1, number2);
		
		System.out.println("Sum of numbers: "+ a);
		System.out.println("Min of numbers: "+ b);
	}
	
	public static void show(int num1, int num2) {
		System.out.printf("you enterd : %d and %d\n", num1, num2);
	}
	//sum
	public static int add(int num1, int num2) {
		int sum =0;
		sum = num1 + num2;
		return sum;
	}
	//min.
	public static int min (int num1, int num2) {
		int min;
		if(num1 > num2) 
			min = num2;
		else 
			min = num1;
		return min;
		
	}
}
