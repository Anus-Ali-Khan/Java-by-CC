
public class VariableDeclarationAndInitialization {
	
	public static final double PI = 3.14159; // final is used with constant values which cannot be reassigned. 
	private int x = 10;

	public static void main(String[] args) { //method
		int x;
		x = 5; // initialization
		x = 10;  // Since x is a variable so we can reassign it.
		
		double t = PI;
		
		Double y = VariableDeclarationAndInitialization.PI; // Since PI is public static so we can call it in any class by this method

		System.out.println(y);
	}

}

//variable creation
//1.declare
//2.initialize
