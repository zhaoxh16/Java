package lab;

public class MyException extends Exception {
	private String message;
	public MyException() {
		message = "";
	}
	
	public MyException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
}
