package Java0529;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AppController {
	
	private Scanner scan;
	private String name;
	private DBConnection db;
	private String sql;
	
	public AppController() {
		this.scan = new Scanner(System.in);
		this.db = new DBConnection();
	}

	/****************************************************************/
	// 1단계 테이블 생성하기
	private void 테이블생성(Connection conn) {
		sql = "CREATE OR REPLACE TABLE userlist ("
				+ "no int"
				+ ", name varchar(50)"
				+ ", sex varchar(50)"
				+ ", etc varchar(50)"
				+ ", dept varchar(50)"
				+ ", position varchar(50)"
				+ ")"; // DDL 추가
		System.out.println("테이블 생성 SQL문 확인 : " + sql);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.		
		db.테이블생성(conn, sql);
	}
	
	// 2단계 생성된 테이블에 데이터 입력하기
	private void 입력하기(Connection conn) {
		sql = "INSERT INTO userlist values (?,?,?,?,?,?)"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		boolean key1 = true;
		String check = "";
		int convInt = 0;
		while(key1) {
			System.out.println("번호 값은?(숫자만 입력하세요)");
			 check = scan.nextLine(); 
			 if(!"".equals(check)) {
				 if(check.chars().allMatch(Character::isDigit)) {			
					 System.out.println("숫자 맞읍니다.");
					 convInt = Integer.valueOf(check);
					 key1 = false;
				 } else {
					System.out.println("숫자가 아님다");	
				 }
			} else {
				System.out.println("값을 다시 입력하세요.");
			}
		}				
		data.setNo(convInt);			
		System.out.println("이름은?");
		data.setName(scan.nextLine());
		System.out.println("성별은?");
		data.setSex(scan.nextLine());
		System.out.println("특기는?");
		data.setEtc(scan.nextLine());
		System.out.println("소속은?");
		data.setDept(scan.nextLine());
		System.out.println("역할은 ?");
		data.setPosition(scan.nextLine());
		System.out.println("입력 끝 ");

		
		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터입력하기(conn, sql, data);
	}
	
	// 3단계 생성된 데이터 가져오기 >> 목록 출력 시 화면출력() 메소드를 사용하시오.
	private void 가져오기(Connection conn) {
		sql = "SELECT * FROM userlist ORDER BY no"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		화면출력(db.데이터가져오기(conn, sql));
	}
	
	// 4단계 생성된 데이터 수정하기
	private void 수정하기(Connection conn) {
		sql = "UPDATE userlist SET " 
				+ " name = ?"
				+ ", sex = ?"
				+ ", etc = ?"
				+ ", dept = ?"
				+ ", position = ?"
				+ "where no = ?"; // DML 추가"
						
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		boolean key1 = true;
		String check = "";
		int convInt = 0;
		while(key1) {
			System.out.println("바꾸려고 하는 데이터의 번호는?");
			check = scan.nextLine(); 
			if(!"".equals(check)) {
				if(check.chars().allMatch(Character::isDigit)) {			
					System.out.println("숫자 맞읍니다.");
					convInt = Integer.valueOf(check);
					key1 = false;
				} else {
					System.out.println("숫자가 아님다.");	
				}
			} else {
				System.out.println("값을 다시 입력하세요.");
			}
		}	
		
		data.setNo(convInt);
		System.out.println("바뀐 이름은?");
		data.setName(scan.nextLine());
		System.out.println("바뀐 성별은?");
		data.setSex(scan.nextLine());
		System.out.println("바뀐 특기는?");
		data.setEtc(scan.nextLine());
		System.out.println("바뀐 소속은?");
		data.setDept(scan.nextLine());
		System.out.println("바뀐 역할은?");
		data.setPosition(scan.nextLine());
		System.out.println("입력 끝 ");

		
		
		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터수정하기(conn, sql, data);
	}
	
	// 5단계 생성된 데이터 삭제하기
	private void 삭제하기(Connection conn) {
		sql = "DELETE FROM userlist WHERE no = ?"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();

		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/

		boolean key1 = true;
		String check = "";
		int convInt = 0;
		while(key1) {
			System.out.println("삭제하려고 하는 번호 값은?");
			check = scan.nextLine(); 
			if(!"".equals(check)) {
				if(check.chars().allMatch(Character::isDigit)) {			
					System.out.println("숫자 맞읍니다.");
					convInt = Integer.valueOf(check);
					key1 = false;
				} else {
					System.out.println("숫자가 아님다");	
				}
			} else {
				System.out.println("값을 다시 입력하세요.");
			}
		}				
		data.setNo(convInt);	
		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터삭제하기(conn, sql, data);
	}
	/****************************************************************/
	
	private void 사용자() {
		System.out.println("당신은 누구인가요?");
		this.name = scan.nextLine();
		System.out.println(this.name + "님 환영합니다.");
	}
	
	private void 종료() {
		System.out.println(this.name + "님 다음에 또 찾아주세요.");
		scan.close();
	}
	
	private void 화면출력(List<DbTable> list) {
		for(int i = 0; i < list.size(); i++) {
			DbTable data = list.get(i);
			System.out.println(data);
		}
	}
	
	private boolean 디비접속() {
		boolean result = false;
		boolean key = true;
		System.out.println("데이터베이스에 연결하시겠습니까?(Y/N)");
		while(key) {
			switch (scan.nextLine()) {
				case "Y":
				case "y":
					result = true;
				case "N":
				case "n":
					key = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}
		return result;
	}
	
	public void 시작(String URL, String USER, String PASSWORD) {
		사용자();
		if(디비접속()) {
			try {
				Connection conn = db.openDB(URL, USER, PASSWORD);
				if(conn != null) {
					//테이블생성(conn);					
					boolean key = true;
					while(key) {
						System.out.println("어떤 기능을 실행하시겠습니까?(C입력/R읽기/U수정/D삭제/E종료)");
						switch (scan.nextLine()) {
							case "C": 
							case "c":
								입력하기(conn);
								break;
							case "R": 
							case "r":
								가져오기(conn);
								break;
							case "U": 
							case "u":
								수정하기(conn);
								break;
							case "D": 
							case "d":
								삭제하기(conn);
								break;
							case "E": 
							case "e":
								key = false;
								break;
							default:
								System.out.println("잘못된 입력입니다. 다시 기능을 입력해주세요.");
						}
					}
					conn.close();
					종료();
				} else {
					System.out.println("데이터 접속 정보를 확인해 주세요.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			종료();
		}
	}

}