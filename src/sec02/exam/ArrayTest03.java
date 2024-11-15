package sec02.exam;

public class ArrayTest03 {
	public static void main(String[] args) {
		int a = 10;
		int b;
		b = a ;
		
		int[] intArr1 = { 10,20,30 };
		int[] intArr2 = new int[5];
		
		intArr2 = intArr1 ;
		
		for ( int i=0;i<intArr2.length;i++) {
			System.out.println(intArr2[i]);
		}

		System.out.println(intArr1[0]==intArr2[0]);
		System.out.println(intArr1[1]==intArr2[1]);
		System.out.println(intArr1[2]==intArr2[2]);

		String[] strArr1 = { "korea","Japan","china" };
		String[] strArr2 = new String[5];
		
		strArr2 = strArr1 ;
		
		for ( int i=0;i<strArr2.length;i++) {
			System.out.println(strArr2[i]);
		}

		System.out.println(strArr1[0]==strArr2[0]);
		System.out.println(strArr1[1]==strArr2[1]);
		System.out.println(strArr1[2]==strArr2[2]);
		System.out.println(strArr1==strArr2);

			
		strArr2[3] = "korea";
		
	}
}
