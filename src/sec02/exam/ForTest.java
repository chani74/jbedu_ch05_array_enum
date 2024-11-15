package sec02.exam;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] str = {10,20,30,40,50};
			
		for ( int i=0 ; i<str.length;i++) {
			System.out.println(str[i]);						
		}
		
		for (int score : str ) {
			System.out.println(score);
		}
	}

}
