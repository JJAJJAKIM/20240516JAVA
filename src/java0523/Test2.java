package java0523;

import java.util.Scanner;

/*********************************
 * >> Console 입력 알아보기
 * Scanner 클래스를 이용하여 간단한 연산하기
 *********************************/

public class Test2 {

	public static void main(String[] args) {
		
		/** 객체 생성 **/
		Scanner sc = new Scanner(System.in);
		
		/** 객체 사용 **/
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a + b);
		
		
		/** 객체 제거 **/
		sc.close();

	}

}
