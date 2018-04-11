import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ConTest3 {

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
			String accno ="111-11-1111";
			String name ="박보검";
			int money = 20000;
			String sql ="INSERT INTO account VALUES(?,?,?)";
			//String sql ="UPDATE account Set customer =?, amount=? WHERE account_no=?";
	
			//4.SQL 전송 객체
			//Statement st = con.createStatement();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(2, name);
			st.setInt(3, money);
			st.setString(1, accno);
			
			//5.전송
			//st.executeUpdate(sql);
			int result = st.executeUpdate();//sql 지정하면 안됨
			if(result == 1){
				System.out.println("수정하였습니다.");
			}
			//6.닫기
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println("실패"+e.getMessage());
			e.printStackTrace();
		}
	}

}