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
		
//		String[][] arr = new String[10][10];
//		
//		for(int i = 0; i<arr.length; i++){
//			for(int j = 0; j<arr[i].length ; j++) {
//				if(i>=j) {
//					arr[i][j] = "O";
//				} else {
//					arr[i][j] = "X";
//				}
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		String[][] arr = new String[9][17];
		int k = 0 ; 
		for(int i =0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(j%2==0) {
					if((j-k)==(2*i)-k) {
						arr[i][j] = "X";
					} else {
						arr[i][j] = "0";
					}
				} else {
					arr[i][j] = " ";
				}
				System.out.print(arr[i][j]);
			}
			k++;
			System.out.println();
			}
		System.out.println("-----------------------------------");
		
		String[][] arr2 = new String[9][17];
		for(int i =0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				if(j%2==0) {
					if(i==7) {
						arr2[i][j] = " ";
					} else {
						arr2[i][j] = "O";						
					}
				} else {
					arr2[i][j] = " ";
				}
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
	}
}
