package gui;

import java.sql.*;
import java.util.ArrayList;

public class Database {

	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@70.12.115.68:1521:orcl";
	String user ="scott";
	String pass = "tiger";
	Connection con;
	
	public Database() throws Exception{
		Class.forName(driver);//1.드라이버로딩
		con = DriverManager.getConnection(url,user,pass);//2.연결객체 얻어오기
		
	}
	
	public void insertData(InfoVO vo/* (1)데이터 넘어옴*/)throws SQLException{
		//3.sql문장
		String sql ="INSERT INTO info_tab VALUES(?,?,?,?,?,?)";
		//4.sql전송 객체 얻어오기
		PreparedStatement ps = con.prepareStatement(sql);
		/* (2)넘어온 데이터를 ?에 저장*/
		ps.setString(1, vo.getTel());
		ps.setString(2, vo.getName());
		ps.setString(3, vo.getId());
		ps.setString(4, vo.getHome());
		ps.setInt(5, vo.getAge());
		ps.setString(6, vo.getGender());
		
		
		//5.sql 전송
		ps.executeUpdate();
		//6.닫기 connection 제외
		
		ps.close();
	}
	
	public ArrayList<InfoVO> selectAll() throws SQLException{
		//3.sql문장
		//String sql = "SELECT * FROM info_tab";
		String sql = "SELECT name, jumin, tel, gender, age, nvl(home,'외국') home "//함수연산시 별칭 주어야함
				+ "FROM info_tab";
		//4.전송객체
		PreparedStatement ps = con.prepareStatement(sql);//ps는 sql문을 먼저 가져간다
		//5.전송
		ResultSet rs = ps.executeQuery();
		ArrayList<InfoVO> list = new ArrayList<>();
		while(rs.next()){//레코드가 두개이상나오면 while문해야함
			InfoVO vo = new InfoVO();
			vo.setAge(rs.getInt("AGE"));
			vo.setGender(rs.getString("GENDER"));
			vo.setHome(rs.getString("HOME"));
			vo.setId(rs.getString("JUMIN"));
			vo.setName(rs.getString("NAME"));
			vo.setTel(rs.getString("TEL"));
			
			list.add(vo);
		}
		rs.close();
		ps.close();
		return list;
		
	}
	
	public InfoVO selectByPk(String tel) throws SQLException{
		InfoVO vo = new InfoVO();
		//3. sql문장 만들기
		String sql = "SELECT * From Info_tab WHERE tel ='"+tel+"'";
		//4. sql  전송객체 얻어오기
		Statement st = con.createStatement();
		//5. sql 전공
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()){
			vo.setName(rs.getString("NAME"));
			vo.setId(rs.getString("JUMIN"));
			vo.setTel(rs.getString("TEL"));
			vo.setAge((rs.getInt("AGE")));
			vo.setGender(rs.getString("GENDER"));
			vo.setHome(rs.getString("HOME"));
		}
		//6. 닫기 connection제외
		st.close();
		return vo;
		
	}
	
	public void updateDate(InfoVO vo) throws SQLException{
		String sql ="UPDATE info_tab SET name=?, age=?,jumin=?,gender=?,home=? WHERE tel =?";
	
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getName());
		ps.setInt(2, vo.getAge());
		ps.setString(3, vo.getId());
		ps.setString(4, vo.getGender());
		ps.setString(5, vo.getHome());
		ps.setString(6, vo.getTel());
		
		ps.executeUpdate();
		
		ps.close();

	}
	
	public void deleteData(String tel) throws SQLException{
		
		String sql = "DELETE FROM info_tab WHERE tel ='"+tel+"'";
		
		Statement st = con.createStatement();
		
		st.executeUpdate(sql);
		
		st.close();
		
		
		
		

	}
}
