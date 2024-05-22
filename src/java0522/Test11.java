package java0522;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean key = false;
		
		String[][] arr1 = new String[7][7];
		String[][] arr2 = new String[11][7];
		String[][] arr3 = new String[9][5];
		String[][] arr4 = new String[7][7];
		
//////////////////////////////////////////////////////////////////////////// 제어
		
	    for(int i = 0; i < arr1.length; i++) {
	    	for(int j = 0; j < arr1[i].length; j++) {
	    		if((i == 0 || i == 6) && j == 3) {
					arr1[i][j] = "★";	    				    			
	    		} else if ((i == 1 || i == 5) && (j >= 2 && j <= 4)) {
					arr1[i][j] = "★";
	    		} else if ((i == 2 || i == 4) && (j >= 1 && j <= 5)) {
					arr1[i][j] = "★";
	    		} else if (i == 3) {
					arr1[i][j] = "★";
	    		} else {
	    			arr1[i][j] = " ";
	    		}
	    	}
	    }
		
	    for(int i = 0; i < arr2.length; i++) {
	    	for(int j = 0; j< arr2[i].length; j++) {
	    		if(i<6 && j <= i) {
	    			arr2[i][j] = "★";
	    		} else if(i >=6 && j< (arr2.length-i) ) {
	    			arr2[i][j] = "★";
	    		} else {
	    			arr2[i][j] = " ";
	    		}
	    	}
	    }	
	    
	    for(int i = 0; i < arr3.length; i++) {
	    	for(int j = 0; j< arr3[i].length; j++) {
	    		if(i<5 && j<(arr3[i].length-i)) {
	    				arr3[i][j] = "★"; 				    				
	    		} else if(i == 5 && j <= 1){
	    			arr3[i][j] = "★";		
	    		} else if(i == 6 && j <= 2){
	    			arr3[i][j] = "★";
	    		} else if(i == 7 && j <= 3){
	    			arr3[i][j] = "★";
	    		} else if(i == 8 && j <= 4){
	    			arr3[i][j] = "★";
	    		} else {
	    			arr3[i][j] = " ";
	    		}
	    			
	    	}
	    }
	    
	    for(int i = 0; i < arr4.length; i++) {
	    	for(int j = 0; j < arr4[i].length; j++) {
	    		if(i==0 && (j>3 && j<5)) {
	    			arr4[i][j] = "★";
	    		} else if(i == 1 && (j>2 && j<6)){
	    			arr4[i][j] = "★";
	    		} else if(i == 2 && (j>1 && j<7)){
	    			arr4[i][j] = "★";	
	    		} else if(i == 3 && (j>0 && j<8)){
	    			arr4[i][j] = "★";	    
	    		} else if(i == 4) {
	    			arr4[i][j] = "★";	    			
	    		} else {
	    			arr4[i][j] = " ";
	    		}
	    	}
	    }
	    
/////////////////////////////////////////////////////////////////////////////
		
		while(true) {
			
			System.out.println("1~4까지 정수의 값을 입력하세요.");
			int a = scan.nextInt();
			
			String[][] arr = new String[1][1];
			
			if(a == 1) {
				arr = arr1;
			} else if ( a == 2){
				arr = arr2;
			} else if ( a == 3){
				arr = arr3;
			} else if ( a == 4){
				arr = arr4;
			}
			
			
			// 입력 받은 값에 따라 종료 또는 출력
			switch (a) {
				case 1 :
				case 2 : 
				case 3 :
				case 4 : 
					// 출력 부분
					for(int i = 0; i < arr.length; i++) {	    	
						for(int j = 0; j < arr[i].length; j++) {	    		
							System.out.print(arr[i][j]);
						}   	
						System.out.println();
					}
					break;
				
				default :
					System.out.println("잘못된 값입니다.");
					key = true;
			}
			if (key) break;			
			
		}
		
//		if(a == 0) {
//			System.out.println("0을 입력하셨습니다.");
//		}
//		if(a == 1) {
//			System.out.println("1을 입력하셨습니다.");
//		}
//		if(a == 2) {
//			System.out.println("2을 입력하셨습니다.");
//		}
//		if(a == 3) {
//			System.out.println("3을 입력하셨습니다.");
//		}
//		if(a == 4) {
//			System.out.println("4을 입력하셨습니다.");
//		}

		
//		String[][] arr = new String[][];

		
		
	}

}
