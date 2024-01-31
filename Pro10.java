import java.util.*;
import java.io.*;

public class Pro10 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		PrintWriter outfile = new PrintWriter("output.txt");
		
		String fname, lname;
		int age;
		
		//Program asks how many names are to be entered
		System.out.print("How many names to be entered? ");
		int num = scan.nextInt();
		System.out.println();
		
		//Loop goes for however many names were requested
		for(int i = 0; i < num; i++) {
			
			//User enters info
			System.out.print("Enter Name and Age: ");
			fname = scan.next();
			lname = scan.next();
			age = scan.nextInt();
								
			//Info is printed to external file
			outfile.println((i + 1) + "  " + fname + "  " + lname + "  " + age);
			
		}
		
		outfile.close();
		
		
	}

}
