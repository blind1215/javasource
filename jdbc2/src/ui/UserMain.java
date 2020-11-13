package ui;

import java.util.List;
import java.util.Scanner;

import action.Action;
import action.UserAddAction;
import action.UserListAction;
import action.UserRemoveAction;
import action.UserRowAction;
import action.UserUpdateAction;
import controller.UserController;

public class UserMain {

	public static void main(String[] args) { 
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		UserController userController = new UserController();
		
		do {
			System.out.println("=====사용자 메뉴=====");
			System.out.println("1.전체 조회");
			System.out.println("2.삽입");
			System.out.println("3.삭제");
			System.out.println("4.수정");
			System.out.println("5.개별 조회");
			System.out.println("6.프로그램 종료");
			System.out.println("==================");
			
			System.out.print("번호입력 : ");
			int menu = sc.nextInt();
			
			Action action =null;
			
			switch(menu) { 
			case 1:
				action = new UserListAction();//1번을 담당하는 아이니까 listAction에 넘긴거임
				break;
			case 2:
				action = new UserAddAction(); //2번을 담당하는 거
				break;
			case 3:
				action = new UserRemoveAction();
				break;
			case 4:
				action = new UserUpdateAction();
				break;
			case 5:
				action = new UserRowAction();
				break;
			case 6:
				System.out.println("프로그램 종료");
				isStop = true;//반복문 종료 isStop이 true일때 반복종료이니까
				break;
			default:
				break;
			
			
			}
			if (action != null) {
				userController.processRequest(action, sc); // 액션인스턴스를 한번에 가져오는 작업을 한거임
			}
		}while(!isStop);
	}
}



