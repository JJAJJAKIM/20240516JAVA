package java0522;

public class Test6 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제6) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     *     ★
	     *    ★★★
	     *   ★★★★★
	     *  ★★★★★★★
	     * ★★★★★★★★★
		 ************************************************/

		// 해결 코드 작성 시작

	    String star = "★";
		
	    /*** 코드 시작 ***/
	    String[][] arr = new String[5][9];
	    for(int i = 0; i < arr.length; i++) {
	    	for(int j = 0; j < arr[i].length; j++) {
	    		if(i==0 && (j>3 && j<5)) {
	    			arr[i][j] = star;
	    		} else if(i == 1 && (j>2 && j<6)){
	    			arr[i][j] = star;
	    		} else if(i == 2 && (j>1 && j<7)){
	    			arr[i][j] = star;	
	    		} else if(i == 3 && (j>0 && j<8)){
	    			arr[i][j] = star;	    
	    		} else if(i == 4) {
	    			arr[i][j] = star;	    			
	    		} else {
	    			arr[i][j] = " ";
	    		}
	    	}
	    }
	
	    /*** 코드 시작 ***/
	
	
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
