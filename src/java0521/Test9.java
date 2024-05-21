package java0521;

public class Test9 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제7) [5행 5열] 2차원 배열을 이용하여
		 *  파스칼삼각형을 출력하는 프로그램 만들기
		 *  첫번째 행, 첫번째 열은 1로 시작으로 
		 *  두번째 행 부터 "바로 위 값"과 "바로위 왼쪽의 값"을 더한 값으로 출력 하세요.
		 * 출력 예시)        ┌───────────────────────처리 방법 예시───────────────────────┐
		 * 1				첫번째 열은 1로 시작
		 * 1, 1				1번 열은 (0,0)값, 2번 열은 (0,0)값
		 * 1, 2, 1			1번 열은 (1,0)값, 2번 열은 (1,1) + (1,0) 합값, 3번 열은 (1,1)값
		 * 1, 3, 3, 1
		 * 1, 4, 6, 4, 1
		 ************************************************/
		
		int[][] arr = new int[5][5];
		int k = 1;
		
		for(int i=1; i<= arr.length; i++) {
			for(int j=1; j <= arr[i].length; j++) {
				if (j-1 == 0) {
					arr[i][j]= 1;
				} else if(i-1==j-1 ) {
					arr[i][j]= 1;
				} else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		
		}
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
		}System.out.println();
	}

}
