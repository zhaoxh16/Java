package lab;

public class Test {
	public static void main(String args[]) {
		int myInt = 0;
		myInt = Lab13.readKeyboardInt();
		int result = 0;
		try {
			result = Lab13.approach(myInt);
			System.out.println(result);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		double myDouble = 0.7;

		try {
			result = Lab13.approach(myDouble);
			System.out.println(result);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
