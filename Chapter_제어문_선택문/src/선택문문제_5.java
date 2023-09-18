

public class 선택문문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int kor=(int)(Math.random()*101);
    int eng=(int)(Math.random()*101);
    int math=(int)(Math.random()*101);
    System.out.println("국어점수입니다"+kor);
    System.out.println("영어점수입니다"+eng);
    System.out.println("수학점수입니다"+math);
    System.out.println("총점입니다"+(kor+eng+math));
    double avg=(kor+eng+math)/3.0;
    System.out.printf("평균입니다:%.2f\n", avg);
    
    //학점
    
    char score='A';
    if(avg>=90)
    	score='A';
    else if(avg>=80)
    	score='B';
    else if(avg>=70)
    	score='C';
    else if(avg>=60)
    	score='D';
    else 
    	score='F';
    System.out.println("학점:"+score+"학점");
	}

}
