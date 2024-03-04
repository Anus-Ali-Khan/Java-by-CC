
public class PrimitivesAndObjects {

	public static void main(String[] args) {
		
		
		String string = new String("This is a string"); // it is an object 
		String easier = "Wow, that was easy" + string; // it is also an object
		
		int x = 5; //primitive type
		Integer y = 5; //object (5 is autoboxed) 
		
		System.out.println(x);
		System.out.println(y);
		
	}

}

//data type = the type of the data. How the computer interprets the data.
// 1) Primitive Types 
// 2) Objects - instance of a class (class is the data type) 

//statically typed = variables are given data types up front
//dynamically typed = variables do not have types 