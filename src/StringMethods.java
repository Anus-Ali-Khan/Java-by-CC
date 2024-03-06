
public class StringMethods {

	public static void main(String[] args) {
		String x = "yummmm...my oh my chicken pot pie";
		System.out.println(x.charAt(x.length() - 1));
		String fullAd = x.concat(" Now with 20% more chicken");
		System.out.println(fullAd);
		System.out.println(fullAd.contains("chicken"));
		System.out.println(fullAd.indexOf("my",3));
		System.out.println(fullAd.indexOf("my", fullAd.indexOf("my") + 1));
		System.out.println(fullAd.lastIndexOf("my"));
	}

}
