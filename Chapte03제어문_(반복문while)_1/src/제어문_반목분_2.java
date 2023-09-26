//가위바위보=>10번==> 3승 2무 5패

import java.util.Scanner;
class A
{
	
	
}


public class 제어문_반목분_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int win=0, lose=0, same=0;
    
    int i=1;
    
   Scanner scan=new Scanner(System.in);//while문 안에 써도 되지만 반복됨
    
    while(1<=10)
       {
    	   System.out.println("====="+i+"번 째 게임======");
    	   int com=(int)(Math.random()*3);
    	  
    	   int user=0;
    	   //유효성 검사=> 원하는 값만 입력되게 유도
    	   while(true)
    	   {
    		   
    		   System.out.println("가위(0), 바위(1),보(2):");
        	  user=scan.nextInt();
        	   
    		   if(user<0 || user>2)
    		   {
    			   
    			   System.out.println("가위바위보를 입력하세요" );
    		   
    			   continue;//처음부터 수행이 가능(소속 while문만)
    		   }
    		   
    		   break;//종료하고 빠져나감 (소속 while문만)
     		   
    	   }
    	   
    	   
    	   System.out.println("컴퓨터:");
    	   if(com==0)
    		   System.out.println("가위" );
    	   else if(com==1)
    		   System.out.println("바위" );
    	   else if(com==2)
    		   System.out.println("보" );
    	   
    	   
    	   System.out.println("사용자:");
    	   if(user==0)
    		   System.out.println("가위" );
    	   else if(user==1)
    		   System.out.println("바위" );
    	   else if(user==2)
    		   System.out.println("보" );
    	   
    	   
    	 // 승패 결정
    	   int res=com-user;
    	   
    	   /*/
    	    * 
    	    *  컴퓨터-사용자
    	    * 
    	    *   컴퓨터      사용자
     	    *     가위(0)    가위(0) ==>0
    	    *               바위(1)==> -1 user
    	    *                보(2)==> -2
    	    * 
    	    *     바위(1)    가위(0) ==>1 com
    	    *               바위(1) ==>2
    	    *                보(2)==>-1
    	    *                
    	    *     보(2)     가위(0) ==>2
    	    *               바위(1)==>1           
    	    *               보 (2)==>0
    	    *     0이면 비기고 컴터가 이기는 경우, 1,-2
    	    *              사용자가 이기는 경우,-1,          
    	    *               
    	    */
    	   
    	   
    	   if(res==-1 || res==2)
    	   {
    		   System.out.println( " 사용자 win!");	
    		   win++;
    	   }
    	   else  if(res==1 || res==-2)
    	   {
    		   System.out.println( " 컴퓨터 win!");	
    		   lose++;
    	   }
    	   
    	   else  
    	   {
    		   System.out.println( "비겼다");	
    		   same++;
    	   }
    	   i++;
    	
    	   System.out.println( "");
    	   System.out.printf( "%d승, %d무, %d패\n", win, same, lose);
    	   
       }

	}

}
