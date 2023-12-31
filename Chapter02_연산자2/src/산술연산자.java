
/*/
 * 
 * 1. 실행순서
 * ==>  자바파일명과 클래스명 동일(대소문자)\
 *  A.javac(컴파일)=>0,1                    java(인터프리터)
 *  ---------==================>  A.class =============> 실행
 *     |                         바이너리코드
 *    원시소스(프로그래머)          모든 운영체제에 호한
 *    ==>이클립스: javac + java => ctrl+ F11
 *    
 *  
 * 2. 소스 코드의 주의점
 *   1) 대소문자 구문
 *   2) 명령문=>;
 *   3) 주석
 *   4) 들여쓰기 => { => 엔터 (열면 자동으로 들여쓰기) }  
 *    
 * 3. 자바개발자 약속
 * 
 * 1) 변수 / 클래스 / 메소드 / 상수 / 인터페이스 
 * 
 * 변수 : 소문자 시작 => 다른 단어는 첫자 대문자
 *    Filename, file_name
 * 상수: 도믄 알파벳 대문자
 *    MAX, MIN....   
 *    
 * 클래스, 인터페이스 : 첫자는 대문자 ==> MainClass (주의)
 * 메소드는 변수와 동일
 * 
 * *** 프로그램 (데이터 관리) 
 *     데이터 저장
 *       = 메모리에 저장 => 프로그램의 종료와 동시에 사라진다
 *       한개의 데이터 관리=>변수 
 *       =>기본형으로 메모리 크기 결정 
 *       정수
 *       byte / int (4byte) / long (8byte)
 *       문자
 *       char(2byte)
 *       실수
 *       float (4byte)/ double (8byte)
 *       논리 
 *       boolean (1byte)
 *       
 *       
 *       여러개의 데이터 관리=> 배열/ 클래스 (사용자 정의=> 참조형)   
 *       int + double + char
 *       
 *       --------------------
 *       = 파일에 저장
 *       = RMBMS (오라클)
 *       ---------------------영구적인 저장 장치
 * 4. 변수 / 연산자 / 제어문 / 데이터  모아서 관리 / 재사용 / 예외처리 
 * => 라이브러리 이용한 조립식 
 * 5. 응용 : 네트워크 , 파일 
 * -------------------------------------------------
 * 
 * 오라클 (21c) : CURD(추가, 수정, 삭제, 검색)
 * 
 * -------------------------------------------------필수
 * 
 * 브라우저 연동" HTML5/ CSS3/ JavaScript
 *                         ------------Jequry(Ajax)
 *                         ------------VueJs(Vuex)
 *                         ------------ReactJs(Redux)
 *                         옵션---------TyperScript/NodeJS
 *                                                ------
 *                                                   |
 *                                                실시간 상담 
 * 
 *   JSP =>Back -end + Front-End
 *   ----MVC (SpringMVP => 직업 Spring 제작)
 *   
 *    DataBase연동 => mYbATIS/ jpa
 *    Spring 
 *    Spring- Boot :ThymeLeaf
 *    AWS => paaS ==> ES2   
 *    ------------------------
 *    
 *    Python : 데이터분석, 시각화
 *            Pandas  / Numpy / MatplotLab
 *             옵션: 머신러닝/ 딥러닝
 *             -----------------
 *   변수: 메모리에 한개 데이터하는 공간의 별칭           
 *        ----주소 
 *        
 *        변수명 설정
 *        --------
 *        1. 알파벳 시작 (대소문자 구분) , 한글 
 *        2. 숫자 사용 가능 (앞에 사용 금지)
 *        3. 키워드는 사용 금지
 *        5. 공백없이 사용
 *        5. 특수문자 (_,$)
 *        6. 기타사항=> 압축(3~7)=> i , j
 *    --------------------------------------
 *    변수 선언 방식
 *    데이터형 변수명;
 *    변수의 초기화
 *    변수명=값;
 *    변수의 활용
 *    변수명=값 (수정) ==> 자동으로 {}을 벗어나면 자동 삭제 
 *    변수의 종류=======> 지역변수 {}  
 *    
 *   데이터를 저장 ===> 데이터를 가공 ====> 가곤된 데이터 출력
 *                       |             화면에 출력
 *                      연산자
 *                      제어문     
 *                      ----메소드 
 *  1.산술연산자
 *  + , - , * , / , % 
 *  1) 연산은 같은 데이터형끼리 연산된다
 *    10.5 + 10= 20.5
 *   ----   ---
 *   double int
 *           | 변경
 *          double 10.0 (자동 형변환)
 *  10.5+10.0 => 20.5  
 *   'A' + 1 
 *   ---  ----
 *   char < int
 *   ---------> int 변환
 *   65   + 1  ===> 66
 *   
 *   10.5 + (double) 10 => 강제 형변환
 *   
 *   크기
 *   ==================>자동 형변환
 *   
 *   byte < char < int < long < float < double
 *          short(c언어호환) 
 *        <===============강제 형변환
 *   *** int 이하 데이터형 (byte, char, short)
 *   =>연산이 되면=> 결과값은 int
 *     char + char = int
 *     byte + byte = int
 *     
 *  2) +: 산술 처리, 문자열 결합        
 *      = '' 문자
 *      = "" 문자열
 *     예) 
 *         7+"7"+7    
 *         ----
 *         "77" +7
 *         ---------> "777"
 *         7+7+"7"
 *         --
 *         14+"7"==>  "147"
 *         7+"7"+7-5 ===>오류나는 코드
 *         7+"7"+(7-5)===>"772"
 *         
 *         7+"7"+ 7*2====>"7714" 곱하기, 나누기는 먼저계산 (우선순위라 오류 안 남)
 *                -----
 *                14
 *    산술 => 왼쪽에서 오른쪽으로 연산
 *         *,/,%은 +,- 보다 우선 순위
 *         => 우선순위를 변경할 때는 ()
 *     /
 *     ==>1) 정수/정수=정수
 *            10/3 => 3
 *             5/2 => 2
 *        2)0으로 나누면 오류 발생 (주의)    
 *    
 *   %
 *   ==> 부호기 왼쪽 부호가 낳느느다
 *   - % + ==> -
 *   - % - ==> -
 *   + % - ==> +
 *   + % + ==> +                  
 *  
 *  형변환 (연산 처리 있을 때 발생)
 *  
 *   int a ="A"; ===> a=65
 *   int a =(int)10.5;
 *   double d=10; ==> d=10.0                   
 *   
 *   왼쪽  <= 오른쪽                   
 *                     
 *                 
  */              
// 3개 정수 (1~100) => 총합, 평균

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =(int) (Math.random()*100+1);
//                 0.0~0.99*100=> 0.0~99.0
//       ------------------- 0~99+1=100 		
		int b =(int) (Math.random()*100+1);
		int c =(int) (Math.random()*100+1);
		
 System.out.println("a="+a+",b="+b+", c="+c);	
 
 int total= a+b+c;
 
 System.out.println("총점:"+total);
 
 double  avg=total/ 3.0;
 
 System.out.printf("평균: %.2f\n", avg);
 /*
  * 실수: %f %.f %.3f
  * 정수:%d
  * 문자: %c
  * 문자열:%s
  * 
  * 
  * 
  */
 System.out.println("===============");
 System.out.println("aaa");
 System.out.println("bbb");	
 
 
 //printf 주의
 
		
	}

}
