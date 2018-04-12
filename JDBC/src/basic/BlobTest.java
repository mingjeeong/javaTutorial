package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BlobTest {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
//			File f = new File("src\\img\\add.gif");//파일과 디렉토리 저장, 함부러 지우면 안됨
//			FileInputStream fis = new FileInputStream(f);
//			String sql = "INSERT INTO imgtest VALUES (?,?)";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, f.toString());
//			ps.setBinaryStream(2, fis, f.length());
//			ps.executeUpdate();
			
			FileOutputStream fos = new FileOutputStream("aaa.gif");
			String sql = "SELECT img_binary FROM imgtest";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			InputStream in = null;
			if(rs.next()){
				in = rs.getBinaryStream("img_binary");
				
			}
			byte[] buffer = new byte[1024];
			int size = 0;
			while((size = in.read(buffer)) != -1){//내가 저장할 공간
				fos.write(buffer,0,size);
			}
			ps.close();
			con.close();
			fos.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL 에러");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("파일 에러");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO예외");
			e.printStackTrace();
		}
	}
}
