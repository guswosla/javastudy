// 사칙연산
//정수 2개 => 연산자 (문자열)
//정수 3개 => 1개 결과값
import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num1,num2;
   int result=0;//=> 반드시 초기값. 
   Scanner scanner = new Scanner(System.in);
   // 초기화 
  System.out.println("첫번째 정수 입력:");
  num1= scanner.nextInt();
  
  System.out.println("두번째 정수 입력:");
  num2= scanner.nextInt();
  
  System.out.println("연산자입력(*,/,+,-)");
  num2= scanner.nextInt();
  
  switch(scanner.next())
  {
  case "+":
	   result =num1+num2;
	   break;
  case "-":
	   result =num1-num2;
	   break;
  case "*":
	   result =num1*num2;
	   break;
  case "/":
	   result =num1/num2;
	   break;
  default: 
	  System.out.println("잘못된 연산자입니다.");
	  
  }
  System.out.println("계산 결과값:"+result);
	}

}
