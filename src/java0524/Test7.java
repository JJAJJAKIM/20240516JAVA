package java0524;

public  class Test7 { //extends는 Test7_1 클래스를 상속받겠다는 뜻이다. Test7_1은 Test7의 부모 클래스이다.

	public static void main(String[] args) {
		
		Test7_2 t72 = new Test7_2();
		// Static을 많이 쓰면 쓸수록 메모리 리소스가 크게 늘어난다.
		// 따라서 main메소드에 상속을 많이 받으면 프로그램이 느려진다. (상속받아 함수 호출시 static이 필요하기때문에)
		
		t72.함수();
	}

}
