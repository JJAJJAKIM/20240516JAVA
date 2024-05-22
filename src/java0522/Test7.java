package java0522;

public class Test7 {

	public static void main(String[] args) {
		
		
		/***********************************************
		 * 문제7) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     * ★★★★★
	     * ★★★★
	     * ★★★
	     * ★★
	     * ★
	     * ★★
	     * ★★★
	     * ★★★★
	     * ★★★★★
		 ************************************************/

		// 해결 코드 작성 시작

	    String star = "★";
	
	    /*** 코드 시작 ***/
	    String[][] arr = new String[9][5];
	    
	    for(int i = 0; i < arr.length; i++) {
	    	for(int j = 0; j< arr[i].length; j++) {
	    		if(i<5 && j<(arr[i].length-i)) {
	    				arr[i][j] = star; 				    				
	    		} else if(i == 5 && j <= 1){
	    			arr[i][j] = star;		
	    		} else if(i == 6 && j <= 2){
	    			arr[i][j] = star;
	    		} else if(i == 7 && j <= 3){
	    			arr[i][j] = star;
	    		} else if(i == 8 && j <= 4){
	    			arr[i][j] = star;
	    		} else {
	    			arr[i][j] = " ";
	    		}
	    			
	    	}
	    }
	    
	    // 출력 부분
	    for(int i = 0; i < arr.length; i++) {
	    	
	    	for(int j = 0; j < arr[i].length; j++) {
	    		
	    		System.out.print(arr[i][j]);
	    	}   	
	    	System.out.println();
	    }
	    /*** 코드 종료 ***/
		

	}

}
