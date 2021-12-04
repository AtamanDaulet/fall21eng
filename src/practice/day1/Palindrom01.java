package practice.day1;

public class Palindrom01 {

	public static void main(String[] args) {
		String name = "Dake";
		//String name = "Ana";
		palindrom(name);
		System.out.println("-----------");
		isPalindrom(name);
	}

	private static void palindrom(String name) {
		String rev = "";
		for (int i = name.length()-1; i >= 0; i--) {			
			rev = rev + name.charAt(i);
		}		
		System.out.println("Is palindrom: "+name.equalsIgnoreCase(rev));		
	}

	private static void isPalindrom(String name) {
		StringBuilder rev = new StringBuilder(name).reverse();
			
		System.out.println("Is palindrom: "+name.equalsIgnoreCase(rev.toString()));		
	}
	
	
}
