package sec02.exam;

public class ArrayTest02 {
	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		
		scores[0][2] = 100;
		
		
		int[][] scroes2 = new int[2][];
		scroes2[0] = new int[3];
		scroes2[1] = new int[4];
		
		for(int i=0; i<scroes2.length;i++) {
			for (int k=0; k<scroes2[i].length;k++) {
				System.out.println("scroes2["+i+"]["+k+"]="+scroes2[i][k]);
			}
		}		
		
		// 배열 객체 참조 
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);	//true
		System.out.println(strArray[0] == strArray[2]);	// false
		
		strArray[1] = "Python";
		
		System.out.println(strArray[0] == strArray[1]);	//false
		
			
		
		
		
	}
}
