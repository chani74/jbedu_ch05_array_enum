package sec02.exam;

public class ArrayTest01 {
	public static void main(String[] args) {
		
		// 1. 선언과 동시에 초기화
		int[] intArray = {70,65,80,100,98};
		int a = 10;
		
		int b;
		b= 100;
		
		// 변수 선언/정의 방법들
		
		int[] arr1;
//		arr1 = {10,20,30} ; // 에러 남
		
		
		int[] arr2 = null; // null로 초기화
		// System.out.println(arr2[0]); //java.lang.NullPointerException:
		
		//2. 선언시에 메모리 할당 및 초기화
		int[] arr3 = new int[5]; // 메모리만 4바이트 * 5칸 20byte 확보!!
		System.out.println(arr3[0]);	// 메모리 공간 확보시 0으로 초기화
		for (int i=0;i<5;i++) {
			System.out.println(arr3[i]);	
		}
		
		arr3[0] = 50 ; //배열 생성 후, 특정 인덱스 값으로 정수값 저장
		
		double[] doubleArray = {1.5,2.1,3.7,4.1};
		
		String[] names = {"kor","jpn","chn","k"};
		
		char[] chars = {'a','b','c','d'};
		
		String[] str1 = new String[5];
		System.out.println(str1[2]);

		
		
	}
}
