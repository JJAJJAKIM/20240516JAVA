package java0521;

public class Test3 {

	public static void main(String[] args) {
		
		// 1차원 배열 (행) [행, 세로]
		// 0
		// 1
		// 2
		
		int[] arr1 = new int[10];  // 둘다 똑같은 배열이다. 하지만 통일감을 가지고 코드작성을 하는게 좋다.
//		int arr2[];
		
		int a = arr1.length;     // length는 new로 배열을 생성할때 자동으로 만들어지는 상수이다.
		System.out.println(a);
		
		arr1[0] = 100; // arr1은 위에서 10의 크기를 줬기때문에 인덱스는 0~9까지 존재한다. 
		System.out.println(arr1[0]);
		
		// 2차원 배열 [행, 세로][열, 가로]
		// [행0, 열0], [행0, 열1], [행0, 열2]
		// [행1, 열0], [행1, 열1], [행1, 열2]
		// [행2, 열0], [행2, 열1], [행2, 열2]
		// [행3, 열0], [행3, 열1], [행3, 열2]
		
		
		int[][] arr2 = new int[5][3];
		// {0,0}, {0,1}, {0,2}
		// {1,0}, {1,1}, {1,2}
		// {2,0}, {2,1}, {2,2}
		
		int b = arr2.length;	  // 세로 크기	
		int c = arr2[0].length;   // 가로 크기
		
		arr2[1][1] = 5;
		/****
		 * 0, 0, 0
		 * 0, 5, 0
		 * 0, 0, 0
		 * *****/
		
		System.out.println(arr2[1][1]);
		
		
	}

}
