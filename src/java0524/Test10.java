package java0524;

import java.util.Scanner;

public class Test10 {

	
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean key = true;
		
		while(key) {
			
			int a = sc.nextInt();
			
			if(a > 8 && a%2==1) {
				new Test10_1(a);
				key = false;
				break;
			} else {
				System.out.println("입력된 값은 8보다 큰 홀수 여야합니다.");
			}
		}
	
		sc.close();

	}
	

}
