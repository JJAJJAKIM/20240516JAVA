package java0524;

public class Test10_1 {
		
	Test10_1(int a) {
		star(a);
	}
	
	
	private void star(int a){
		
		/*** 코드 시작 ***/
		String star = "★";
		String[][] arr = new String[a][a-4];
		
		 int k = (arr.length/2)+1;
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
		 for(int i = 0; i < arr.length; i++) {	    	
		    	for(int j = 0; j < arr[i].length; j++) {	    		
		    		System.out.print(arr[i][j]);
		    	}   	
		    	System.out.println();
		  }
	}
	

	
}
