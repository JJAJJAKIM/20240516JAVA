package Java0531;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public Connection openDB(String URL, String USER, String PASSWORD) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBC Connection Open!");
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean 테이블생성(Connection conn, String sql) {
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();
			pstmt.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<DbTable> 데이터가져오기(Connection conn, String sql) {
		List<DbTable> list = new ArrayList<DbTable>();
		DbTable data;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				
				data = new DbTable();
				data.setDay(rs.getInt("day"));
				data.setRice(rs.getString("rice"));
				data.setSoup(rs.getString("soup"));
				data.setMaindish(rs.getString("maindish"));
				data.setSidedish(rs.getString("sidedish"));
				data.setKimchi(rs.getString("kimchi"));
				list.add(data);
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean 데이터입력하기(Connection conn, String sql, DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, data.getDay());
			pstmt.setString(2, data.getRice());
			pstmt.setString(3, data.getSoup());
			pstmt.setString(4, data.getMaindish());
			pstmt.setString(5, data.getSidedish());
			pstmt.setString(6, data.getKimchi());
			

			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean 데이터수정하기(Connection conn, String sql, DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, data.getSoup());
			pstmt.setString(2, data.getSidedish());
			pstmt.setInt(3, data.getDay());
			
			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean 데이터삭제하기(Connection conn, String sql, DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, data.getDay());

			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
