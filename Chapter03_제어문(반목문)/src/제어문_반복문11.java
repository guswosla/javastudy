// 20개의 정수 난수 발생 => 짝수, 홀수 

public class 제어문_반복문11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
        
   int even=0, odd=0 , a3=0, a5=0, a7=0; 
        
        for (int i=0;i<20;i++)
        {
        	int rand=(int)(Math.random()*10)+1;
        	System.out.print(rand+" ");
        	if(a3%3==0)
        		
        		a3++;
        	if(a5%5==0)
        		
        		a5++;
             if(a7%7==0)
            a7++;
        	

        }
		
        
        System.out.println("=======결과값======== ");
        System.out.println("짝수의 갯수"+even);
        System.out.println("홀수의 갯수"+odd);
        System.out.println("짝수의 갯수"+a3);
        System.out.println("짝수의 갯수"+a5);
        System.out.println("짝수의 갯수"+a7);
  /*/
   * 
   * 
   * 
   * for문 수행시에=> 수열 (숫자마다 패턴을 가지고 있어야 반복문이 수행된다)
   * 
   * 1-2+3-4+5-6+7=8=>가능
   * 
   * 
   *   
   * 
   * 
   * 
   */
        
         int sum=0;
         for(int i=1; i<=10; i++)
         {
        	 
        	 if(i%2==0)
        		 sum-=i;
        	 else
        		 sum+=i;
          }
        
        
        //BDFHJLN
         for(char c='B'; c<='N'; c+=2)//c+=2는 c에서 증거하는 만큼 c+=2는 d
        	 {
        	 System.out.println(c+" ");
        	 
        	 }
       
         
        
        
        
	}
	
}
