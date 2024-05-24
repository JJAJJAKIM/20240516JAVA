package java0524;

public class Test2 {
	
	static int b = 0;

	public static void main(String[] args) {
		
		a();

	}
	
	static void a() { // a()메소드 안에 a()를 호출하므로 자기자신을 계속 호출. 반복문처럼 동작한다.
					 // 조건문으로 제한을 걸어 반복문처럼 쓸수 있음.
		if(b < 5) {
			System.out.println("안녕" + b);
			b++;
			a();
			
		}
		
	}
	
	
}
