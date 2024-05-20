package java0520;

public class Test2 {

	public static void main(String[] args) {
		
		// 구구단
		// 단 * 증가값 = 결과값
		
		// 문제1) 짝수 단수만 출력
		
		//	 if ((i%2)== 1) continue; continue 사용 시 
		//	 if ((i%2)== 0) {}
		
		// 문제2) 한줄에 단수를 3개 출력
		
		// 문제2 내가 푼 방식 
		
//		  for (int i = 1 ; i <=9 ; i+=4) { //단을 위한 반복분
//		  		for (int j = 1; j <= 9 ; j++) { // 증가값을 위한 반복문 
//		  			for(int k = 0; k < 4 ; k++ ) {
//		  				if (i+k <10) {
//		  					System.out.print((i+k) +"*"+ j +"="+((i+k)*j)+"\t");
//		  				}
//		 			}
//		  			System.out.println();
//		 		}
//		 	System.out.println();
//		 }
		
		// 문제2 강사님 방식 		
		/*
		 * for (int i = 1; i <= 9 ; i+=3) { for (int j= 1 ; j <= 9 ; j++) {
		 * 
		 * System.out.print(i + "*" + j +" = "+ (i*j)+"\t");
		 * 
		 * int a = i + 1; int b = a + 1; System.out.print(a + "*" + j +" = "+
		 * (a*j)+"\t"); System.out.println(b + "*" + j +" = "+ (b*j)); }
		 * System.out.println(); }
		 */
		
		// 문제3) 증가된 단수를 제어하세요.
		 int step = 3;
		 for (int i = 1; i <= 9 ; i+=step) {
			
			 for (int j= 1 ; j <= 9 ; j++) {
				
				for(int k = i ; k < (i+step) ; k++  ) {
					
					System.out.print(k + " * " + j +" = "+ (k*j)+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		    
	}

}
