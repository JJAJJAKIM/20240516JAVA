package java0520;

/******************************
 * >> 반복문
 * while : while() {} 
 * do while : do {} while();
 * ****************************/

public class Test3 {

	public static void main(String[] args) {
		
		int a = 4;
		int s = 0;
		while(s < a) {
//			System.out.print(s + "\t");
//			System.out.print(a + "\t");
//			System.out.println(s >= a);
//			if(s >= a) break; // 검사 횟수
//			System.out.println("반복문");
			s++;
		}
		
		do {
			System.out.println("반복문");
			
		} while(a < s);

	}

}
