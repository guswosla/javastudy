import java.util.Scanner;


/*/
 * 
 * if(양수조건)
 * {
 * }
 * else
 * {
 * }
 * =>if(조건문)
 * {
 *  조건 true일때 수행
 * 
 * }
 * 
 * else
 * {
 *  조건  false일 때 수행
 * }
 * 
 */
//웹 => 아이디중복체크, 로그인, 관리자/사용자, 아이디찾기, 비밀번호찾기
//파일업로드
public class 선택문문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
       Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
       int num= scan.nextInt();//키보드로 입력값을 받는다.
       /*/
        * 
        *  정수 : nextInt()
        *  실수: nextDouble()
        *  논리: nextBoolean()
        *  문자열:next()
        *  -----단점은 char는 읽지 못한다
        *            ----문자열로 읽어서 첫번재 문자를 자른다
        *                           ---------
        *                           charAt(0)
        *  
        *  
        */
		//결과값 출력 
       
       
		 if(num>=0)
		 {
			 System.out.println(num+"는(은) 양수입니다.");
	}
		 else
		 {
			 System.out.println(num+"는(은) 음수입니다.");
			 
		 }


	
		
		
		
	}

}
