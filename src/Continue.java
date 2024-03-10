
public class Continue {

	public static void main(String[] args) {
		
		//continue skips loop only through the provided condition
		
		for(int i = 9; i >= 0; i--) {
			for(int k = i; k >= 0; k--) {
				if(k==5) {
					continue; // loops skip only for 5 
				}
				
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
