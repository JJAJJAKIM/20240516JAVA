package java0522;

public class Test8 {

	public static void main(String[] args) {
		
		/***********************************************
		 * 문제8) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
	     * ★
	     * ★★
	     * ★★★
	     * ★★★★
	     * ★★★★★
	     * ★★★★
	     * ★★★
	     * ★★
	     * ★
		 ************************************************/

		// 해결 코드 작성 시작

	    String star = "★";
	
	    /*** 코드 시작 ***/
	    String[][] arr = new String[11][7];
	    int k = (arr.length/2)+1; // 배열 행의 중간값 추출
	    //System.out.println(arr.length/2);
	    
	    for(int i = 0; i < arr.length; i++) {
	    	for(int j = 0; j< arr[i].length; j++) {
	    		if(i<k && j <= i) {
	    			arr[i][j] = star;
	    		} else if(i >=k && j< (arr.length-i) ) {
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
