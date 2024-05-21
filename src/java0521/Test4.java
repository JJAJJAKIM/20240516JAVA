package java0521;

public class Test4 {

	public static void main(String[] args) {
		
		// 문제2) 배열 크기가 10인데 값은
		
		
		int[] arr = new int[10];
		int j = 9;
		for(int i = 0; i< arr.length; i++) {
			arr[i] = j;
			j--;
//			System.out.println(arr[i]);
		}
		

		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = (arr[i]-9) ;
			System.out.println(arr[i]);
	
		}
	}

}
