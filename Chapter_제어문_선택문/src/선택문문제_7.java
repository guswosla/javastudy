import java.util.Scanner;


//정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 

   

public class 선택문문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;

		char op= ' ' ;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력:");
         num1= scanner.nextInt();
		

		System.out.println("두번째 정수 입력:");
        num2= scanner.nextInt();

		System.out.println("연산자입력(*,/,+,-)");
        op= scanner.next().charAt(0);

		switch(op)

		{

		case '+':
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case '-':
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case '*':
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case '/':
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			break;
		default: 

		System.out.println("잘못 된 연산자입니다.");

		}

		
		}
		
	}




