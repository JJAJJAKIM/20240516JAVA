package Java0527;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Test01_1 {
	
	public void 접속(){
		System.out.println("접속 시작!");
		String 드라이버 = "org.mariadb.jdbc.Driver";
		try {
			Class.forName(드라이버);
			System.out.println("드라이버 클래스가 존재합니다.");
			
			//데이터베이스 접속
			// jdbc > 데이터베이스 타입 > 호스트(IP) > 포트 > 데이터베이스명
			String 주소 = "jdbc:mariadb://localhost:3306/edu";
			String 사용자 = "root";
			String 비밀번호 = "root";
			DriverManager.getConnection(주소, 사용자, 비밀번호);
			System.out.println("섹션 생성 완료!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}
}
