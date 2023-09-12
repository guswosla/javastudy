

/*
 * 
 * 
 * 41page =>  증감 (원하는 갯수만큼) => 복합 대입 연산자
 * 
 * 
 * op=
 * +=(o)
 * -=(o)
 * *=
 * ^=
 * &=
 * \=
 * >>=
  *<<=		 
 * 
 *  한개 증가
 * ----------
 * int a=10;
 * a++, ++a, a= a+1 ===> a+1
 * -------
 * 두개 증가
 * 
 * a++;
 * a++;
 * 
 * a=a+2 ==> a+=2
 * 
 * a--, --a
 * a=a-1, a-=1 ==> 문자열 누적, 숫자 누적 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class 복합대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		//a를 100증가...
		a+=100; // a= a+100
		
		System.out.println(a);
         a-=50;
        System.out.println(a);   
        
/*/
 * 
 *  변수 수정
 *  int a=10;
 *  a=50;(int 선언 여러번 안 함)
 * 
 * int 이미 쓰고 또 쓰려면 {} 으로 닫고 쓰기 
 * 
 * {} 안에 변수를 지역변수라 한다
 *       
 */
	}

}
