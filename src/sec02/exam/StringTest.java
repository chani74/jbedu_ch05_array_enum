package sec02.exam;

public class StringTest {
	public static void main(String[] args) {
		String str = "Korea";
		
		System.out.println(str.charAt(0));
		
		for ( int i =0 ; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}

	
		char[] chararr = str.toCharArray();
		for ( int i =0 ; i<chararr.length ;i++) {
			System.out.println(chararr[i]);
		}	
	}	
}
