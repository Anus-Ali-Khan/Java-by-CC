
public class StringClass {

	public static void main(String[] args) {
		
		String x = "hello cats"; //object (instance of a class)
		//  (\n is used for new line)
		
	//	System.out.println(x.charAt(0));
	//	System.out.println(x);
		
		//Concatenation
		System.out.println(x + " and dogs"); // 1st Method
		x += " and puppies"; // 2nd Method
		System.out.println(x);
		
		// 3rd Method
		String name = "Caleb";
		System.out.println(String.format("hello %s", name));
		
		System.out.println(name.length());
		
		

	}

}

// String are always called as String (as an object)

// single quotes are for char
