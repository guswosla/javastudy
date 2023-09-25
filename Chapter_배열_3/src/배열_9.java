
// => 정수를 10개 저장 => 3의 배수 

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr=new int[10];
     // 초기화
     //배열에 값 저장=> 수정=> 일반 for문 사용
     
     for(int i=0;i<arr.length;i++)
     {
    	 
    	 arr[i]=(int)(Math.random()*100)+1;
    	 
     }
		//저장된 값 출력=> 실제 값만 읽는 경우 
        //향상된 for문 => JDK1.5이상 => 배열/컬렉션이 있는 경우
        //                                --- 가변형 (정하지 않고 자유롭게)
     for(int i:arr)
     {
    	 
    	 System.out.println(i+" ");
    	 
     }
		
	 System.out.println("\n======결과값=======");
	 for(int i:arr)// 큰값은 가져오지만 int보다 작은 값은 가져오지 못함  double i:arr(o) char i: arr(x) 
	 {
		 if(i%3==0)
		 System.out.println(" "+i);
		 
	 }
	 
	 
	}

}
