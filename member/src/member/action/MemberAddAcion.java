package member.action;

import java.util.Scanner;

import member.domain.MemberVO;
import member.service.MemberAddService;
import member.ui.MemverConsoleUtil;

public class MemberAddAcion implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// 사용자로부터 입력받기 - memberConsoleUtil 의 getAddMember()
		MemverConsoleUtil console = new MemverConsoleUtil();//사용하기위해 객체생성
		MemberVO vo= console.getAddMember(sc);
		// 입력받은 객체를 Service로 넘겨서 DB처리를 한 후 결과를 전송받아
		MemberAddService service = new MemberAddService();
		if(service.addMember(vo)) {//입력받은 객체를 넘겨줘야하기때문에 vo를 넣어준다
		// 성공한 경우 메세지 출력
			console.printAddSuccessMessage(vo.getName());
		}
	}

}
