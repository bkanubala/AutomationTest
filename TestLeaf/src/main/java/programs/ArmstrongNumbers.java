package programs;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int i;
	 for(i=100; i<=1000; i++)
	 {
		 int a = i;
		 int b=0;
		 int c=0;
		while (a>0) {
			c = a % 10;
			b=b+(c*c*c);
			a=a/10;
		}
		 
		 	 
		 if(i==b)
		 {
		 			 System.out.println(i + " is armstrong number");
		
		 }

		 
	 }
		
	}
}
	

