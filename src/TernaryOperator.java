
public class TernaryOperator {

	public static void main(String[] args) {
		
		String name = "claree";
		
		// boolean welcome = name.equals("clare") ? true : false;
		
//		boolean welcome;
//		if(name.equals("clare"))
//		{
//			welcome = true;
//					
//		}else {
//			welcome = false;
//			}
		
		// Single line if statement
		
				boolean welcome = false;
				
				if(name.toLowerCase().equals("clare")) welcome = true;
						System.out.println("Welcome Clare"); // This statement is not executed b/c single line if- statement executes only one condition
				System.out.println(welcome);
	}

}
