import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@70.12.115.68:1521:orcl";
			String user ="scott";
			String pass ="tiger";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			//String sql = "SELECT * FROM emp";
//			String sql ="SELECT e.empno empno, e.ename ename, d.dname dname   "
//					+ "FROM emp e, dept d   "
//					+ "WHERE e.deptno = d.deptno";
			//부서명이 SALES 이면서 월급이 2000 넘는 사원정보 검색
			String departmentName ="SALES";
			int salary =2000;
			String sql ="SELECT e.empno empno, e.ename ename, d.dname dname   "
					+ "FROM emp e, dept d    "
					+ "WHERE e.deptno = d.deptno AND dname=? AND e.sal >?";
			
			//Statement st = con.createStatement();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, departmentName);
			st.setInt(2, salary);
			
//			ResultSet rs =st.executeQuery(sql);
			ResultSet rs =st.executeQuery();
			
			while(rs.next()){
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.println(rs.getString("dname"));
			}
			rs.close();
			st.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("에러"+e.getMessage());
			e.printStackTrace();
		} 
	}
}
