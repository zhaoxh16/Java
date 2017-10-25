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
		//������String���
		System.out.print(intToMonth(_month)+'/'+intToDay(_day)+'/'+intToYear(_year));
	}
	
	public void print2(){
		//��Ӣ��+�������
		System.out.print(intToEng(_month)+' ');
		System.out.print(_day);
		System.out.print(", ");
		System.out.print(_year);
	}
	
	public void print3(){
		//���������
		System.out.print(_year);
		System.out.print("��");
		System.out.print(_month);
		System.out.print("��");
		System.out.print(_day);
		System.out.print("��");
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
		year+='��';
		return year;
	}
	
	private String intToMonth(int m){
		String month = "";
		if(m == 10)
			month += "ʮ";
		else if(m == 11)
			month+="ʮһ";
		else if(m == 12)
			month+="ʮ��";
		else
			month+=intToChar(m);
		month+="��";
		return month;
	}
	
	private String intToDay(int m){
		String day = "";
		if(m == 10)
			day += "ʮ";
		else if(m == 20)
			day += "��ʮ";
		else{
			if(m<10)
				day+=intToChar(m);
			else if(m<20){
				day+="ʮ";
				if(m%10 != 0)
					day+=intToChar(m%10);
			}
			else{
				int a = m/10;
				int b = m%10;
				day+=intToChar(a);
				day+="ʮ";
				if(m%10!=0)
					day+=intToChar(b);
			}
		}
		day+="��";
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
		case 0:return '��';
		case 1:return 'һ';
		case 2:return '��';
		case 3:return '��';
		case 4:return '��';
		case 5:return '��';
		case 6:return '��';
		case 7:return '��';
		case 8:return '��';
		case 9:return '��';
		default: return '!';
		}
	}
	
	private int charToInt(char a){
		int y = 0;
		switch(a){
		case '��':y=0;break;
		case 'һ':y=1;break;
		case '��':y=2;break;
		case '��':y=3;break;
		case '��':y=4;break;
		case '��':y=5;break;
		case '��':y=6;break;
		case '��':y=7;break;
		case '��':y=8;break;
		case '��':y=9;break;
		case 'ʮ':y=10;break;
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
			//ֻ��һλ
			return charToInt(month.charAt(0));
		}else{
			//ʮһ��ʮ��������
			return 10+charToInt(month.charAt(1));
		}
	}
	
	private int dayStringToInt(String day){
		int length = day.length();
		if(length == 2){
			//һ������������ʮ
			return charToInt(day.charAt(0));
		}else if(length == 3){
			//ʮһ��ʮ����������ʮ�ţ���ʮ����ʮ
			int temp = charToInt(day.charAt(1));
			if(temp == 10){
				return 10*charToInt(day.charAt(0));
			}else{
				return temp;
			}
		}else{
			//��ʮһ����ʮ����������ʮ�ţ���ʮһ
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
