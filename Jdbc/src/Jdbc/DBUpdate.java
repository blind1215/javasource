package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBUpdate {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");//익셉션 드라이버를 못찾을수있어서
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user="javaDB";
		String password="12345";
		
		try {
			con =DriverManager.getConnection(url,user,password);//익셉션
			if(con!=null) {
				String sql="update userTBL set addr='제주' where no=3"; 
				pstmt = con.prepareStatement(sql); //익셉션 / sql문 전송해서 서버로보냄
				int result =pstmt.executeUpdate(); // 실행시키는 존재
				System.out.println(result>0?"수정성공":"수정실패");
		
				}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
