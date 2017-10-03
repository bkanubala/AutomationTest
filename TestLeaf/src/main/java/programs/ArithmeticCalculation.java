package programs;

import java.util.Scanner;

public class ArithmeticCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner calc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = calc.nextInt();
		
		System.out.println("Enter the value of b");
		int b = calc.nextInt();
		
		System.out.println("Please enter the operation to be performed Add/Subtract/Multiply/Divide");
		String value = calc.next();
		int calculation = 0;

		switch(value)
		{
		case "Add": 
			calculation = a+b;
			System.out.println("Addition of " + a +" and " + b + " is "+ calculation);
			break;
		case "Subtract": 
			calculation = a-b;
			System.out.println("Addition of " + a +" and " + b + " is "+ calculation);
			break;
		case "Multiply": 
			calculation = a*b;
			System.out.println("Addition of " + a +" and " + b + " is "+ calculation);
			break;
		case "Divide": 
			calculation = a/b;
			System.out.println("D of " + a +" and " + b + " is "+ calculation);
			break;
			default:
				System.out.println("Please enter a valid input");
		}
		
		}
		
	}


