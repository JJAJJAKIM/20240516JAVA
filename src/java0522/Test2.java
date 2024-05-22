package java0522;

public class Test2 {

	public static void main(String[] args) {
		/***********************************************
		 * 문제2) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
     * ★
     * ★★
     * ★★★
     * ★★★★
     * ★★★★★
		 ************************************************/

		// 해결 코드 작성 시작

    String sta = "★";

    /*** 코드 시작 ***/
    
 
    String[][] arr = new String[5][5];
  
    for(int i = 0; i < arr.length; i++) {
    	for(int j = 0; j < arr[i].length; j++) {
    		if(i >= j) {
    			arr[i][j] = sta;
    		} else {
    			arr[i][j] = " ";
    		}
    	}
    		
    }
     
    
    // 배열에 값 출력
    for(int i = 0; i < arr.length; i++) {
    	
    	for(int j = 0; j < arr[i].length; j++) {
    		
    		System.out.print(arr[i][j]);
    	}   	
    	System.out.println();
    }

    /*** 코드 종료 ***/

	}

}
