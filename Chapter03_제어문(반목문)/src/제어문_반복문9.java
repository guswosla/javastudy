

/*/
 * 
 * Updown 게임
 * -----------
 *  컴퓨터 난수 발생:1~100
 *  -----------------
 *  => 힌트
 *     ---
 *     => 정답 나올때까지 반복수행
 *     ----------------------> 무한루프
 *     for(;;) => 무한루프 ==> while(true)
 *    
 *    
 *    
 */

import java.util.Scanner;
//import java.lang.*=>ex:String, Math 등에 자동으로 추가됨
public class 제어문_반복문9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // 난수 발생
	int com=(int)(Math.random()*100)+1;	
		
 // 종료=> break;, System.exit(0);=>정상 종료 , (1);=>비정상 종료 	
	Scanner scan= new Scanner(System.in);
	int count=0;
	for(;;)// 무한루프 
		
	  {	
		  System.out.print("1~100까지 사이의 값 입력");
		  int user=scan.nextInt();
		  if(user<1 || user>100)
		  {
			  System.out.println("잘못입력입니다...");
			  continue;
		  }
		  count++;
		  //hint
		  if(com>user)
		  {
			  System.out.println("높은 정수 입력(UP)");
		  }
		  else if(com<user)
		  {
			  System.out.println("낮은 정수 입력(DOWN)");
		  }
		  else //정답 
		  {
			  System.out.println("GAME OVER!");
			  System.out.println("입력횟수:"+count);
			  System.exit(0);//프로그램 종료
		  }
		  
		  
      }
	
	//+-는 0부터 시작, */는 1로 시작
	//continue;=> 다시 돌아가라
    //return; 생략중...?
	
	}
}
