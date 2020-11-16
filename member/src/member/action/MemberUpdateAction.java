package member.action;

import java.util.Scanner;

import member.domain.MemberVO;
import member.service.MemberUpdateService;
import member.ui.MemverConsoleUtil;

public class MemberUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {//서비스와 연결되는 아이
		//사용자한테 수정할 정보받기 util에서 담당함 
		
		MemverConsoleUtil util =new MemverConsoleUtil();
		MemberVO updateMember = util.printUpdateMessage(sc);
		
		//MemberUpdateService 객체 생성 후 메소드 호출 
		MemberUpdateService service = new MemberUpdateService();
		//boolean update(MemberVO updateMember) 호출하고싶은거임
		boolean updateFlag = service.update(updateMember);
		
		//수정 작업에 대한 결과를 알려줌
		util.printUpdateSuccessFail(updateFlag);
		

	}

}
