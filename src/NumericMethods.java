 
public class NumericMethods {

	public static void main(String[] args) {
		// Integer.max(x,y) //Static Method
		
		// Integer myInt = 5;
		//myInt.max(x,y)    // instance Method
		
		int x = 10;
		int y =20;
		System.out.println(Integer.max(x,y));
		System.out.println(Integer.compare(x,y));
		
		String money = "300";
		
		// both convert it into integer but value of creates object and parseInt create variable.
		Integer a = Integer.valueOf(money);
		System.out.println(a);
		int b = Integer.parseInt(money);
		

	}

}
