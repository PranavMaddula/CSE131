package exercises4;

import sedgewick.StdIn;

/**
 * An example of how to use Sedgewick's API to read in two
 *   doubles, as used in the video
 * @author roncytron
 *
 */
public class ReadTwoDouble {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your values:");
		double d1 = StdIn.readDouble();
		double d2 = StdIn.readDouble();
		
		double sum = d1 + d2;
		System.out.println("Sum is " + sum);
		
	}

}
