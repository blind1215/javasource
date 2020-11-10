import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBSelect {

	public static void main(String[] args) {
		Connection con=null;
		//sql 문 전송
		PreparedStatement pstmt=null;
		//sql 문 결과
		ResultSet rs=null; //셀렉트를 하기 위해서 3개가 꼭 필요함
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "javaDB";
			String password = "12345";
			
			con = DriverManager.getConnection(url,user,password);
			if(con!=null) {//읽어올 데이터가 있을동안
				String sql = "select*from userTBL"; //sql문 
				
				pstmt = con.prepareStatement(sql);//sql문을 미리 전송하고 객체를 받아옴
				rs=pstmt.executeQuery(); //전송됨 sql문을 실행 후 결과를 담는 작업
				while(rs.next()) { //루프를 돌면서 하나씩 꺼내준다 읽어올데이터가 있는동안
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getInt(3)+"\t");;
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\n");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close(); //맨나중에 닫아주어야함 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
