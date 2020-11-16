package member.service;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import member.domain.MemberVO;
import member.persistence.MemberDAO;

import static member.persistence.JDBCUtil.*;
public class MemberListService {
	//DAO 의 memberList() 호출해서 ListAction으로 넘기기
	//return dao.memberList();
	public List<MemberVO> getList(){
		Connection con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		List<MemberVO> list = dao.memberList();
		
		close(con);
		
		return list;
		
	}
}