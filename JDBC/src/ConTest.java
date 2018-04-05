import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConTest {

	public static void main(String[] args) {

		try {
			//1.드라이버를 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@70.12.115.68:1521:orcl";//127.0.0.1
			String user ="scott";
			String pass ="tiger";
			//2.연결 객체를 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("성공");
			
			//3.SQL 문장***
//			String sql ="INSERT INTO emp_copy(empno, ename, sal)   "//공백 넉넉히 주기
//					+ "VALUES(9999,'홍돌이',4000)";//세미콜론 찍지 않음
			
			//홍돌이 사원의 보너스를 2000으로 추가, 부서번호를 20으로 지정
			String sql ="UPDATE emp_copy SET comm = 2000, deptno=20 WHERE ename='홍돌이'";
			
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
