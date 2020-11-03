package exception;
/*Exception 과 Error(해결 못함 - 컴퓨터다운...)
 * 
 *Exception(예외)
 *컴파일 예외 - 코딩시 나타나는 에러(이클립스에서 알려줌)
 *런타임 예외 - 실행할때 나타나는 예외사항
 * 
 */
public class ExceptionTest {
//throws 니가처리해 자바니가
	public static void main(String[] args) {
		//컴파일 예외
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); 
			//e.printStackTrace();오류가어디서부터 시작되었는지 알려줌
			Systme.out.println("입력값을 확인해 주세요");
		}

	}

}
