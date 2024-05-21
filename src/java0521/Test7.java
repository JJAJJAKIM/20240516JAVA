package java0521;

public class Test7 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제5) [4행 4열] 정수형 2차원 배열을 생성 후
		 *  인덱스 순서대로 16 ~ 1의 값을 넣고 출력 하시오.
		 * 출력 예시)
		 * 16, 15, 14, 13
		 * 12, 11, 10,  9
		 *  8,  7,  6,  5
		 *  4,  3,  2,  1
		 ************************************************/
		int k = 16;
		int[][] arr = new int[4][4];
		for(int i= 0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				arr[i][j] = k;
				k--;
				System.out.println(arr[i][j]);
			}
			
		}
		
		
		
		
	}

}
