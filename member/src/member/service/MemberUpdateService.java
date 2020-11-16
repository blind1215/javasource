package member.service;

import java.sql.Connection;

import member.domain.MemberVO;
import member.persistence.JDBCUtil;
import member.persistence.MemberDAO;

public class MemberUpdateService {//★★서비스는 dao와 연결된다
	//memberUpdate(MemberVO updateMember) 를 호출하여 작업 결과를 
	//돌려받기
	public boolean update(MemberVO updateMember) {
		
		//MemberDAO 객체 생성하기
		Connection con = JDBCUtil.getConnection();
		MemberDAO dao = new MemberDAO(con);
		
	
		//DAO의 memberUpdate 호출
		int result = dao.memberUpdate(updateMember); //마우스를 대면 타입이 보인다 그타입으로 돌려주면 된다 result는 업데이트한결과(1=성공 or 0=실패)
		
		//DB작업결과를 담을 변수 선언 
		boolean updateFlag = false;
		
		if(result>0) {//성공했다면
			//커밋 JDBCUtil에 만들어놓음
			JDBCUtil.commit(con);
			
			//리턴 값을 true 변경 
			updateFlag = true; 
		}else {//실패했다면
			//롤백 JDBCUtil에 만들어놓음
			JDBCUtil.rollback(con);
		}
		return updateFlag;
	}

}
