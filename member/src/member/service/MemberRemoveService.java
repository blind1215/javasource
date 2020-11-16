package member.service;

import static member.persistence.JDBCUtil.*;

import java.sql.Connection;

import member.domain.MemberVO;
import member.persistence.MemberDAO;

public class MemberRemoveService {
	//DAO의 memberRemove(int id)를 실행한 후
	//결과를 돌려받고
	//돌려받은 결과를 action 넘기기
	public boolean member_Remove(int id) {
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(getConnection());
		int result = dao.memberRemove(id);
		boolean isRemoveSuccess = false;
		if(result>0) {
			commit(con);
			isRemoveSuccess = true;
			
		}else {
			rollback(con);
		}
		close(con);
		return isRemoveSuccess;
		
	}
}
