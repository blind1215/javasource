package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con= null;
		try {
			//오라클 드라이버 로드 어느드라이브인지 빌드패스 잡아줌
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl"; //호스트이름(내꺼)(127.0.0.1)/포트/orcl//아마존웹서버로 호스트바꿀예정
			String user = "javaDB"; //오라클 아이디
			String password = "12345"; //오라클 비밀번호
			con = DriverManager.getConnection(url,user,password); //db랑 연결
			if(con!=null) {
				System.out.println("연결되었습니다.");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {//에러가 나던 안나던 쓰는 것
			try {
				
				//지원 해제 (컴퓨터가 느려지므로 할일끝나면 끊어준다)
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
