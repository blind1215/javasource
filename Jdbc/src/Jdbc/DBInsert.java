package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Collection;

public class DBInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null; //연결
		PreparedStatement pstmt =null; //전송
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javadb";
			String password = "12345";
			
			con=DriverManager.getConnection(url,user,password);
			if(con!=null) {
				String sql="insert into usertbl values(usertbl_seq.nextval,'김승우',1996,'서울','010-1569-4869')";
				
				pstmt = con.prepareStatement(sql);
				//insert,update,delete 구문은 executeUpdate() 실행
				int result = pstmt.executeUpdate();
				
				if(result>0) { // 1개씩넣어서 앞에서 1행넣었습니다 이니까 1이냐 아니냐로 넣는다
					System.out.println("입력 성공");
				}else {
					System.out.println("입력 실패");
					
				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();//전송끝냄
				con.close(); //연결끝냄
			} catch(Exception e2) {
				e2.printStackTrace();  //오토커밋상태이다
			}
		}
		
	}

}
