package datachooser;

public class Test {
	public static void main(String args[]) {
		DataChooser dc = new DataChooser();
		dc.readData();
		dc.sort(0, dc.size);
		dc.show();
	}
}
