import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {

		System.out.println("What's your name?");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
//		switch(name) { //put variable in parenthesis on which you want to apply
//		case "Anus":
//			System.out.println("Welcome my man"); //code here
//			break;
//		case "Clare":
//			System.out.println("Go away");
//			break;
//		default:
//			System.out.println("Try again later");
//			break;
//		
//	}
		
		if(name.equals("Anus")) {
			System.out.println("Welcome my man");
		}else if(name.equals("Clare")) {
			System.out.println("Go away");
		}else {
			System.out.println("Try again later");
		}

}
}