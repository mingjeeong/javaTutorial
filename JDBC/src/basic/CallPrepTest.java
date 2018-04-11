package basic;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallPrepTest {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@70.12.115.68:1521:orcl";
		String user = "scott";
		String pass = "tiger";
		Connection con = null;
		CallableStatement cs = null;
		
		try {
			// 1.드라이버로딩
			Class.forName(driver);
			// 2.연결객체 얻어오기
			con = DriverManager.getConnection(url, user, pass);
			// 3.SQL 문장
			String sql ="{call proc_account(?,?,?)}";
			//4.전송객체
			cs = con.prepareCall(sql);
			cs.setString(1, "222-222-222");
			cs.setString(2, "갑돌이");
			cs.setInt(3, 200000);
			//5.전송
			int result = cs.executeUpdate();//수행한 행수 리턴해줌
			System.out.println(">>"+result);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL 에러");
			e.printStackTrace();
		}finally{
			//6.닫기
			try {
				cs.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
