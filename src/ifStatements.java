import java.util.Scanner;

public class ifStatements {

	public static void main(String[] args) {
	
		//Logic for password
				String password = "let me in";
				System.out.println("Guess the password: ");
				
				//input
				Scanner scanner = new Scanner(System.in);
				String guess = scanner.nextLine();
		
				
				//if statement
				if(password.toLowerCase().equals(guess.toLowerCase())) 
				{
					System.out.println("Your guess was correct!");
					// return; // this will end program here if above statement is true otherwise go to next line
					
				} else if ("don't stop believing".toLowerCase().equals(guess.toLowerCase()))
				{
					System.out.println("You got second password");	
					
				} else 
				{
					System.out.println("This is false! ");
				}
			

	}

}
