

// 정수 1개를 받는다
// 1 입력되면=> 메모장 켜짐, 2 => 그림판 , 3 => 브라우저 
//=> 메뉴 클릭 / 버튼 클릭시 처리=> GUI  

import java. util.Scanner;

public class 제어문_조건문_3_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        int no=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("번호 선택(1,2,3):");
        no= scanner.nextInt();
         
         if(no==1)
         {
        	 System.out.println("메모장):");
         }
         else  if(no==2)
         {
        	 System.out.println("그림판");
         }
         else if(no==3)
         {
        	 System.out.println("브라우저");
        	 Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        	 // 바탕화면 설정 주소 복사 붙여넣기=> "C:\Program Files\Google\Chrome\Application\chrome.exe"=> 앞뒤로 "\" 없애주고 C:\\로 바꾸기
        	 
        	 
        	 /*/
        	  * 
        	  *  \n
        	  *  \t
        	  *  \"
        	  *  \\
        	  * 
        	  * 
        	  * 
        	  */
        	 
         }
         else
         {
        	 
         }
         }
         
         
	}


