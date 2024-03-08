import java.util.Scanner;

public class LoopsIntro_whileloop {

	public static void main(String[] args) {
	/*icu
	 * 
	 * initialization
	 * condition
	 * update
	 * 
	 */
		
		
//		// while loop snippet
//		int i = 1; //initialization
//		
//		while (i < 11) //condition: below code will run till this condition becomes false
//		{
//			System.out.println("iteration " + i); //code 
//			i++;
//		}
		
		//Sample example
		System.out.println("Guess the password:");
		String password = "let me in";
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		while(!guess.equals(password))
		{
			System.out.println("Guess the password:");
			guess = scanner.nextLine();
		}
		
		System.out.println("congrats");
		scanner.close();
	}

}
