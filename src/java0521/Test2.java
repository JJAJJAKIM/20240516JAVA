package java0521;

public class Test2 {

	public static void main(String[] args) {
		
		// 문제1) 인덱스와 값을 곲하여 다시 배열에 넣기
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		/***********************************************
		 * 문제1) 인덱스와 값을 곱하여 다시 배열에 값넣기
		 * 출력 예시)
		 * 인덱스		초기값	곱셈할값		배열에들어갈 값
		 * 0		0		9			(0 * 9) = 0
		 * 1		1		8			(1 * 8) = 8
		 * 2		2		7			(2 * 7) = 14
		 * 3		3		6			(3 * 6) = 18
		 * 4		4		5			(4 * 5) = 20
		 * 5		5		4			(5 * 4) = 20
		 * 6		6		3			(6 * 3) = 18
		 * 7		7		2			(7 * 2) = 14
		 * 8		8		1			(8 * 1) = 8
		 * 9		9		0			(9 * 0) = 0
		 ************************************************/
		
		int j = (arr.length-1);
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i]*j);
			System.out.println(arr[i]);
			j--;
		}
		

	}

}
