import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConTest2 {

	public static void main(String[] args) {

		try {
			//1.드라이버를 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@70.12.115.68:1521:orcl";
			String user ="scott";
			String pass ="tiger";
			
			//2.연결 객체를 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("성공");
			
			//3.SQL 문장***
			String accno ="444-44-4444";
			String name ="홍길동";
			int money = 10000;
			String sql ="INSERT INTO account VALUES('"+accno+"','"+name+"',"+money+")";
	
			//4.SQL 전송 객체
			Statement st = con.createStatement();
			
			//5.전송
			st.executeUpdate(sql);
			
			//6.닫기
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println("실패"+e.getMessage());
			e.printStackTrace();
		}
	}

}