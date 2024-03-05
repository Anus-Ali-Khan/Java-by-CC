
public class PrimitiveTypes {

	public static void main(String[] args) {
		
		boolean isPizzaDelicious = true;
		byte b = 'C'; //8bits
		char c = 'Z';
		short s = -32768;
		int i = 4343434;
		long l =50L;
		
		float f = 20.5f; //32bits		
		double d = 20.5; // 64bits
		
		float ff = 20.5f;
		double dd = 205f; // larger values can store smaller ones
		
		float x = (float)(dd / s); // Type Casting - explicitly converting larger value in smaller can result in data loss.
		
		

	}

}

// boolean, byte, char, short, int, long, float and double
