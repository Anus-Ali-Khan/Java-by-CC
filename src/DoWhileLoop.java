import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		// difference between do-while and while is that do-while must run at least one time and avoid duplication of items
		
		String password = "let me in";
		Scanner scanner = new Scanner(System.in);
		String guess;
		
		do {
			System.out.println("Guess the password:");
			guess = scanner.nextLine();
		}while(!guess.equals(password));
		
		System.out.println("congrats");
		scanner.close();

	}

}
