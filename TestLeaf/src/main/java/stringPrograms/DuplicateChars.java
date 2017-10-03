package stringPrograms;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DuplicateChars {
	 public static void main(String args[])throws IOException
	    {
	        Scanner br = new Scanner(System.in);
	        System.out.print("Enter any word : ");
	        String s = br.nextLine();
	        int l = s.length();
	        char ch;
	        String ans="";
	         
	        for(int i=0; i<l; i++)
	        {
	        	//store the value at ch
	            ch = s.charAt(i);
	            if(ch!=' ')
	                ans = ans + ch;
	            //After saving the current character replacing it with space. All Characters(current) in the sentence will be replaced with space
	            s = s.replace(ch,' '); 
	        }
	 
	       System.out.println("Word after removing duplicate characters : " + ans);
	    }
}