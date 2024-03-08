import java.util.Scanner;

public class ComparisionAndLogicalOperators {

	public static void main(String[] args) {
		
		System.out.println("How old are you?");
		
		Scanner scanner = new Scanner(System.in);
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Cats or Dogs?");
		String animal = scanner.nextLine();
		
		if(age > 12 && animal.equals("cats"))
		{
			System.out.println("Welcome!");
		}else {
			System.out.println("You are not allowed");
		}

	}

}

/* Comparison operators
 * == equality
 * != inequality
 * < less than
 * > greater than
 * <= less than equal to
 * >= greater than equal to	
 */

/* Logical Operators
 * && and (both have to be true)
 * || or (either can be true... or both)
 * !  not (inverse the boolean) 
 */



