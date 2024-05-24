package java0524;



public class Test5 { //클래스는 다른 클래스에서도 호출할 일이 많기 때문에 기본적으로 public으로 생성한다.

	public static void main(String[] args) {
		
//		new Test5_1(); // <-- 실행 또는 호출. new를 붙였기 떄문에 생성자이다.
		Test5_1 t51 = new Test5_1(5); // 생성자는 main 클래스가 없는 코드를 가져다가 쓰고싶을때 사용하는 것이다.
//		t51은 Test5_1의 인스턴스 이다.
		t51.b(); // 객체는 . 을 사용하여 안에 있는 걸 사용할수 있다.
		
		
	}
	
}
