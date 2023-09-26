



package chapter02_자바연산자3;
//1개의 정수를 입력 받아서 한개를 장가한 값을 출력 하시오	
/*/
 * a++
 * ++a
 * a+=1 
 * a=a+1
 * 
 * 
 * 	import java.util.Scanner;
 * 
 * 
 * int a= 1 
 * int b= a / ++
 *  
 *  
 *  
 * int a=1;
 * int b=a;
 *  a++
 * 
 * 
 */

import java.util.Scanner;
	
public class 단항연산자 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
        int a; 
		Scanner scan= new Scanner (System.in);
	    System.out.printf ("정수 입력");
	    a= scan.nextInt();
	    
	  // int a= 1
	    
	    a++;
	    a+=10;
	    
	    int b= ++a;
	    System.out.println("a="+a); //
	    System.out.println("b="+b); // 
		
	 System.out.println("=====부정연산자====");
		boolean bCheck= true;
		System.out.println("변경전:"+ bCheck);
				 bCheck =! bCheck;
	 System.out.println("변경"+bCheck);
			 boolean aa= true;
			 while (true)
			 {aa=!aa;
			 if(aa==true)
			 { 
				 System.out.println("사용자");
			 }
			 else {
				 
				System.out.println("컴퓨터");
			 }
			 }
	}

} 