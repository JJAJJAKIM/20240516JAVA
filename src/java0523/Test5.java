package java0523;

import java.util.Scanner;
/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스와 반복문를 이용하여 계산기 만들기
 *********************************/


public class Test5 {

	public static void main(String[] args) {
		
		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		int res = 0;
		boolean key = true;
		/** 객체 사용 **/
		
		
		while(key) {
			
			System.out.println("첫번쨰 숫자를 입력하세요.");
			int a = sc.nextInt();
			
			System.out.println("연산자를 입력하세요. ex) +, -, /, *" );
			String b = sc.next();
			
			System.out.println("두번째 숫자를 입력하세요.");
			int c = sc.nextInt();
			
			switch(b) {
			case "+" :
				res = a + c;
//				key = false;
				System.out.println("결과값은 : " +res );	
				break;
			case "-" :
				res = a - c;
//				key = false;
				System.out.println("결과값은 : " +res );	
				break;
			case "/" :
				res = a/c;
//				key = false;
				System.out.println("결과값은 : " +res );	
				break;
			case "*" :
				res = a*c;
//				key = false;
				System.out.println("결과값은 : " +res );	
				break;
			default :
				System.out.println("연산기호가 잘못됐습니다. 처움부터 다시 실행하세요.");
				key = false;
				break;
			}
//			System.out.println("결과값은 : " +res );			
			
		}
		
		
		
		/** 객체 제거 **/
		sc.close();
		

	}

}
