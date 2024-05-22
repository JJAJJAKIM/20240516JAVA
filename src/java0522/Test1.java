package java0522;

public class Test1 {

	public static void main(String[] args) {
		/***********************************************
		 * 문제1) 2차원 배열를 이용하여 별(★)를 출력하시오
		 * 출력 예시)
     * ★★★★★
     * ★★★★
     * ★★★
     * ★★
     * ★
		 ************************************************/

		// 해결 코드 작성 시작

    String str = "★";

    /*** 코드 시작 ***/
//    배열을 사용하지 않은 단순 반복문    
//    for (int i = 0; i < 5; i++) {
//    	 String res = "";
//    	 
//    	 if(i== 0) {
//    		 res = str + str + str + str + str;
//    	 } else if(i == 1) {
//    		 res = str + str + str + str;
//    	 } else if(i == 2) {
//    		 res = str + str + str;
//    	 } else if(i == 3) {
//    		 res = str + str;
//    	 } else {
//    		 res = str;
//    	 }
//    	 
//    	 System.out.println(res);
//    }

/************************************************************/
    // 배열에 별 넣기
    String[][] arr = new String[5][5];
    for(int i = 0; i < arr.length; i++) {
    	
    	for(int j = 0; j < arr[i].length; j++) {
    		// 빈공간
    		if(j < arr[i].length-i) {
    			arr[i][j] = str;   			    				
//    		} else if (i == 1 &&( j < arr[i].length-1)) {
//    			arr[i][j] = str;
//    		} else if (i == 2 &&( j < arr[i].length-2)) {
//    			arr[i][j] = str;
//    		} else if (i == 3 &&( j < arr[i].length-3)) {
//    			arr[i][j] = str;
//    		} else if (i == 4 &&( j < arr[i].length-4)) {
//    			arr[i][j] = str;
    		} else {
    			arr[i][j] = " ";
    		}
    	}   	
    	
    }
    
    // 배열에 값 출력
    for(int i = 0; i < arr.length; i++) {
    	
    	for(int j = 0; j < arr[i].length; j++) {
//    		if(i == 1 && j == 4) {
//    			continue;    				
//    		} else if (i == 2 &&( j == 4 || j == 3)) {
//    			continue;
//    		} else if (i == 3 &&( j == 4 || j == 3 || j == 2)) {
//    			continue;
//    		} else if (i == 4 &&( j == 4 || j == 3 || j == 2 || j == 1)) {
//    			continue;
//    		} 
    		
    		System.out.print(arr[i][j]);
    	}   	
    	System.out.println();
    }

    /*** 코드 종료 ***/

	}

}
