
public class NestedBlocks {

	public static void main(String[] args) {
		boolean additionalLogging = false; 
		
		for(int i=9; i>=0; i--) {
			System.out.println(i);
			
			if(i == 5) {
				if(additionalLogging) {
					System.out.println("We found 5");
				}
			
			}
		}

	}

}
