 //  
/*/
 * 
 * replace(char,char)
 * replace(String,String)=> char을 String으로 변경 
 * 
 * 
 */

public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.p
		String s="1상승";
		 String id=s.replaceAll("[가~힣]",""); 
		 String  state=s.replaceAll("[0~9]",""); 
	  System.out.println("id="+id);
	  System.out.println("state="+state);
	  System.out.println("A"+id);
	  
	  s="Hello Java!!";
	   String ss=s.replace('a', 'b');
     System.out.println(ss);	   
	ss=s.replace("Java","Python");
	 System.out.println(ss);
	  
	}

}
