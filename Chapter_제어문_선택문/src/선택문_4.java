
public class 선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char score=(char)((Math.random()*6)+65);
		//A B C D E F
		System.out.println("score=" +score);
	  switch(score)
	  {
	  default:
		   System.out.println("존재하지 않는 등급입니다.");
		   break;
	  case'A':
	  System.out.println("A는 90~100 사이의 정수 입니다.");
	      break;
	  
	  case'B':
	  System.out.println("A는80~89사이의 정수입니다.:");
	      break;
	  
	  case'c':
	  System.out.println("A는 70~79사이의 정수입니다.");
	      break;
	  
	  case'D':
	  System.out.println("A는 60~69 사이의 정수 입니다.");
	      break;
	  
	  case'E':
	  System.out.println("A는 50~59 사이의 정수 입니다.");
	      break;
	           
	  
	  
	  
	  }
	  }
	}


