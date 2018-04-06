import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@70.12.115.68:1521:orcl";
			String user ="scott";
			String pass ="tiger";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			String sql ="SELECT count(*) cnt FROM emp";
			
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(sql);
			rs.next();
			int result = rs.getInt("cnt");
			
			System.out.println(result);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}

}
