package java0524;

public class Test4 {
	
	static int a = 0;
	static int c = 0;
	
	public static void main(String[] args) { // 지역변수명과 전역변수명이 같을때는 지역변수가 우선이다.
			
		System.out.println(a);
		int c = b();
		System.out.println(c); 

	}
	
	static int b() { // 지역변수를 다른 메소드에서 사용하려면 리턴값으로 처리한다.
		int c = 5;
//		this.c = c;
		System.out.println(a);
		return c;
		
	}
}
