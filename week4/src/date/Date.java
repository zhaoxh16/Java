package date;

public class Date {

	public Date(String month, String day,String year){
		_year = yearStringToInt(year);
		_month = monthStringToInt(month);
		_day = dayStringToInt(day);
	}
	
	public Date(String month, int day, int year){
		_month = englishToInt(month);
		_year = year;
		_day = day;
	}
	
	public Date(int year,int month, int day){
		_year = year;
		_month = month;
		_day = day;
	}
	
	public void print1(){
		//用三个String输出
		System.out.print(intToMonth(_month)+'/'+intToDay(_day)+'/'+intToYear(_year));
	}
	
	public void print2(){
		//用英文+数字输出
		System.out.print(intToEng(_month)+' ');
		System.out.print(_day);
		System.out.print(", ");
		System.out.print(_year);
	}
	
	public void print3(){
		//用数字输出
		System.out.print(_year);
		System.out.print("年");
		System.out.print(_month);
		System.out.print("月");
		System.out.print(_day);
		System.out.print("日");
	}
	
	private String intToYear(int y){
		String year = "";
		char[] a = {0,0,0,0};
		int i = 3;
		while(y!=0){
			int t=y-y/10*10;
			y=y/10;
			a[i--] = intToChar(t);
		}
		for(i=0;i<4;i++){
			if(a[i] == 0)
				continue;
			else
				year+=a[i];
		}
		year+='年';
		return year;
	}
	
	private String intToMonth(int m){
		String month = "";
		if(m == 10)
			month += "十";
		else if(m == 11)
			month+="十一";
		else if(m == 12)
			month+="十二";
		else
			month+=intToChar(m);
		month+="月";
		return month;
	}
	
	private String intToDay(int m){
		String day = "";
		if(m == 10)
			day += "十";
		else if(m == 20)
			day += "二十";
		else{
			if(m<10)
				day+=intToChar(m);
			else if(m<20){
				day+="十";
				if(m%10 != 0)
					day+=intToChar(m%10);
			}
			else{
				int a = m/10;
				int b = m%10;
				day+=intToChar(a);
				day+="十";
				if(m%10!=0)
					day+=intToChar(b);
			}
		}
		day+="日";
		return day;
	}
	
	private String intToEng(int m){
		switch(m){
		case 1:return "January";
		case 2:return "February";
		case 3:return "March";
		case 4:return "April";
		case 5:return "May";
		case 6:return "June";
		case 7:return "July";
		case 8:return "August";
		case 9:return "September";
		case 10:return "October";
		case 11:return "November";
		case 12:return "December";
		default: return "";
		}
	}
	
	private char intToChar(int a){
		switch(a){
		case 0:return '〇';
		case 1:return '一';
		case 2:return '二';
		case 3:return '三';
		case 4:return '四';
		case 5:return '五';
		case 6:return '六';
		case 7:return '七';
		case 8:return '八';
		case 9:return '九';
		default: return '!';
		}
	}
	
	private int charToInt(char a){
		int y = 0;
		switch(a){
		case '〇':y=0;break;
		case '一':y=1;break;
		case '二':y=2;break;
		case '三':y=3;break;
		case '四':y=4;break;
		case '五':y=5;break;
		case '六':y=6;break;
		case '七':y=7;break;
		case '八':y=8;break;
		case '九':y=9;break;
		case '十':y=10;break;
		}
		return y;
	}
	
	private int yearStringToInt(String year){
		int y = 0;
		for(int i=0;i<year.length()-1;i++){
			y*=10;
			y+=charToInt(year.charAt(i));
		}
		return y;
	}
	
	private int monthStringToInt(String month){
		int length = month.length();
		if(length == 2){
			//只有一位
			return charToInt(month.charAt(0));
		}else{
			//十一，十二，……
			return 10+charToInt(month.charAt(1));
		}
	}
	
	private int dayStringToInt(String day){
		int length = day.length();
		if(length == 2){
			//一，二，……，十
			return charToInt(day.charAt(0));
		}else if(length == 3){
			//十一，十二，……，十九，二十，三十
			int temp = charToInt(day.charAt(1));
			if(temp == 10){
				return 10*charToInt(day.charAt(0));
			}else{
				return temp;
			}
		}else{
			//二十一，二十二，……二十九，三十一
			return 10*charToInt(day.charAt(0))+charToInt(day.charAt(2));
		}
	}
	
	private int englishToInt(String month){
		if(month.equals("January"))
			return 1;
		else if(month.equals("February"))
			return 2;
		else if(month.equals("March"))
			return 3;
		else if(month.equals("April"))
			return 4;
		else if(month.equals("May"))
			return 5;
		else if(month.equals("June"))
			return 6;
		else if(month.equals("July"))
			return 7;
		else if(month.equals("August"))
			return 8;
		else if(month.equals("September"))
			return 9;
		else if(month.equals("October"))
			return 10;
		else if(month.equals("November"))
			return 11;
		else if(month.equals("December"))
			return 12;
		return -1;
	}
	private int _year;
	private int _month;
	private int _day;
}
