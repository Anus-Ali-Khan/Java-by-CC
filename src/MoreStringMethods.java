import java.util.Scanner;

public class MoreStringMethods {

	public static void main(String[] args) {
	String fullAd = "   yummmm...MY OH MY chicken pot pie.Now with 20% more chkn    ";
	System.out.println(fullAd.toLowerCase());
	System.out.println(fullAd.toUpperCase());
	System.out.println(fullAd.strip()); //trim extra spaces at the beginning and end
	System.out.println(fullAd.substring(9,17));
	System.out.println(fullAd.repeat(300)); // repeat string 300 times
	System.out.println(fullAd.equals("my")); // returns true or false if specified string does not match
	
	//Logic for password
	String password = "let me in";
	System.out.println("Guess the password: ");
	
	//input
	Scanner scanner = new Scanner(System.in);
	String guess = scanner.nextLine();
	System.out.println(password.equals(guess));
	}

}
