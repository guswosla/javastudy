
/*/
 * 
 *    단일 조건문은 true일 경우에 처리=>false는 건너뛴다 
 *    선택 조건문 => true일 때 처리, false일 때 처리를 나눠서 작업
 *    -------  예) 아이디 중복체크 
 *                  중복일 경우 ==> 이미 사용중인 ID 입니다
 *                  중복일 아닐 경우 => 사용이 가능한 ID
 *    형식) 
 *        if(조건문)
 *        {
 *         // 조건문이 ture일 경우
 *        }
 *        else
 *        {
 *         // 조건문이 false일 때 처리
 *        }
 *        ===> 간결하게 처리 삼항연산자 (웹,게임)
 *        
 *        => 짝수/홀수 
 *        => 대문자 / 소문자 
 *        => 웹 => 페이지 눌렀을 때 처리 
 * 
 * 
 */


public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c='A';
		
		//대문자/ 소문자 확인
		
		/*if (c>='A' && c<='Z') //대문자 여부 확인
		{
		  System.out.println(c+"대문자");	  
		}
		if (c>='a' && c<='z')
		{
		  System.out.println(c+"소문자");	  
		} */
		
		if (c>='A' && c<='Z') //대문자 여부 확인
		{
		  System.out.println(c+"대문자");	  
		}
		else
		{
		  System.out.println(c+"소문자");	  
		}
		
		// else 문장은 독립적으로 사용 불가 => if문과 같이 사용
		// else 문장을 바로 위에 있는 if만 지원한다  
		/*
		 * if ()
		 * {
		 * }
		 * -------------독립문장
		 * if()
		 * {
		 * }
		 * -------------독립문장
		 * if()
		 * {
		 * }
		 * else
		 * {
		 * 
		 * }
		 * ---------------
		 * 
		 * 
		 * 
		 */
		int a=10;
		if(a%2==0)
		{
			 System.out.println( a+"는 (은) 짝수입니다.");	 
		}
		else 
		{
			System.out.println( a+"는 (은) 홀수입니다.");	
		}
	
		
		
		
    	}	
	}

