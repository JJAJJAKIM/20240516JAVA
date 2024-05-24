package java0524;

public class Test5_1 {
	
	private int a;
	
	Test5_1(){ // 반환값이 없기때문에 클래스다.
//		System.out.println("2222222");
	}
	
	Test5_1(int a){ // 반환값이 없기때문에 클래스다.
//		System.out.println(a);
		this.a = a;
	}
	
	int b() {
		
		System.out.println(this.a);
		return this.a;
	}
}
