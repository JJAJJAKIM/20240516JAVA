package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스를 이용하여 반복문를 멈추기
 *********************************/

public class Test3 {

	public static void main(String[] args) {
		
		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		
		while(true) {
//			int a = sc.nextInt();
//			System.out.println(a);
			String key = sc.nextLine();
			if("STOP".equals(key)) break;
		}
		
		
		
		
		/** 객체 제거 **/
		sc.close();
		

	}

}
