package member.action;

import java.util.Scanner;

import member.domain.MemberVO;
import member.service.MemberAddService;
import member.service.MemberRemoveService;
import member.ui.MemverConsoleUtil;

public class MemberRemoveAction implements Action {

	@Override
	public void execute(Scanner s) throws Exception {
		//삭제할 회원 아이디를 입력하세요 이런 메세지를 보여주는
		// 메소드 호출 => consoleutil 작성
		MemverConsoleUtil util = new MemverConsoleUtil();
		int id = util.printRemoveSuccessMessage(s);
		
		//리턴받은 아이디를 service에게 넘겨서 삭제한 결과 전송받기
		MemberRemoveService service = new MemberRemoveService();
		//삭제결과에 따라 메세지(consoleutil) 출력하기 
		if(service.member_Remove(id)) {
			util.printRemoveSuccessMessage();
		
		}else {
			util.printRemoveFailMessage();
		}
	}

}
