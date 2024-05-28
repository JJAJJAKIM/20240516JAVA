package Java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test2_1 {
	
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
			String sql0 = "CREATE OR REPLACE TABLE user (no INT, name VARCHAR(50),sex VARCHAR(50), etc VARCHAR(50), dept VARCHAR(50), position VARCHAR(50))"; // DDL(테이블 생성)
			PreparedStatement ps = conn.prepareStatement(sql0);
			ps.execute();
			// CREATE문 끝
			
			
			// INSERT문 시작
			String sql1 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (1, '몽키 D 루피','남자' , '고무고무 열매', '밀짚모자', '선장')";
			String sql2 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (2, '롤로노아 조로', '남자', '삼도류', '밀짚모자', '부선장')";
			String sql3 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (3, '상디', '남자', '요리사', '밀짚모자', '요리사')";
			String sql4 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (4, '나미', '여자', '항해사', '밀짚모자', '항해사')";
			String sql5 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (5, '우솝', '남자', '사격', '밀짚모자', '저격수')";
			String sql6 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (6, '토니토니 쵸파', '미정', '사람사람 열매', '밀짚모자', '의사')";
			String sql7 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (7, '니코 로빈', '여자', '꽃꽃 열매', '밀짚모자', '고고학자')";
			String sql8 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (8, '프랑키', '남자', '사이보그', '밀짚모자', '조선공')";
			String sql9 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (9, '브록', '남자', '연주자', '밀짚모자', '선원')";
			String sql10 = "INSERT INTO user (no, name, sex, etc, dept, position) VALUES (10, '버기', '남자', '동강동강 열매', '버기', '선장')";
			
			String[] arr = new String[10];
			arr[0] = sql1;
			arr[1] = sql2;
			arr[2] = sql3;
			arr[3] = sql4;
			arr[4] = sql5;
			arr[5] = sql6;
			arr[6] = sql7;
			arr[7] = sql8;
			arr[8] = sql9;
			arr[9] = sql10;
			
			int result = 0;
			for(int i= 0; i<arr.length; i++) {
				
				ps = conn.prepareStatement(arr[i]);
				result = ps.executeUpdate();
				System.out.println(result +"행이 입력 되었습니다.");
				
			}

			// INTSERT문 끝
			
			// SELECT문 시작(전체)
			String sql12 = "SELECT * FROM user";
			ps = conn.prepareStatement(sql12);
			ResultSet res2 = ps.executeQuery(); // SELECT문 사용시 executeQuery를 통해 결과값을 리턴받을수 있다.
				
			while(res2.next()) {
				int no = res2.getInt("no");
				String name = res2.getString("name");
				String sex = res2.getString("sex");
				String etc = res2.getString("etc");
				String dept = res2.getString("dept");
				String position = res2.getString("position");
				Test2DTO testDto = new Test2DTO();
				testDto.setNo(no);
				testDto.setName(name);
				testDto.setSex(sex);
				testDto.setEtc(etc);
				testDto.setDept(dept);
				testDto.setPosition(position);
				System.out.println(testDto);
				
			}
			// SELECT문 끝
			
			// SELECT문 시작(밀짚모자 해적단만 select)
			String sql13 = "SELECT * FROM user WHERE dept = '밀짚모자'";
			ps = conn.prepareStatement(sql13);
			ResultSet res3 = ps.executeQuery(); // SELECT문 사용시 executeQuery를 통해 결과값을 리턴받을수 있다.
			System.out.println("[[WHERE절이 추가된 SELECT문]]");
			
			while(res3.next()) {
				int no = res3.getInt("no");
				String name = res3.getString("name");
				String sex = res3.getString("sex");
				String etc = res3.getString("etc");
				String dept = res3.getString("dept");
				String position = res3.getString("position");
				Test2DTO testDto = new Test2DTO();
				testDto.setNo(no);
				testDto.setName(name);
				testDto.setSex(sex);
				testDto.setEtc(etc);
				testDto.setDept(dept);
				testDto.setPosition(position);
				System.out.println(testDto);
				
			}
			// SELECT문 끝
			
			// UPDATE문 시작
			String sql14 = "UPDATE user SET position = '광대' where no = 10";
			ps = conn.prepareStatement(sql14);
			result = ps.executeUpdate();
			System.out.println(result+ "개 행이 수정되었습니다.");
			// UPDATE문 끝
			
			// SELECT문 시작(UPDATE된 내용 확인을 위함)
			String sql15 = "SELECT * FROM user WHERE dept = '버기'";
			ps = conn.prepareStatement(sql15);
			ResultSet res5 = ps.executeQuery();

			System.out.println("[[UPDATE문 이후 SELECT문]]");
			while(res5.next()) {
				int no = res5.getInt("no");
				String name = res5.getString("name");
				String sex = res5.getString("sex");
				String etc = res5.getString("etc");
				String dept = res5.getString("dept");
				String position = res5.getString("position");
				Test2DTO testDto = new Test2DTO();
				testDto.setNo(no);
				testDto.setName(name);
				testDto.setSex(sex);
				testDto.setEtc(etc);
				testDto.setDept(dept);
				testDto.setPosition(position);
				System.out.println(testDto);
			}
			// SELECT문 끝(UPDATE된 내용 확인을 위함)
			
			// DELETE문 시작
			String sql16 = "DELETE FROM user WHERE no = 10 ";
			ps = conn.prepareStatement(sql16);
			result = ps.executeUpdate();
			System.out.println(result);
			// DELETE문 끝
			
			// SELECT문 시작(DELETE문 확인을 위함)
			ps = conn.prepareStatement(sql12);
			res2 = ps.executeQuery(); // SELECT문 사용시 executeQuery를 통해 결과값을 리턴받을수 있다.
			int cnt = 0 ;	
			System.out.println("[[DELETE문 이후 삭제된 데이터 확인용 SELETE문]]");
			while(res2.next()) {
				int no = res2.getInt("no");
				String name = res2.getString("name");
				String sex = res2.getString("sex");
				String etc = res2.getString("etc");
				String dept = res2.getString("dept");
				String position = res2.getString("position");
				Test2DTO testDto = new Test2DTO();
				testDto.setNo(no);
				testDto.setName(name);
				testDto.setSex(sex);
				testDto.setEtc(etc);
				testDto.setDept(dept);
				testDto.setPosition(position);
				System.out.println(testDto);
				
				
			}
			System.out.println(cnt);
			// SELECT문 끝(DELETE문 확인을 위함)
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
	