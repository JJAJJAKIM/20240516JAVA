package java0524;

public class Test9_1 {
	
	Test9_1(int a, int b) {
		dan(a,b);
	}

	private void dan(int a, int b) {
		
		for(; a <= b; a++ ) {
			System.out.println(a + " 단");
			calc(a);
		}
	}
	
	private void calc(int a) {
		for(int i = 1; i <=9; i++) {
			System.out.println(a + " * " + i +" = " + (a*i));
		}
		
	}
		
}
