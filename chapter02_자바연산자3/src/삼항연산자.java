
//if~else
//(조건)?값1: 값2
//조건: true =>  값1
//조건: flase => 값2
//java.lang.* String,System,Math
//


public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a=(int)(Math.random()*100)+1; 
          //        0.0~99.0=> 0~99+1 1~100
          //Random r=new Random()r. next(100)
          System.out.println(a%2==0?a+"는(은) 짝수다":a+"는(은) 홀수다");
          
     char ch='a';
    		 
          
  char c=(char)((Math.random()*26)+65); // (Math.random()*26)+65 전체를 캐릭터로 변환하기 위해 () ==>A~Z      
     int s=(int)(Math.random()*2);//0,1
     ch=s==0? c:(char)(c+32); // +32는 대문자를 소문자로 변함 C=>소문자 0=>대문자
     //'A'+32 =>  97    'a'
  System.out.println(ch>='A' && ch <='Z'?ch+"s는(은) 대문자입니다":c+"는(은) 소문자입니다");
  
  
	}

}
