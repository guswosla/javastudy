//
// Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라 => 양수를 출력하라

import java.util.Scanner;

public class 선택문문제_3 {

	int num;
    Scanner scan=new Scanner(System.in);
    System.out.print("정수 입력:");
    num=scan.nextInt();
    int result=0;
    if(num<0)
      result=num*-1;
    else
    	result=num;
    System.out.println(num+"의 절대값은 "+Math.abs(num)+"입니다");
}


	}
