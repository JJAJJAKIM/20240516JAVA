package Java0530;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
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
		sql = "CREATE OR REPLACE TABLE userinfo ("
				+ "no int"
				+ ", email varchar(100)"
				+ ", password varchar(60)"
				+ ", delYn boolean"
				+ ")"; // DDL 추가
		System.out.println("테이블 생성 SQL문 확인 : " + sql);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.		
		db.테이블생성(conn, sql);
	}
	
	// 2단계 생성된 테이블에 데이터 입력하기
	private void 입력하기(Connection conn) {
		sql = "INSERT INTO userinfo VALUES (?,?,?,?)"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		List<DbTable> list = input();
		for(int i = 0; i < list.size(); i++) {
			data = (DbTable)list.get(i);
//			System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
			db.데이터입력하기(conn, sql, data);
		}
	}
	
	private List<DbTable> input() {
		
		List<DbTable> list = new ArrayList<DbTable>();
		
		DbTable data = new DbTable();
		data.setNo(1);
		data.setEmail("홍길동@이메일.컴");
		data.setPassword("pAssWorD");
		data.setDelYn("N");
		list.add(data);
		
		data = new DbTable();
		data.setNo(2);
		data.setEmail("유관순@이메일.컴");
		data.setPassword("1@34%");
		data.setDelYn("Y");
		list.add(data);
		
		data = new DbTable();
		data.setNo(3);
		data.setEmail("이순신@이메일.컴");
		data.setPassword("!!9!2#");
		data.setDelYn("Y");
		list.add(data);
		
		data = new DbTable();
		data.setNo(4);
		data.setEmail("화이슬@이메일.컴");
		data.setPassword("ghkdltmf");
		data.setDelYn("N");
		list.add(data);
		
		return list;
	}
	
	// 3단계 생성된 테이블에 데이터 추가하기
	private void 추가하기(Connection conn) {
		sql = "INSERT INTO userinfo VALUES (?,?,?,?)"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		boolean key1 = true;
		String checkInt = "";
		String checkBoolean = "";
		int convInt = 0;
		while(key1) {
			System.out.println("번호 값은?(숫자만 입력하세요)");
			 checkInt = scan.nextLine(); 
			 if(!"".equals(checkInt)) {
				 if(checkInt.chars().allMatch(Character::isDigit)) {			
					 System.out.println("숫자 맞읍니다.");
					 convInt = Integer.valueOf(checkInt);
					 key1 = false;
				 } else {
					System.out.println("숫자가 아님다");	
				 }
			} else {
				System.out.println("값을 다시 입력하세요.");
			}
		}				
		data.setNo(convInt);			
		System.out.println("이메일은?");
		data.setEmail(scan.nextLine());
		System.out.println("패스워드는?");
		data.setPassword(scan.nextLine());
		
		key1 = true;
		while(key1) {
			System.out.println("삭제여부?");
			checkBoolean = scan.nextLine();
			if(!"".equals(checkBoolean)) {
				if("y".equals(checkBoolean) || "Y".equals(checkBoolean)) {
					checkBoolean = "y";
					key1 = false;
				} else if("n".equals(checkBoolean) || "N".equals(checkBoolean)) {
					checkBoolean = "n";
					key1 = false;
				} else {	
					System.out.println("y 또는 n으로 입력하세요.");
				}
			} else {
				System.out.println("값이 비었습니다. 값을 입력하세요.");
			}
		}
		data.setDelYn(checkBoolean);

		
		
//		data.setNo(5);
//		data.setEmail("하이디@이메일.컴");
//		data.setPassword("hiDe");
//		data.setDelYn(false);
		
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
			db.데이터입력하기(conn, sql, data);
		
	}
	
	// 3단계 생성된 데이터 가져오기 >> 목록 출력 시 화면출력() 메소드를 사용하시오.
	private void 가져오기(Connection conn) {
		sql = "SELECT * FROM userinfo"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		화면출력(db.데이터가져오기(conn, sql));
	}
	
	// 4단계 생성된 데이터 수정하기
	private void 수정하기(Connection conn) {
		sql = "UPDATE userinfo SET " 
				+ " email = ?"
				+ ", password = ?"
				+ "where no = ?"; // DML 추가"
						
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
//		data.setNo(4);
//		data.setEmail("신총맨@이메일.컴");
//		data.setPassword("tlschdaos");
		
		boolean key1 = true;
		String checkInt = "";
		int convInt = 0;
		while(key1) {
			System.out.println("수정할 번호는?(숫자만 입력하세요)");
			 checkInt = scan.nextLine(); 
			 if(!"".equals(checkInt)) {
				 if(checkInt.chars().allMatch(Character::isDigit)) {			
					 System.out.println("숫자 맞읍니다.");
					 convInt = Integer.valueOf(checkInt);
					 key1 = false;
				 } else {
					System.out.println("숫자가 아님다");	
				 }
			} else {
				System.out.println("값을 다시 입력하세요.");
			}
		}				
		data.setNo(convInt);			
		System.out.println("수정할 이메일 주소?");
		data.setEmail(scan.nextLine());
		System.out.println("수정할 패스워드?");
		data.setPassword(scan.nextLine());
		
		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터수정하기(conn, sql, data);
	}
	
	// 5단계 생성된 데이터 삭제하기
	private void 삭제하기(Connection conn) {
		sql = "UPDATE userinfo SET delYn = ? WHERE no = ?"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();

		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		boolean key1 = true;
		String checkBoolean = "";
		String checkInt = "";
		int convInt = 0;

		System.out.println("삭제할 번호는? (숫자만 입력하세요)");
		while(key1) {
			checkInt = scan.nextLine(); 
			if(!"".equals(checkInt)) {
				if(checkInt.chars().allMatch(Character::isDigit)) {			
					System.out.println("숫자 맞읍니다.");
					convInt = Integer.valueOf(checkInt);
					key1 = false;
				} else {
					System.out.println("숫자가 아님다");	
				}
			} else {
				System.out.println("값을 다시 입력하세요.");
			}
		}		
		data.setNo(convInt);
		
		key1 = true;		
		System.out.println("삭제하려면 true, 아니라면 false를 입력하세요.");
		while(key1) {
			checkBoolean = scan.nextLine();
			if(!"".equals(checkBoolean)) {
				if("y".equals(checkBoolean) || "Y".equals(checkBoolean)) {
					checkBoolean = "y";
					key1 = false;
				} else if("n".equals(checkBoolean) || "N".equals(checkBoolean)) {
					checkBoolean = "n";
					key1 = false;
				} else {
					System.out.println("true 또는 false로 입력하세요. 대소문자 구별하세요.");
				}
			} else {
				System.out.println("값이 비었습니다. 값을 입력하세요.");
			}
		}
		data.setDelYn(checkBoolean);
		
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
					테이블생성(conn);					
					boolean key = true;
					while(key) {
						System.out.println("어떤 기능을 실행하시겠습니까?(C데이터생성/R읽기/I추가/U수정/D삭제/E종료)");
						switch (scan.nextLine()) {
							case "C": 
							case "c":
								입력하기(conn);
								break;
							case "R": 
							case "r":
								가져오기(conn);
								break;
							case "I": 
							case "i":
								추가하기(conn);
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