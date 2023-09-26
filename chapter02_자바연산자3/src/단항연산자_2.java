/*/
 * 
 * 형변환 연산자
 * (int)값
 * 
 * ==> 크기
 * 
 * byte < char < int < long < float < double
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class 단항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=65;
   double d=(double)a;
   // 생략이 가능
   char c=(char)a;
   // 특수한 경우 => 생략이 가능(실제 값 대입)
   //char c= 65
   // 연산처리가 되면 생략할 수 없다
  System.out.println("a="+a);
  System.out.println("d="+a);
  System.out.println("c="+a);
  c='A';
  System.out.println(c); // '0'=48, 'a'=97, 'A'=65 값 외우기
  System.out.println("c="+(int)c);
  
	}

}
