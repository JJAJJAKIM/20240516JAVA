package java0524;

public class Test7_2 extends Test7_1{ //자식 클래스
	
	void 호출() {
		함수();
	}

	void 함수() { 
		// 추상메소드는 아니었지만 자식클래스에서 동일한 메소드명을 사용하면
		// 메소드는 재구성되며 오버라이드된다.
		System.out.println("t72");
	}
	
	@Override //부모클래스에 있는 추상 메소드를 재구성.
	void 함수2() {
		//
	}
	
	void 함수2(int a) { //오버 로드시킨 메소드.
		
	}
	
}
