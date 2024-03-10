
public class breakinloops {

	public static void main(String[] args) {
		
		for(int i = 9; i >= 0; i--) {
			for(int k = i; k >= 0; k--) {
				if(k == 6) {
					break; // it breaks the loop and take us outside it
				}
				
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
