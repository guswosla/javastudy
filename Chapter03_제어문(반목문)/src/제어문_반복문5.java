
//1~100까지=>3의 배수, 5으;ㅣ 배수 합,7의 배수 합=> 출력

public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
 int num3=0, num5=0, num7=0;
	
  
  for(int i=1; i<=100; i++)
	  
  {
	  if(i%3==0) //15
		  num3+=i;
      if(i%5==0)	
	      num5+=i;//15
	  if(i%7==0)	 
		  num7+=i; 
	
	  
	  
  }
		
	System.out.println("1~100까지의 3의 배수의 합:" +num3);	
	System.out.println("1~100까지의 5의 배수의 합:" +num5);	
	System.out.println("1~100까지의 7의 배수의 합:" +num7);	
	}

}
