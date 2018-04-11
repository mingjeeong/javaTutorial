package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetUpdate {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@70.12.115.68:1521:orcl";
		String user = "scott";
		String pass = "tiger";
		Connection con = null;

		try {
			// 1.드라이버로딩
			Class.forName(driver);
			// 2.연결객체 얻어오기
			 con = DriverManager.getConnection(url, user, pass);
			 //3.sql문장 account 내용 전부 화면 출력
			 String sql = "SELECT * FROM account";
			 
			 Statement st = con.createStatement(
					 ResultSet.TYPE_SCROLL_SENSITIVE,
					 ResultSet.CONCUR_UPDATABLE
					 );
			 
			 ResultSet rs = st.executeQuery(sql);
			 
			 while(rs.next()){
				 System.out.print(rs.getString("ACCOUNT_NO")+"\t");
				 System.out.print(rs.getString("CUSTOMER")+"\t");
				 //System.out.println(rs.getInt("AMOUNT")+"\t");
				 
				 //복사본 수정
				 int money = rs.getInt("AMOUNT") + 1000;
				 rs.updateInt(3, money);
				 rs.updateRow();//오라클에서는 안됨 외부에서 수정안되게 해놧음/ mysql은 됨
			 }
			
			 
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL 에러");
			e.printStackTrace();
		}finally{
			//6.닫기
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
