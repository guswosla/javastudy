/*/
 * 
 * increment() =>num 1
 * increment() =>num 1 
 * increment() =>num 1
 * 
 * 
 */
public class 메소드_8 {
	static void increment()
	{
		
		int num=1;//지역변수(메소드 안에서만 사용)
		          //증가 되는 거 아님 처음부터 시작하고 사라지는 것
		System.out.println(num);
		num++; //=>증가 되는 거 아님 지역변수는
		//처음부터 시작하고 사라지는 것
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		increment();
		increment();
		increment();
		
		
	}

}
