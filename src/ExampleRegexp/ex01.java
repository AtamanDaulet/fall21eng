package ExampleRegexp;

public class ex01 {

	public static void main(String[] args) {
		String str1 = "Java is easy. Type codes to learn Java. To earn money learn Java.";
		
		str1 = str1.replaceAll("\\p{Punct}", "");  
		//This class matches punctuation marks. i.e.!#$%&'()*+,-./:;<=>?@[\]^_`{|}~
		
		System.out.println(str1);

		//***************************************
		
		String str2 = "Java is easy. Type codes to learn java. To earn money learn java.";
		
		str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		System.out.println(str2);
	}

}
