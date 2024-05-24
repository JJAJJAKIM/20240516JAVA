package java0524;

public class Test1 {

	public static void main(String[] args) {
		//static은 자바 실행될때 메모리를 바로 할당한다 따라서 main메소드는 무조건 static이다.
		//static이 아니라면 해당 메소드가 실행될때 메모리가 할당된다.
		
		int res = add(2, 1);
		System.out.println("덧셈 : " + res);
		
		res = sub(2, 1);
		System.out.println("뺄셈 : " + res);
		
		res = div(2, 1);
		System.out.println("나눗셈 : " + res);
		
		res = mul(2, 1);
		System.out.println("곱셈 : " + res);
		
		

	}
	// main 메소드 밖에 두 숫자를 더하여 합계를 반환하는 sum이라는 메소드 생성
	private static int add(int a, int b) {
		return (a+b);
	}
	
	static int sub(int a, int b) {
		return (a-b);	
	}
	
	static int div(int a, int b) {
		return (a/b);
	}
	
	static int mul(int a, int b ) {
		return (a*b);
	}
	
}
