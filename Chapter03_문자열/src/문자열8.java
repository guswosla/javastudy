import java.util.Scanner;  
//equals : 대소문자 구분 (==) equalsIgnore:대소문자 구분 x
public class 문자열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  final String MID="admin", MPWD="1234";
  Scanner scan=new Scanner(System.in);
  
  System.out.println("아이디 입력:" );
  String id=scan.next();
  
System.out.println("비밀번호 입력:" );
  String  pwd=scan.next();
  if(id.equalsIgnoreCase(MID) && pwd.equals(MPWD))
	  //equalsIgnore:대소문자 구분 x, equals대소문자 구분(검색어)
	  
  {
	  System.out.println( id+"님이 로그인 되었습니다.:" );
 
  }
  
  
  else 
	  
  {
	  
	  System.out.println("ID나 PASSWORDS가 틀렸습니다.:" );

  }
  
  
	}

}
