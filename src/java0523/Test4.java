package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스를 이용하여 설문조사 하기
 *********************************/
public class Test4 {

	public static void main(String[] args) {
		
		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
			
		// 질문지 필요 , 반복으로 물을 꺼냐
		String[][] arr = new String[10][2];
		
		arr[0][0] = "당신은 남성입니까? 여성입니까?";
		arr[1][0] = "당신의 이름은 무엇입니까?";
		arr[2][0] = "당신이 나이는 몇살입니까?";
		arr[3][0] = "거주하는 지역은 어디입니까?";
		arr[4][0] = "당신의 직업은 무엇입니까?";
		arr[5][0] = "집에 가고 싶습니까?";
		arr[6][0] = "점심은 뭐 먹습니까?";
		arr[7][0] = "정신 안 차릴 껍니까?";
		arr[8][0] = "뭐 할말 없읍니까?";
		arr[9][0] = "Okay Bye.";
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0]);
			String ans = sc.nextLine();
		    arr[i][1] = ans;
			
		}
		
		System.out.println("설문조사가 끝났습니다.");
		System.out.println("설문조사 결과는 다음과 같습니다.");
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
				
			}
		}
		
		
		/** 객체 제거 **/
		sc.close();
		
		

	}

}
