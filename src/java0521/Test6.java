package java0521;

public class Test6 {

	public static void main(String[] args) {
	
		/***********************************************
		 * 문제4) [4행 4열] 정수형 2차원 배열을 생성 후
		 *  인덱스 순서대로 1 ~ 16의 값을 넣고 출력 하시오.
		 * 출력 예시)
		 *  1,  2,  3,  4
		 *  5,  6,  7,  8
		 *  9, 10, 11, 12
		 * 13, 14, 15, 16
		 ************************************************/
		
		// 해결 코드 작성 시작
		int k = 1;
		int[][] arr = new int[4][4];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k;
				System.out.print(arr[i][j]+",\t");
				k++;
			}
			System.out.println();
			
		}
		
		
	}

}
