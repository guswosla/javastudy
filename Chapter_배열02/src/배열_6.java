//1~100=>10개 저장==> 변수(x), 배열(o)
//=>1. 총합 
//=>2. 평균
//=>3. 최대값
//=>4. 최소값
//=>5. 최대값의 위치
//=>6. 최소값의 위치==>index 
  //초기화 

import java.util.Arrays;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // int[] arr=new int[10];
  //초기화 

  
  int[] arr= {10,20,30,40,50,30,20,10,30,50,};
/*
for(int i=0; i<arr.length; i++)
  {
 arr[i]=(int)(Math.random()*100)+1;
  
  }*/
	
  System.out.println("======저장된 값=======" );
  System.out.println(Arrays.toString(arr));
  
  
  int sum=0;
  for(int i:arr)
  {
	  
	  sum+=i;
	  
  }
  
  System.out.println("총합:"+sum);
  System.out.printf("평균:%2f\n",sum/10.0 );
  
  int max=0,min=100;
  for(int i:arr)
  {
	  if(max<i)
		  max=i;
	  if(min>i)
		  min=i;
	  
  }
  
  System.out.println("최대값:"+max );
  System.out.println("최소값:"+min );

  // 인덱스 
  int index=0;
  for (int i=0; i<arr.length;i++)
  {
	  if(max==arr[i])
	  {
		  index=i; //같은 값일 때 인덱스에 같은 값을 넣어주고 빠져나감
		  break;
	  }
	  
  }
  
  System.out.println("max 값 위치=>"+(index+1)+"번째 위치입니다" );
 
 //각각 위치 값을 잡을 때는 for문 따로 잡기
  
  for (int i=0; i<arr.length;i++)
  {
	  if(min==arr[i])
	  {
		  
		  System.out.println("min 값 위치=>"+(i+1)+"번째 위치입니다" );
		  //index=i; //같은 값일 때 인덱스에 같은 값을 넣어주고 빠져나감
		 // break;
		  // for문안에 위치값을 넣으면 중복되는 값이 모두다 출력.  
		  
	  }
	  
  }
  
  //System.out.println("min 값 위치=>"+(index+1)+"번째 위치입니다" );
  
  
  
}

}
