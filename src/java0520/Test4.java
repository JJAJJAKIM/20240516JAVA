package java0520;

public class Test4 {

	public static void main(String[] args) {
		
//		int[] arr = new int[3];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		
//		for(int i =0; i< arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 문제1) 인덱스 마지막에 10의 값을 넣고 마지막 인덱스만 출력하시오.
//		int a = 5;
		int[] arr = new int[8];
		
//		System.out.println(arr.length);
		arr[arr.length-1] = 10;
		System.out.println(arr[arr.length-1]);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
				
		
	}

}
