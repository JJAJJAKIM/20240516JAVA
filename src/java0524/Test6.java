package java0524;

public class Test6 {

	public static void main(String[] args) {
		
		new Test6_1().함수();
		//new Test6_2().함수(); 
		Test6_2.함수(); // 다른 클래스에 있는 함수 또는 변수에 static이 있다면 객체를 사용하지 않고 바로 호출가능하다.
		System.out.println(Test6_2.a);
	}

}
