package pattern;

import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		System.out.println("===== UserTbl=====");
		System.out.println("1.조회");
		System.out.println("2.삽입");
		System.out.println("3.삭제");
		System.out.println("4.수정");
		System.out.println("==================");
		
		System.out.println("번호 입력: ");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		UserDAO dao=new UserDAO();
		
		switch(menu) {
		case 1:
			System.out.println("userTBL 전체 출력");
			List<UserVO> list = dao.getList();
			for(UserVO vo:list) {
				System.out.println(vo);
			}
			break;
			
		case 2:
			UserVO vo = new UserVO();
			System.out.println("추가할 회원번호를 입력 ");
			System.out.print("이름: ");
			vo.setUserName(sc.next());
			System.out.print("태어난 년도: ");
			vo.setBirthYear(sc.nextInt());
			System.out.print("주소: ");
			vo.setAddr(sc.next());
			System.out.print("핸드폰 : ");
			vo.setMobile(sc.next());
			
			System.out.println(dao.inserUser(vo)?"삽입성공":"삽입실패");
			
			
			break;
			
		case 3:
			System.out.println("삭제할 회원번호 입력: ");
			int no = sc.nextInt(); //3			
			boolean flag=dao.deleteuser(no);
			System.out.println(flag?"삭제성공":"삭제실패");
			break;
			
		case 4:
			System.out.println("수정할 회원 정보 입력");
			System.out.print("수정할 회원번호 입력:");
			no = sc.nextInt();
			System.out.println("수정할 주소 입력: ");
			String addr = sc.next();
			flag = dao.updateUser(addr, no);
			System.out.println(flag? "수정성공":"수정실패");
			break;
				
		}

	}

}
