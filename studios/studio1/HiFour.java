package studio1;

import cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Enter name 1");
		String s1 = ap.nextString("Enter name 2");
		String s2 = ap.nextString("Enter name 3");
		String s3 = ap.nextString("Enter name 4");
		//
		// Say hello to the names in s0 through s3.
		//

		System.out.println("Hello " + s0 + ", " + s1 + ", " + s2 + ", and " + s3);
		
	}
}