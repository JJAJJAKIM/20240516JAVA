package Java0531;

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
		sql = "CREATE OR REPLACE TABLE todaymenu ("
				+ "day int"
				+ ", rice varchar(255)"
				+ ", soup varchar(30)"
				+ ", maindish varchar(50)"
				+ ", sidedish varchar(20)"
				+ ", kimchi varchar(10)"
				+ ")"; // DDL 추가
		System.out.println("테이블 생성 SQL문 확인 : " + sql);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.		
		db.테이블생성(conn, sql);
	
		
		DbTable data = new DbTable();
		List<DbTable> list = new ArrayList<DbTable>();
		list = 데이터생성();
		sql = "INSERT INTO todaymenu values (?,?,?,?,?,?)";
		for(int i = 0; i < list.size(); i++) {
			data = (DbTable) list.get(i);
			
			db. 데이터입력하기(conn, sql, data);	
		}
		
	}
	
	private List<DbTable> 데이터생성(){
		List<DbTable> list = new ArrayList<DbTable>();
		DbTable data = new DbTable();
		
		data.setDay(1);
		data.setRice("콩밥");
		data.setSoup("감자탕");
		data.setMaindish("두루치기");
		data.setSidedish("계란말이");
		data.setKimchi("갓김치");
		list.add(data);
		
		data = new DbTable();
		data.setDay(2);
		data.setRice("보리밥");
		data.setSoup("김치국");
		data.setMaindish("오징어불고기");
		data.setSidedish("고추짱아찌");
		data.setKimchi("마늘쫑");
		list.add(data);
		
		data = new DbTable();
		data.setDay(3);
		data.setRice("쌀밥");
		data.setSoup("닭볶음탕");
		data.setMaindish("닭갈비");
		data.setSidedish("닭강정");
		data.setKimchi("파김치");
		list.add(data);
		
		data = new DbTable();
		data.setDay(4);
		data.setRice("현미밥");
		data.setSoup("미역국");
		data.setMaindish("고등어조림");
		data.setSidedish("멸치볶음");
		data.setKimchi("굴김치");
		list.add(data);
		
		data = new DbTable();
		data.setDay(5);
		data.setRice("잡곡밥");
		data.setSoup("고추장찌개");
		data.setMaindish("돈까스");
		data.setSidedish("김");
		data.setKimchi("오이소박이");
		list.add(data);
		
		return list;
	}
	
	// 2단계 생성된 테이블에 데이터 입력하기
	private void 입력하기(Connection conn) {
		sql = "INSERT INTO todaymenu values (?,password(?),?,?,?,?)"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		//List<DbTable> list = new ArrayList<DbTable>();
		
		data.setDay(6);
		data.setRice("새우복음밥");
		data.setSoup("소고기무국");
		data.setMaindish("삼겹숙주볶음");
		data.setSidedish("무생채");
		data.setKimchi("총각김치");
		db.데이터입력하기(conn, sql, data);
		
		data = new DbTable();
		data.setDay(7);
		data.setRice("짜장밥");
		data.setSoup("짬뽕");
		data.setMaindish("탕수육");
		data.setSidedish("깐풍기");
		data.setKimchi("배추김치");
		db.데이터입력하기(conn, sql, data);
		
		data = new DbTable();
		data.setDay(8);
		data.setRice("비빔밥");
		data.setSoup("된장찌개");
		data.setMaindish("고사리");
		data.setSidedish("시금치");
		data.setKimchi("무말랭이");
		db.데이터입력하기(conn, sql, data);
		
				
		
		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		//db.데이터입력하기(conn, sql, data);
	}
	
	// 3단계 생성된 데이터 가져오기 >> 목록 출력 시 화면출력() 메소드를 사용하시오.
	private void 가져오기(Connection conn) {
		sql = "SELECT * FROM todaymenu"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		화면출력(db.데이터가져오기(conn, sql));
	}
	
	// 4단계 생성된 데이터 수정하기
	private void 수정하기(Connection conn) {
		sql = "UPDATE todaymenu SET " 
				+ " soup = ?"
				+ ", sidedish = ?"
				+ "where day = ?"; // DML 추가"
						
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		data.setDay(2);
		data.setSoup("오징어무국");
		data.setSidedish("진미채볶음");
		
		
		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터수정하기(conn, sql, data);
	}
	
	// 5단계 생성된 데이터 삭제하기
	private void 삭제하기(Connection conn) {
		sql = "DELETE FROM todaymenu WHERE day = ?"; // DML 추가
		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();

		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/

		System.out.println("삭제하려고 하는 번호 값은?");
		data.setDay(4);
	
		
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