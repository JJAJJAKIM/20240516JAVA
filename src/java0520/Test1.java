package java0520;

/*****************************
>> 반복문
for     :   for ( 변수 ; 조건식 ; 증감식) {}
*****************************/


public class Test1 {

	public static void main (String[] args) {

		int tot = 0;
		
		for ( int i = 1 ; i <= 10 ; i++ ) {
			System.out.println("전 : "+ i);
			tot += i;
			System.out.println("후 : "+ i);
		}
		System.out.println("반복문의 합 : " + tot);
	}
}
