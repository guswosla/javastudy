
/*2. 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다. 알맞은 코드를 넣으세요.


public static void main(String[] args) { 
    char ch = 'z'; 
    boolean b = ( 코드입력 ); 
    System.out.println(b); 
}*/



import java. util.Scanner;
public class answk_02 {



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner scan = new Scanner(System.in);
			 System.out.println("문자 입력:");
			 char ch=scan.next().charAt(0);
			 System.out.println("ch="+ch);
			boolean b=(ch>='A'&& ch<='Z' ||
					ch>='a' && ch<='z' ||
					ch>='0' && ch<='9'? true:false);
			
		  System.out.println(b);		
					
					
	

	}
}
