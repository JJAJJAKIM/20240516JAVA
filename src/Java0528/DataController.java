package Java0528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class DataController {
	
	private String 드라이버;
	private String 주소;
	private String 사용자;
	private String 비밀번호;
	
	private String table = "CREATE OR REPLACE TABLE userlist ("
							+ "no int, "
							+ "name varchar(50), "
							+ "sex varchar(50), "
							+ "etc varchar(50), "
							+ "dept varchar(50), "
							+ "position varchar(50)"
							+ ")";
	
	String insertQ = "INSERT INTO userlist values (?,?,?,?,?,?)"; // PrepareStatement를 사용하면 
	String selectQ = "SELECT * FROM userlist";					  // 파라미터 부분에 ?를 사용하여 처리할수 있다.
	String updateQ = "UPDATE userlist SET position = ? WHERE no = ?";
	String deleteQ = "DELETE FROM userlist where no = ?";
	
	public DataController(String 드라이버, String 주소, String 사용자, String 비밀번호 ) {
		this.드라이버 = 드라이버;
		this.주소 = 주소;
		this.사용자 = 사용자;
		this.비밀번호 = 비밀번호;
		시작();
	}
	

	private void 시작() {
		try {
			Class.forName(드라이버); // 존재 여부만 확인. JDK 6 이후 부터는 굳이 로드하지 않아도 된다.
			Connection conn = DriverManager.getConnection(주소,사용자,비밀번호);
			control(conn); // 기능제어 부분
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();			
		}
	}
	
	private void control(Connection conn) {
		if(create(table, conn)) {
//			if(true) {

			// DML >> CRUD 영역
			// 1단계 데이터 넣기 (insert)
			List<DataDTO> list = datainput();		
			for(int i = 0; i < list.size(); i++) {
//				cud(insertQ, conn, (DataDTO)list.get(i), "I" ); // (DataDTO)list.get(i)는 list.get()으로 가져오는 데이터를 (DataDTO)로 형변환 시킨 것이다.				
				cud(insertQ, conn, list.get(i), "I" ); // 위에서 이미 List<DataDTO> list로 list 타입을 DataDTO로 형변환을 했기때문에 list.get()에서 다시 형변환을 해줄필요가 없다.
			}
			
//			System.out.println(list);

			// 2단계 데이터 읽기 (select)			
			select(selectQ, conn);
		
			// 3단계 데이터 수정 (update)
			DataDTO data = new DataDTO();
			data.setNo(10);
			data.setPosition("광대");
			cud(updateQ, conn, data, "U");
			select(selectQ, conn); // 데이터 수정 후 확인
			
			// 4단계 데이터 삭제 (delete)
			data = new DataDTO();
			data.setNo(1);
			cud(deleteQ, conn, data, "D");
			select(selectQ, conn);// 데이터 삭제 후 확인
			
		} else {
			System.out.println("테이블 생성 실패");
		}
	}
	
	private List datainput() {
		List<DataDTO> list = new ArrayList<DataDTO>();
		DataDTO data = new DataDTO();
		data.setNo(1);
		data.setName("몽키 D 루피");
		data.setSex("남자");
		data.setEtc("고무고무 열매");
		data.setDept("밀짚 모자");
		data.setPosition("선장");
		list.add(data);

		data = new DataDTO(); //참조자료형 구조이기떄문에 new로 주소값을 새로 설정하여 각각의 값의 주소가 입력되게 한다.
		data.setNo(2);
		data.setName("롤로노아 조로");
		data.setSex("남자");
		data.setEtc("삼도류");
		data.setDept("밀짚 모자");
		data.setPosition("부선장");
		list.add(data);
		
		data = new DataDTO();
		data.setNo(3);
		data.setName("상디");
		data.setSex("남자");
		data.setEtc("요리사");
		data.setDept("밀짚 모자");
		data.setPosition("요리사");
		list.add(data);
		
		data = new DataDTO();
		data.setNo(4);
		data.setName("나미");
		data.setSex("여자");
		data.setEtc("항해사");
		data.setDept("밀짚 모자");
		data.setPosition("항해사");
		list.add(data);
		
		data = new DataDTO();
		data.setNo(5);
		data.setName("우솝");
		data.setSex("남자");
		data.setEtc("사격");
		data.setDept("밀짚 모자");
		data.setPosition("저격수");
		list.add(data);
		
		data = new DataDTO();
		data.setNo(6);
		data.setName("토니토니 쵸파");
		data.setSex("미정");
		data.setEtc("사람사람 열매");
		data.setDept("밀짚 모자");
		data.setPosition("의사");
		list.add(data);
		
		data = new DataDTO();
		data.setNo(7);
		data.setName("니코 로빈");
		data.setSex("여자");
		data.setEtc("꽃꽃 열매");
		data.setDept("밀짚 모자");
		data.setPosition("고고학자");
		list.add(data);
		
		data = new DataDTO();
		data.setNo(8);
		data.setName("프랑키");
		data.setSex("남자");
		data.setEtc("사이보그");
		data.setDept("밀짚 모자");
		data.setPosition("조선공");
		list.add(data);
		
		data = new DataDTO();
		data.setNo(9);
		data.setName("브록");
		data.setSex("남자");
		data.setEtc("연주자");
		data.setDept("밀짚 모자");
		data.setPosition("선원");
		list.add(data);
		
		data = new DataDTO();
		data.setNo(10);
		data.setName("버기");
		data.setSex("남자");
		data.setEtc("동강동강 열매");
		data.setDept("버기");
		data.setPosition("선장");
		list.add(data);
		
		return list;
	}
	
	private boolean create(String sql, Connection conn) {
//		System.out.println(sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
			return true; // << 성공!
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false; // << 실패
	}
	
	private void select(String sql, Connection conn) {
		//System.out.println(sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(); // SELECT문 사용시 executeQuery를 통해 결과값을 리턴받을수 있다.
			System.out.println(rs);
			while(rs.next()) {
				DataDTO data = new DataDTO();
				data.setNo(rs.getInt("no"));
				data.setName(rs.getString("name"));
				data.setSex(rs.getString("sex"));
				data.setEtc(rs.getString("etc"));
				data.setDept(rs.getString("dept"));
				data.setPosition(rs.getString("position"));
				System.out.println(data);	
			
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void cud(String sql, Connection conn, DataDTO data, String type) {
//		System.out.println(sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			if("I".equals(type)) {
				ps.setInt(1, data.getNo());
				ps.setString(2, data.getName());
				ps.setString(3, data.getSex());
				ps.setString(4, data.getEtc());
				ps.setString(5, data.getDept());
				ps.setString(6, data.getPosition());
				
			} else if ("U".equals(type)) {
				ps.setString(1, data.getPosition());
				ps.setInt(2, data.getNo());
			} else if ("D".equals(type)) {
				ps.setInt(1, data.getNo());				
			}
			
			int result = ps.executeUpdate();
			System.out.println(result);
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
