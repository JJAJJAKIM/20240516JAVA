package java0520;

public class Test5 {

	public static void main(String[] args) {
		
//		int[][] arr = new int[4][6]; 
//		
//		arr[0][1] = 10;
//		arr[2][2] = 20;
//		arr[3][3] = 30;
//		
//		System.out.println(arr.length);
//		System.out.println(arr[2].length);
//		
//		for(int i=0; i<arr.length ;i++) {
//			for(int j=0; j<arr[i].length; j++) {
//			System.out.print(arr[i][j] + "\t");
//			}
//		System.out.println();
//		}
		
		String[][] arr = new String[10][10];
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length ; j++) {
				if(i>=j) {
					arr[i][j] = "O";
				} else {
					arr[i][j] = "X";
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}