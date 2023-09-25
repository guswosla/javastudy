import java.util.Calendar;
import java.util.Scanner;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:" );
		int year=scan.nextInt();
		System.out.println("월 입력:" );
		int month=scan.nextInt();
		System.out.println("일 입력:" );
		int day=scan.nextInt();
		
		
		Calendar cal=Calendar.getInstance();
		
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,day);
		
		char[] strWeek= {'일','월','화','수','목','금','토'};
		int week=cal.get(Calendar.DAY_OF_WEEK);//요일일기
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "
				+strWeek[week-1]+"요일입니다."
		);
	}

}


/*	char[] strWeek= {' ', '일','월','화','수','목','금','토'};
		int week=cal.get(Calendar.DAY_OF_WEEK);//요일일기
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "
				+strWeek[week]+"요일입니다." =>공백을 채우던가, week-1
		);
	}

}
*/
