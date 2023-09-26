 import java.util.Scanner;

public class gg {

	
	//농구공 5개씩 한 박스에 들어간다. 40개면 8상자,26개면 6상자이다 
   // 삼항연산자를 이용해서 구현하시오==>총페이지 


	 public static void main(String args[]) 
	{ 
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" 농구공 갯수:");
		 int ball=scan.nextInt();
		// System.out.println("필요한 상자의 수:"+(ball%5==0?ball/5:ball/5+1));
		 
		// System.out.println("필요한 상자의 수:"+(ball%5==0  ? 값1 ball/5: 값2  ball/5+1));
	    
		// System.out.println("필요한 박스:"+(int)Math.cell(ball)); =>소수점 반올림 함수
	
	}
}
   