package Java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Test01_1 {
	
	String 드라이버 = "org.mariadb.jdbc.Driver";  //중요
	String 주소 = "jdbc:mariadb://localhost:3306/edu";
	String 사용자 = "root";
	String 비밀번호 = "root";

	public void 접속(){ 
		System.out.println("접속 시작!");		
		try {
			Class.forName(드라이버);  //중요
			//데이터베이스 접속
			// jdbc > 데이터베이스 타입 > 호스트(IP) > 포트 > 데이터베이스명
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);  //중요
			
			// CREATE문 시작
			String sql1 = "CREATE OR REPLACE TABLE test (no INT, name VARCHAR(50),sex varchar(20)"; // DDL(테이블 생성)
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.execute();
			// CREATE문 끝
			
			
			// INSERT문 시작
			String sql2 = "INSERT INTO test (no, name) VALUES (1, '홍길동')";
			
			ps = conn.prepareStatement(sql2);
			int result = ps.executeUpdate();
			System.out.println(result);
			// INTSERT문 끝
			
			// SELECT문 시작
			String sql3 = "SELECT * FROM test" ;
			ps = conn.prepareStatement(sql3);
			ResultSet res2 = ps.executeQuery(); // SELECT문 사용시 executeQuery를 통해 결과값을 리턴받을수 있다.
				
			while(res2.next()) {
				int no = res2.getInt("no");
				String name = res2.getString("name");
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
				
			}
			// SELECT문 끝
			
			// UPDATE문 시작
			String sql4 = "UPDATE 테이블명 SET 컬럼명 = '바꿀데이터값'";
			ps = conn.prepareStatement(sql4);
			int res4 = ps.executeUpdate();
			System.out.println(res4);
			// UPDATE문 끝
			
			// SELECT문 시작(UPDATE된 내용 확인을 위함)
			ps = conn.prepareStatement(sql3);
			res2 = ps.executeQuery(); // SELECT문 사용시 executeQuery를 통해 결과값을 리턴받을수 있다.
			
			while(res2.next()) {
				int no = res2.getInt("no");
				String name = res2.getString("name");
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
			}
			// SELECT문 끝(UPDATE된 내용 확인을 위함)
			
			// DELETE문 시작
			String sql5 = "DELETE FROM test";
			ps = conn.prepareStatement(sql5);
			int res5 = ps.executeUpdate();
			System.out.println(res5);
			// DELETE문 끝
			
			// SELECT문 시작(DELETE문 확인을 위함)
			ps = conn.prepareStatement(sql3);
			res2 = ps.executeQuery(); // SELECT문 사용시 executeQuery를 통해 결과값을 리턴받을수 있다.
			int cnt = 0;
			while(res2.next()) {
				int no = res2.getInt("no");
				String name = res2.getString("name");
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
				cnt++;
			}
			
			System.out.println("행수 : " + cnt );
			// SELECT문 끝(DELETE문 확인을 위함)
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
