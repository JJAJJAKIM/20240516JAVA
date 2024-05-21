package java0521;

public class Test1 {

	public static void main(String[] args) {
		
		//문제 1 for문과 while문 두개를 다 사용하여 구구단
		
//		int i = 1;
//		while(i<10) {
//			for(int j = 1; j < 10; j++ ) {
//				System.out.println(i+" * "+j+" = "+(i*j)+"\t");
//			}
//			i++;
//			System.out.println();
//		}
		
		for(int i = 1; i < 10; i++) {
			
			int j = 1;
			while (j<10) {
				System.out.println(i+" * "+j+" = "+(i*j)+"\t");
				j++;
			}
			System.out.println();
		}

	}

}
