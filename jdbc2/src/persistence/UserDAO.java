package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import domain.UserVO;

import static persistence.JDBCUtil.*; //모든메소드가 스태틱으로 구성되어있으면 임포트부분으로 끌어올릴수있음


 public class UserDAO {
	
	 
	 Connection con;
	 
	 
	 
	 public UserDAO(Connection con) {
		super();
		this.con = con;
	}
	 //개별 조회 메소드
	 public UserVO getRow(int no) {
		 
		 PreparedStatement pstmt=null;
		 ResultSet rs =null;
		 UserVO vo = null;
		 try {
			 String sql = "select * from userTBL where no =?";
			 pstmt = con.prepareStatement(sql);
			 pstmt.setInt(1, no);
			 rs = pstmt.executeQuery();
			 if(rs.next()) {
				 vo = new UserVO();
				 vo.setNo(rs.getInt("no"));
				 vo.setUserName(rs.getString("userName"));
				 vo.setBirthYear(rs.getInt("birthYear"));
				 vo.setAddr(rs.getString("addr"));
				 vo.setMobile(rs.getString("mobile"));
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return vo;
		
	 }
	 //전체 조회 메소드
	public List<UserVO> getList() {

			
			PreparedStatement pstmt = null; // 전송
			ResultSet rs = null; // 실행을하고 결과를 담으라고
			List<UserVO> list = new ArrayList<UserVO>();

			try {
				

				// select : 여러행의 결과가 출력(ArrayList)되는 것인지 아니면 하나의 행만
				// 출력(~~VO)되는것인지 따라 담을 객체가 결정
				String sql = "select * from userTBL";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();// sql문실행
				while (rs.next()) { // 어레이리스트에 옮긴다
					UserVO user = new UserVO();
					user.setNo(rs.getInt(1));
					user.setUserName(rs.getString(2));
					user.setBirthYear(rs.getInt("birthYear"));
					user.setAddr(rs.getString("addr"));
					user.setMobile(rs.getString("mobile"));
					list.add(user);

				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(rs);
				close(pstmt);
				
			}
			return list;

		}

	public boolean deleteuser(int no) {
		
		PreparedStatement pstmt = null;
		boolean flag = false;
		try {
			
//		String sql = "delete from userTbL where no="+no;

			String sql = "delete from userTBL where no=?";

			pstmt = con.prepareStatement(sql);// 전송
			pstmt.setInt(1, no);// ?에 대한 설정을해주는것
			int result = pstmt.executeUpdate();

			if (result > 0) { // 삭제성공,실패는 false로간다
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close(pstmt);
			
		}
		return flag;
	}

	// 수정 메소드
	public boolean updateUser(String addr, int no) {
		boolean flag = false;
		PreparedStatement pstmt = null;

		try {
		
			String sql = "update userTBL set addr =? where no =?";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, addr);
			pstmt.setInt(2, no);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			close(pstmt);
			
		}
		return flag;
	}
	// 삽입 메소드
	public boolean inserUser(UserVO vo) {//개별로하면 번거로우니까 만들어놓은 vo로 
		
		PreparedStatement pstmt=null;
		boolean flag= false;
		
		try {
			
			String sql="insert into userTBL values(userTBl_seq.nextval,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getUserName());
			pstmt.setInt(2, vo.getBirthYear());
			pstmt.setString(3, vo.getAddr());
			pstmt.setString(4, vo.getMobile());
			int result = pstmt.executeUpdate();
			if(result>0) {
				flag=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			
		}
		return flag;
			
		
	}
}
