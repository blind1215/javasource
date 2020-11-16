package member.action;

import java.util.List;
import java.util.Scanner;

import member.domain.MemberVO;
import member.service.MemberListService;
import member.ui.MemverConsoleUtil;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner s) throws Exception {
		
		MemberListService service = new MemberListService();
		List<MemberVO> memberList = service.getList();
		MemverConsoleUtil console = new MemverConsoleUtil();
		console.printMemberList(memberList);
	}

}
