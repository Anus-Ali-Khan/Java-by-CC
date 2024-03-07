import java.util.Scanner;

public class StringComparisionAndInterning {

	public static void main(String[] args) {
		
		//Logic for password
		String password = "let me in";
		System.out.println("Guess the password: ");
		
		//input
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		System.out.println(password.equals(guess)); // equals compares the content of string
		
		System.out.println(password ==  guess);  // it compares memory location
		//primitive - this works
		//objects - this does not works
		//value of objects is a reference to the object
		
		
		// For Objects (String is not a primitive)
		// String.intern()
		// String a = "hi";
		// String	b = "hi";	
		// System.out.println(a == b); // true // this returns true because compiler has applied command String.intern() to save the string in same location and memory
		
		// if we convert it into objects than (a==b) will return false
		String a = new String("hi");
		String b = new String("hi");
		System.out.println(a == b); // false
		
		// For primitives
		int x = 10;
		int y= 10;
		System.out.println(x == y); // true because primitives  are different than objects
		
	}

}
