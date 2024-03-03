import java.util.Scanner;

public class DynamicInputProgram {

		public static void main(String[] args) {
			System.out.println("What is your name?");
			
			//Syntax to create object
			//type identifier(variable name) = new type();
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine() ;
			
			System.out.println("hello " + name);

		}
	}

	// comment
	// class - Contains everything - and has members
	// methods - do something 
	// arguments - What you pass to a method to be print (part of the calling)
	// parameters - Variables to store arguments (part of definition)
	// statements -  Telling the computer something
	// properties - store something

	// access modifier (public) - Who can use ? 
	// static - No instance of class is needed
	// object - instance of class