
//1~100=> 루프(변경) 변수 
// 총합 , 짝수합, 홀수합 ==> 누적변수
public class 제어문_반목문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum=0, even=0, odd=0;
       //=> 0 => 장바구니 => 결제금액
       for(int i=1; i<=100; i++)
       {
    	    sum+=i; // sum=sum+i
   // 	    System.out.println("sum="+sum+",i="+i);
       
    	    if(i%2==0)
    	    	even+=1; // 짝수누적=> 짝수의 합
    	    else 
    	    	 odd+=i;// 홀수 의 합
    	    
       }
       System.out.println("짝수 합:"+ even);
       System.out.println("홀수 합:"+odd);
       System.out.println("총합:"+sum);
       
	}

}
