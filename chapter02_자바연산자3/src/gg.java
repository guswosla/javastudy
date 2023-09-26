import java.util.Scanner;

public class gg {


	public static void main(String args[]) 
	{ 
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println(" 농구공 갯수:");
		 int ball=scan.nextInt();
		 System.out.println("필요한 상자의 수:"+(ball%5==0?ball/5:ball/5+1));
			
	    
		
	}

}
