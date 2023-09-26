import java.util.Scanner;
//startsWith,endsWith,contains=> 검색기, 자동완성기
public class 문자열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String[] data= {
    	   "Java와 JSP",
    	   "Java와 Oracle",
    	   "Oracle Programming",
    	   "JQery AND AJX",
    	   "JQery AND Javw"
    	
    		
    };
		
    Scanner scan=new Scanner(System.in);
    System.out.println("검색어 입력:");
     String findData=scan.nextLine(); //next는 공백 앞에 문자만 nextLine은 전체를 가져옴 
     System.out.println(findData);
    
    for(int i=1; i< data.length; i++)
     
    {
    	
    	if(data[i].contains(findData))  //if(data[i].startsWith(findData))
    		                            //if(data[i].endsWith(findData))
    		                            //contains:  
    	{
    		try 
    		{
    			
    			Thread.sleep(1000);
    			 
    			
    		}catch(Exception ex) {}
    		System.out.println(data[i]);
    		
    		
    		
    	}
    	
    }
    	
    
	}

}
