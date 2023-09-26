

import java.util.Scanner;

public class 삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컴퓨터먼저내기
 int com=(int)(Math.random()*3); // 0,1,2
 //사용자 입력
 Scanner scan = new Scanner(System.in);
 System.out.print("가위(0),바위(1), 보(2) 중 하나를 입력해주세요:");
 int user=scan.nextInt();
 //확인
 
 
 System.out.print("컴퓨터:");
 System.out.print(com==0?"가위":"");
 System.out.print(com==1?"바위":"");
 System.out.print(com==2?"보":"");
System.out.println();
System.out.print("플레이어:");
System.out.print(user==0?"가위":"");
System.out.print(user==1?"바위":"");
System.out.print(user==2?"보":"");
 System.out.println("\n=============");
 System.out.print(com-user==-1||com-user==2?"사용자 Win":"");
 System.out.print(com-user==-2||com-user==1?"컴퓨터 Win":"");
 System.out.print(com-user==0?"비겼다":"");
 
	}

}


/*
 * 
 * 
 * 
 * 컴퓨터와 가위바위보 (0,1,2)
 * 
 * 0=> 가위
 * 1=> 보
 * 2=> 바위
 * 
 * =>1. 컴퓨터 난수 발생
 * =>2. 사용자 입력 
 * => 컴퓨터, 사용자의 가위바위보로 출력
 * => 결과값 
 *    ----
 *    컴퓨터  사용자 
 *     가위(0)
 *          가위(0) Same  0  
 *          바위(1) Win  -1
 *          보(2)  Lose  -2
 *      
 *     바위(1)
 *         가위(0) L   1 
 *         바위(1) S   0  
 *         보(2)  W   -1
 *     
 *     보(2) 
 *        가위(0)  L  2
 *        바위(1)  S  1 
 *        보(2)   W  0
 *  
 *     0이나 -1이면  w가 나온다
 *     
 * 
 * /
 */
